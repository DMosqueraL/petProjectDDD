package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.EquipoComputo;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.TipoCaja;
import co.com.d1.tiendas.puntosdeventa.empleado.Empleado;

import co.com.sofka.domain.generic.DomainEvent;

public class CajaCreada extends DomainEvent {

    private final Empleado empleadoCaja;
    private final EquipoComputo equipoComputo;
    private final TipoCaja tipoCaja;

    public CajaCreada(Empleado empleadoCaja, EquipoComputo equipoComputo, TipoCaja tipoCaja) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.CajaCreada");
        this.empleadoCaja = empleadoCaja;
        this.equipoComputo = equipoComputo;
        this.tipoCaja = tipoCaja;
    }

    public Empleado getEmpleadoCaja() {
        return empleadoCaja;
    }

    public EquipoComputo getEquipoComputo() {
        return equipoComputo;
    }

    public TipoCaja getTipoCaja() {
        return tipoCaja;
    }
}
