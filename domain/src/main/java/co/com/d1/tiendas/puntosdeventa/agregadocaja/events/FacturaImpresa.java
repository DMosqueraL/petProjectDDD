package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.Factura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaImpresa extends DomainEvent {
    public FacturaImpresa(IdFactura idFactura, Factura factura, IdCaja idCaja) {
        super();
    }
}
