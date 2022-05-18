package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.EquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.Empleado;
import co.com.sofka.domain.generic.DomainEvent;

public class CajaCreada extends DomainEvent {

    private final Empleado empleadoCaja;
    private final EquipoComputo equipoComputo;
    private final Boolean cajaRapida;

    public CajaCreada(Empleado empleadoCaja, EquipoComputo equipoComputo, Boolean cajaRapida) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.CajaCreada");
        this.empleadoCaja = empleadoCaja;
        this.equipoComputo = equipoComputo;
        this.cajaRapida = cajaRapida;
    }

    public Empleado getEmpleadoCaja() {
        return empleadoCaja;
    }

    public EquipoComputo getEquipoComputo() {
        return equipoComputo;
    }

    public Boolean isCajaRapida() {
        return cajaRapida;
    }
}
