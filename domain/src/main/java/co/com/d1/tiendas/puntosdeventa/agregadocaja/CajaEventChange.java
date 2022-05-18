package co.com.d1.tiendas.puntosdeventa.agregadocaja;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.CajaCreada;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.EquipoComputoCreado;
import co.com.sofka.domain.generic.EventChange;

public class CajaEventChange extends EventChange {
    public CajaEventChange(Caja caja) {
        /*apply(CajaCreada event -> {
            caja.empleadoCaja = event.getNombre();
            caja.cajaRapida = event.isCajaRapida();
        });*/

        apply((EquipoComputoCreado event) -> {

        });
    }
}
