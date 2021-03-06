package co.com.d1.tiendas.puntosdeventa.agregadocaja;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.Factura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.*;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.*;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

/**
 * [A] Agregado Caja. Gestiona al agregado Factura y a la entidad EquipoComputo.
 * Contiene los comportamientos:
 * crearfactura - imprimirFactura - reemplazarEquipoComputo - generarReclamo - asignarTipoCaja
 */
public class Caja extends AggregateEvent<IdCaja> {
    protected IdFactura idFactura;

    protected IdEmpleado idEmpleadoCaja;

    protected Factura factura;
    protected IdEquipoComputo idEquipoComputo;
    protected EquipoComputo equipoComputo;
    protected TipoCaja tipoCaja;

    public Caja(IdCaja idCaja,
                IdEmpleado idEmpleadoCaja,
                EquipoComputo equipoComputo,
                TipoCaja tipoCaja) {
        super(idCaja);
        appendChange(new CajaCreada(idEmpleadoCaja, equipoComputo, tipoCaja)).apply();
        subscribe(new CajaEventChange(this));
    }

    private Caja(IdCaja idCaja) {
        super(idCaja);
        subscribe(new CajaEventChange(this));
    }

    public static Caja from(IdCaja idCaja, List<DomainEvent> events){
        var caja = new Caja(idCaja);
        events.forEach(caja::applyEvent);
        return caja;
    }

    public void crearFactura(IdFactura idFactura,
                             DetalleFactura detalleFactura,
                             Map<IdProducto, Producto> producto,
                             DocumentoUsuario documentoUsuario,
                             Cantidad cantidadProducto){
        appendChange(new FacturaCreada(idFactura,
                detalleFactura,
                producto,
                documentoUsuario,
                cantidadProducto)).apply();
    }

    public void imprimirFactura(IdFactura idFactura, Factura factura, IdCaja idCaja){
        appendChange(new FacturaImpresa(idFactura, factura, idCaja)).apply();
    }

   public void reemplazarEquipoComputo(IdEquipoComputo idEquipoComputo,
                                        Nombre nombreEquipo,
                                        MarcaEquipoComputo marca,
                                        NumeroSerieEquipoComputo serial){
        appendChange(new EquipoComputoReemplazado(idEquipoComputo,
                nombreEquipo, marca, serial)).apply();
    }

    public void generarReclamo(IdFactura idFactura,
                               Factura factura,
                               DocumentoUsuario documentoUsuario){
        appendChange(new ReclamoGenerado(idFactura, factura, documentoUsuario)).apply();
    }

    public void asignarTipoCaja(IdCaja idCaja, TipoCaja tipoCaja){
        this.tipoCaja = tipoCaja;
    }

    public IdFactura IdFactura() {
        return idFactura;
    }

    public IdEquipoComputo idEquipoComputo() {
        return idEquipoComputo;
    }

    public IdEmpleado IdEmpleadoCaja() {
        return idEmpleadoCaja;
    }

    public EquipoComputo EquipoComputo() {
        return equipoComputo;
    }

    public TipoCaja TipoCaja() {
        return tipoCaja;
    }

    public Factura Factura() {
        return factura;
    }
}
