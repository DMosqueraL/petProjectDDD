package co.com.d1.tiendas.puntosdeventa;

import co.com.d1.tiendas.puntosdeventa.events.CajaCreada;
import co.com.d1.tiendas.puntosdeventa.values.IdCaja;
import co.com.sofka.domain.generic.AggregateEvent;

public class Caja extends AggregateEvent<IdCaja> {

    protected Empleado empleadoCaja;
    protected Factura factura;
    protected EquipoComputo equipoComputo;
    protected Boolean cajaRapida;


    public Caja(IdCaja entityId) {
        super(entityId);
        subscribe(new CajaEventChange(this));
    }

    public Caja(IdCaja entityId,Boolean cajaRapida){
        super(entityId);
        appendChange(new CajaCreada(cajaRapida)).apply();
        subscribe(new CajaEventChange(this));
    }
}
