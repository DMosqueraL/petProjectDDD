package co.com.d1.tiendas.puntosdeventa.agregadoempleado;

import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.*;
import co.com.d1.tiendas.puntosdeventa.genericos.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;

/**
 * [A] Agregado que gestiona todo lo relacionado con los empleados del punto de venta o tienda D1
 */
public class Empleado extends AggregateEvent<IdEmpleado> {

    protected NombreCompleto nombreCompleto;
    protected Email email;
    protected Telefono telefono;
    protected HorasLaboralesAlDia horasLaboralesAlDia;
    protected Cargo cargo;

    public Empleado(IdEmpleado idEmpleado) {
        super(idEmpleado);
    }

    public Empleado(IdEmpleado idEmpleado, NombreCompleto nombreCompleto,
                    Email email, Telefono telefono, Cargo cargo) {

        super(idEmpleado);
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.horasLaboralesAlDia = horasLaboralesAlDia;
        this.cargo = cargo;
    }

    public Empleado(IdEmpleado idEmpleado, Cargo cargo) {

        super(idEmpleado);
        this.cargo = cargo;
    }

    public void agregarEmpleado(IdEmpleado idEmpleado, NombreCompleto nombreCompleto, Cargo cargo){

        if(idEmpleado.value().isBlank()){
            throw new IllegalArgumentException("No puede agregar un empleado pasando el id vacio");
        }

        if (nombreCompleto.value().isBlank()){
            throw new IllegalArgumentException("No puede agregar un empleado pasando el nombre vacio");
        }

        if (cargo.value().isBlank()){
            throw new IllegalArgumentException("No puede agregar un empleado pasando el cargo vacio");
        }

        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
    }

    public void actualizarCargo(IdEmpleado idEmpleado, Cargo cargo){

        if(idEmpleado.value().isBlank()){
            throw new IllegalArgumentException("No puede actualizar un cargo a un empleado pasando el id vacio");
        }

        if (cargo.value().isBlank()){
            throw new IllegalArgumentException("No puede actualizar un cargo a un empleado pasando el cargo vacio");
        }

        this.cargo = cargo;
    }

    public NombreCompleto NombreCompleto() {
        return nombreCompleto;
    }

    public Email Email() {
        return email;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public HorasLaboralesAlDia HorasLaboralesAlDia() {
        return horasLaboralesAlDia;
    }

    public Cargo Cargo() {
        return cargo;
    }
}
