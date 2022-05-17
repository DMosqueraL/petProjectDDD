package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;

public class Factura extends AggregateEvent {
    public Factura(Identity entityId) {
        super(entityId);
    }
}
