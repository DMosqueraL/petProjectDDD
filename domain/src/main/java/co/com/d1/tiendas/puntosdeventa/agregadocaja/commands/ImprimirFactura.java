package co.com.d1.tiendas.puntosdeventa.agregadocaja.commands;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.Factura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.sofka.domain.generic.Command;

public class ImprimirFactura extends Command {

    private final IdFactura idFactura;
    private final Factura factura;
    private final IdCaja idCaja;

    public ImprimirFactura(IdFactura idFactura, Factura factura, IdCaja idCaja) {
        this.idFactura = idFactura;
        this.factura = factura;
        this.idCaja = idCaja;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public Factura getFactura() {
        return factura;
    }

    public IdCaja getIdCaja() {
        return idCaja;
    }
}
