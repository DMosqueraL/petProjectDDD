package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaGenerada extends DomainEvent {

    private final IdFactura idFactura;
    private final IdCaja idCaja;
    public FacturaGenerada(IdFactura idFactura, IdCaja idCaja) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.FacturaGenerada");
        this.idFactura = idFactura;
        this.idCaja = idCaja;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public IdCaja getIdCaja() {
        return idCaja;
    }
}
