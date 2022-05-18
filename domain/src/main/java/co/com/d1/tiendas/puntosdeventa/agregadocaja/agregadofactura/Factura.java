package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

public class Factura extends AggregateEvent<IdFactura> {
    public DetalleFactura detalleFactura;
    public Map<IdProducto, Producto> productos;
    public DocumentoUsuario numeroIdentificacion;
    public Cantidad cantidadProducto;

    public Factura(IdFactura idFactura,
                   DetalleFactura detalleFactura,
                   DocumentoUsuario numeroIdentificacion,
                   Map<IdProducto, Producto> productos,
                   Cantidad cantidadProducto) {
        super(idFactura);
        this.detalleFactura = detalleFactura;
        this.numeroIdentificacion = numeroIdentificacion;
        this.productos = productos;
        this.cantidadProducto = cantidadProducto;
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
        this.detalleFactura = detalleFactura;
        this.numeroIdentificacion = numeroIdentificacion;
        this.productos = productos;
        this.cantidadProducto = cantidadProducto;
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
