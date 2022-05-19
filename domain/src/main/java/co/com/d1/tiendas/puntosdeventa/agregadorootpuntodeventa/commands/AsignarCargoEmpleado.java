package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.commands;

import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.Cargo;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.sofka.domain.generic.Command;

/**
 * [CM] Comando que ejecuta un usuario del sistema a través de una interfaz para designar el cargo a
 * cada uno de los empleados del punto de venta o tienda D1
 * @Autores: Andrés Lozano y Doris Mosquera
 */
public class AsignarCargoEmpleado extends Command {

    private final IdEmpleado idEmpleado;
    private final Cargo cargo;

    public AsignarCargoEmpleado(IdEmpleado idEmpleado, Cargo cargo) {
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
