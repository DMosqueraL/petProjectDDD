package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura;

import co.com.sofka.domain.generic.EventChange;

public class FacturaEventChange extends EventChange {
    public FacturaEventChange(Factura factura) {

        /*apply((FacturaCreada event) -> {
            factura.detalleFactura = event.getDetalleFactura();
            factura.numeroIdentificacion = event.getDocumentoUsuario();
            factura.productos = new HashMap<>();
            factura.cantidadProducto = event.getCantidadProducto();
        });*/
    }
}
