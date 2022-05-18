package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.Caja;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.EquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.TipoCaja;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoDeCajaDesignado extends DomainEvent {

    private TipoCaja tipoCaja;
    private IdCaja idCaja;

    private Caja caja;
    private IdEmpleado idEmpleado;
    private EquipoComputo equipoComputo;

    /*public TipoDeCajaDesignado(IdCaja idCaja, TipoCaja tipoCaja, Caja caja,
                               IdEmpleado idEmpleado, EquipoComputo equipoComputo) {

        super("co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.TipoDeCajadesignado");
        this.idCaja = idCaja;
        this.tipoCaja = tipoCaja;
        this.caja = caja;
        this.equipoComputo = equipoComputo;
        this.idEmpleado = idEmpleado;
    }*/

    public TipoDeCajaDesignado(IdCaja idCaja, TipoCaja tipoCaja, Caja caja){
        super("co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.TipoDeCajadesignado");
        this.idCaja = idCaja;
        this.tipoCaja = tipoCaja;
        this.caja = caja;
    }

    public TipoCaja getTipoCaja() {
        return tipoCaja;
    }

    public IdCaja getIdCaja() {
        return idCaja;
    }

    public Caja getCaja() {
        return caja;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public EquipoComputo getEquipoComputo() {
        return equipoComputo;
    }
}
