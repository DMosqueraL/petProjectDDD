package co.com.d1.tiendas.puntosdeventa.agregadocaja.commands;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.Factura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.sofka.domain.generic.Command;

/**
 * [CM] Comando que ejecuta un usuario del sistema a través de una interfaz para imprimir una
 * factura en la caja del punto de venta o tienda D1
 * @Autores: Andrés Lozano y Doris Mosquera
 */
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
