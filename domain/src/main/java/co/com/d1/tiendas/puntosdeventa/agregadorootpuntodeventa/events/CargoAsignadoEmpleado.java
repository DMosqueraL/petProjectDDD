package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events;

import co.com.d1.tiendas.puntosdeventa.agregadoempleado.Empleado;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.Cargo;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Map;

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
