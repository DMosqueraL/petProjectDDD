package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.Factura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * [EV] Evento donde se ha generado una factura de caja en el punto de venta o tienda D1
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class FacturaGenerada extends DomainEvent {

    private final IdFactura idFactura;
    private final Factura  factura;
    private final IdCaja idCaja;
    public FacturaGenerada(IdFactura idFactura, Factura factura, IdCaja idCaja) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.FacturaGenerada");
        this.idFactura = idFactura;
        this.factura = factura;
        this.idCaja = idCaja;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public IdCaja getIdCaja() {
        return idCaja;
    }
}
