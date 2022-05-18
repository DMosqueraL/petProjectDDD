package co.com.d1.tiendas.puntosdeventa.agregadocaja;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.Factura;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.CantidadProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.CajaCreada;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.EquipoComputoReemplazado;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.FacturaGenerada;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.MarcaEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.NumeroSerieEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.empleado.Empleado;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

public class Caja extends AggregateEvent<IdCaja> {

    protected Empleado empleadoCaja;
    protected Factura factura;
    protected EquipoComputo equipoComputo;
    protected Boolean cajaRapida;


    public Caja(IdCaja idCaja, Empleado empleadoCaja, EquipoComputo equipoComputo, Boolean cajaRapida) {
        super(idCaja);
        appendChange(new CajaCreada(empleadoCaja, equipoComputo, cajaRapida)).apply();
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

    public void generarFactura(IdFactura idFactura, IdCaja idCaja){
        appendChange(new FacturaGenerada(idFactura, idCaja));
    }

    public void detallesFactura(DetalleFactura detalleFactura,
                                DocumentoUsuario numeroIdentificacion,
                                Map<IdProducto, Producto> productos,
                                CantidadProducto cantidadProducto){

    }

    public void reemplazarEquipoComputo(IdEquipoComputo idEquipoComputo,
                                        Nombre nombreEquipo,
                                        MarcaEquipoComputo marca,
                                        NumeroSerieEquipoComputo serial){
        appendChange(new EquipoComputoReemplazado(idEquipoComputo, nombreEquipo, marca, serial));
    }

    public Empleado EmpleadoCaja() {
        return empleadoCaja;
    }

    public EquipoComputo EquipoComputo() {
        return equipoComputo;
    }

    public Boolean CajaRapida() {
        return cajaRapida;
    }

    public Factura Factura() {
        return factura;
    }
}
