package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events;

import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.Cargo;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * [EV] Evento donde se ha asignado el cargo correspondiente a un empleado  que hace parte del
 * punto de venta o tienda D1.
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class CargoAsignadoEmpleado extends DomainEvent {

    private IdEmpleado idEmpleado;
    private Cargo cargo;
    public CargoAsignadoEmpleado(IdEmpleado idEmpleado, Cargo cargo) {

        super("co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.CargoAsignadoEmpleado");
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
