package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.Empleado;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values.DetallePuntoDeVenta;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values.Estanteria;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Map;

/**
 * [EV] Evento donde se crea un punto de venta o tienda D1.
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class PuntoDeVentaCreado extends DomainEvent {

    private DetallePuntoDeVenta detallePuntoDeVenta;
    private IdCaja idCaja;
    private Estanteria estanteria;
    private Map<IdEmpleado, Empleado> empleados;

    public PuntoDeVentaCreado(DetallePuntoDeVenta detallePuntoDeVenta, IdCaja idCaja,
                              Estanteria estanteria, Map<IdEmpleado, Empleado> empleados) {

        super("co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.PuntoDeVentaCreado");
        this.detallePuntoDeVenta = detallePuntoDeVenta;
        this.idCaja = idCaja;
        this.empleados = empleados;
        this.estanteria = estanteria;
    }

    public DetallePuntoDeVenta getDetallePuntoDeVenta() {
        return detallePuntoDeVenta;
    }

    public IdCaja getIdCaja() {
        return idCaja;
    }

    public Estanteria getEstanteria() {
        return estanteria;
    }

    public Map<IdEmpleado, Empleado> getEmpleados() {
        return empleados;
    }
}
