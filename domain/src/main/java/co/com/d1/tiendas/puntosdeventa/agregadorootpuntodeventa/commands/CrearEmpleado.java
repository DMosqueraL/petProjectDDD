package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.commands;

import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.Cargo;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.Email;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.NombreCompleto;
import co.com.d1.tiendas.puntosdeventa.genericos.Telefono;
import co.com.sofka.domain.generic.Command;

/**
 * [CM] Comando que ejecuta un usuario del sistema a través de una interfaz para crear un empleado
 * del punto de venta o tienda D1
 * @Autores: Andrés Lozano y Doris Mosquera
 */
public class CrearEmpleado extends Command {
    private final IdEmpleado idEmpleado;
    private final Email email;
    private final NombreCompleto nombreCompleto;
    private final Telefono telefono;
    private final Cargo cargo;

    public CrearEmpleado(IdEmpleado idEmpleado,
                         Email email,
                         NombreCompleto nombreCompleto,
                         Telefono telefono,
                         Cargo cargo) {
        this.idEmpleado = idEmpleado;
        this.email = email;
        this.nombreCompleto = nombreCompleto;
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
