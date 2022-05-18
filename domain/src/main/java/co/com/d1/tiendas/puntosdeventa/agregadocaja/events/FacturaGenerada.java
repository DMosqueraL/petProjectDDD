package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaGenerada extends DomainEvent {
    public FacturaGenerada(IdFactura idFactura, IdCaja idCaja) {
        super();
    }
}
