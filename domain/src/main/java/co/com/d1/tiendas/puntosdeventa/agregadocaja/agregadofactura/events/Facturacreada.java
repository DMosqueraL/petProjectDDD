package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.sofka.domain.generic.DomainEvent;

public class Facturacreada extends DomainEvent {
    public Facturacreada(IdFactura idFactura) {
        super();
    }
}
