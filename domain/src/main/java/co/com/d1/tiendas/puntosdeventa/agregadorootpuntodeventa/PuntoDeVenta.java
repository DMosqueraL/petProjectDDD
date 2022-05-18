package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdBodega;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.Caja;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.TipoCaja;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.Empleado;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.Cargo;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.Email;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.NombreCompleto;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events.CargoAsignadoEmpleado;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events.EmpleadoCreado;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events.PuntoDeVentaCreado;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events.TipoDeCajaDesignado;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values.DetallePuntoDeVenta;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values.Estanteria;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values.IdPuntoDeVenta;
import co.com.d1.tiendas.puntosdeventa.genericos.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

/**
 * Agregado Root [AR] PuntoDeVenta. Gestionaa los agregados Caja, Empleado y Bodega con sus
 * respectivos comportamientos para lanzar sus eventos.
 */
public class PuntoDeVenta extends AggregateEvent<IdPuntoDeVenta> {

    protected DetallePuntoDeVenta detallePuntoDeVenta;

    protected IdBodega idBodega;

    protected IdCaja idCaja;

    protected Estanteria estanteria;

    protected Map<IdEmpleado, Empleado> empleados;

    public PuntoDeVenta(IdPuntoDeVenta idPuntoDeVenta, DetallePuntoDeVenta detallePuntoDeVenta,
                        IdCaja idCaja, Estanteria estanteria, Map<IdEmpleado, Empleado> empleados) {

        super(idPuntoDeVenta);
        appendChange(new PuntoDeVentaCreado(detallePuntoDeVenta, idCaja, estanteria, empleados)).apply();
        subscribe(new PuntoDeVentaEventChange(this));
    }

    public PuntoDeVenta(IdPuntoDeVenta idPuntoDeVenta) {
        super(idPuntoDeVenta);
        subscribe(new PuntoDeVentaEventChange(this));
    }

    public static PuntoDeVenta from(IdPuntoDeVenta idPuntoDeVenta, List<DomainEvent> events){
        var puntoDeVenta = new PuntoDeVenta(idPuntoDeVenta);
        events.forEach(puntoDeVenta::applyEvent);
        return puntoDeVenta;
    }

    public void crearEmpleado(IdEmpleado idEmpleado, NombreCompleto nombreCompleto,
                              Email email, Telefono telefono, Cargo cargo){
        appendChange(new EmpleadoCreado(idEmpleado, nombreCompleto, email, telefono, cargo)).apply();
    }

    public void asignarCargoEmpleado(IdEmpleado idEmpleado, Cargo cargo){

        appendChange(new CargoAsignadoEmpleado(idEmpleado, cargo)).apply();
    }

    public void designarTipoDeCaja(IdCaja idCaja, TipoCaja tipoCaja, Caja caja){
        appendChange(new TipoDeCajaDesignado(idCaja, tipoCaja, caja)).apply();
    }

    public DetallePuntoDeVenta detallePuntoDeVenta() {
        return detallePuntoDeVenta;
    }

    public IdBodega idBodega() {
        return idBodega;
    }

    public IdCaja idCaja() {
        return idCaja;
    }

    public Estanteria estanteria() {
        return estanteria;
    }

    public Map<IdEmpleado, Empleado> empleados() {
        return empleados;
    }
}
