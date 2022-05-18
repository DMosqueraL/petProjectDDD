package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.events.FacturaCreada;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.events.FacturaGenerada;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.events.ReclamoGenerado;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

public class Factura extends AggregateEvent<IdFactura> {
    protected DetalleFactura detalleFactura;
    protected Map<IdProducto, Producto> productos;
    protected DocumentoUsuario numeroIdentificacion;
    protected Cantidad cantidadProducto;

    public Factura(IdFactura idFactura,
                   DetalleFactura detalleFactura,
                   DocumentoUsuario numeroIdentificacion,
                   Map<IdProducto, Producto> productos,
                   Cantidad cantidadProducto) {
        super(idFactura);
        appendChange(new FacturaCreada(detalleFactura, productos, numeroIdentificacion, cantidadProducto)).apply();
        subscribe(new FacturaEventChange(this));
    }

    private Factura(IdFactura idFactura){
        super(idFactura);
        subscribe(new FacturaEventChange(this));
    }

    public static Factura from(IdFactura idFactura, List<DomainEvent> events){
        var factura = new Factura(idFactura);
        events.forEach(factura::applyEvent);
        return factura;
    }

    public void generarFactura(DetalleFactura detalleFactura,
                               DocumentoUsuario numeroIdentificacion,
                               Map<IdProducto, Producto> productos,
                               Cantidad cantidadProducto){

        var idFactura = new IdFactura();
        appendChange(new FacturaGenerada(idFactura, detalleFactura,
                numeroIdentificacion, productos, cantidadProducto)).apply();
    }

    public void generarReclamo(IdFactura idFactura, DocumentoUsuario documentoUsuario){
        appendChange(new ReclamoGenerado(idFactura, documentoUsuario)).apply();
    }

    public DetalleFactura DetalleFactura() {
        return detalleFactura;
    }

    public Map<IdProducto, Producto> Productos() {
        return productos;
    }

    public DocumentoUsuario NumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public Cantidad CantidadProducto() {
        return cantidadProducto;
    }
}
