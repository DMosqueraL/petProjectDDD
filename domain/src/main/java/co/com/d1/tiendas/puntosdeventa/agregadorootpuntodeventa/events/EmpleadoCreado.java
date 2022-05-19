package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events;

import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.Cargo;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.Email;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.NombreCompleto;
import co.com.d1.tiendas.puntosdeventa.genericos.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * [EV] Evento donde se ha creado un empleado para el punto de venta o tienda D1.
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class EmpleadoCreado extends DomainEvent {

    private IdEmpleado idEmpleado;
    private Email email;
    private NombreCompleto nombreCompleto;
    private Telefono telefono;
    private Cargo cargo;
    public EmpleadoCreado(IdEmpleado idEmpleado, NombreCompleto nombreCompleto,
                          Email email, Telefono telefono, Cargo cargo) {

        super("co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.EmpleadoCreado");
        this.idEmpleado = idEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.cargo = cargo;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Email getEmail() {
        return email;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
