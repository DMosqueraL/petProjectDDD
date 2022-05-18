package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura;

import co.com.sofka.domain.generic.EventChange;

import java.util.HashMap;

public class FacturaEventChange extends EventChange {
    public FacturaEventChange(Factura factura) {

        apply((DireccionCambiada event) -> {
            factura.
        });
    }
}
