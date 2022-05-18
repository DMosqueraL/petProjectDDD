package co.com.d1.tiendas.puntosdeventa.empleado;

import co.com.sofka.domain.generic.AggregateEvent;

public class Empleado extends AggregateEvent<IdEmpleado> {

    protected NombreCompleto nombreCompleto;
    protected Email email;
    protected Telefono telefono;
    protected Horario horario;
    protected Cargo;



    public Empleado(IdEmpleado entityId) {
        super(entityId);
    }
}
