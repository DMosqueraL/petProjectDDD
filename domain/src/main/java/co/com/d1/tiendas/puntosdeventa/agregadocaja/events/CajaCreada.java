package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.EquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.TipoCaja;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;

public class CajaCreada extends DomainEvent {

    private final IdEmpleado idEmpleadoCaja;
    private final EquipoComputo equipoComputo;
    private final TipoCaja tipoCaja;

    public CajaCreada(IdEmpleado idEmpleadoCaja, EquipoComputo equipoComputo, TipoCaja tipoCaja) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.CajaCreada");
        this.idEmpleadoCaja = idEmpleadoCaja;
        this.equipoComputo = equipoComputo;
        this.tipoCaja = tipoCaja;
    }

    public IdEmpleado getIdEmpleadoCaja() {
        return idEmpleadoCaja;
    }

    public EquipoComputo getEquipoComputo() {
        return equipoComputo;
    }

    public TipoCaja getTipoCaja() {
        return tipoCaja;
    }
}
