package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values;

import co.com.sofka.domain.generic.Identity;

public class IdPuntoDeVenta extends Identity {

    public IdPuntoDeVenta(String idPuntoDeVenta) {
        super(idPuntoDeVenta);
    }

    public static IdPuntoDeVenta of(String idPuntoDeVenta){
        return new IdPuntoDeVenta(idPuntoDeVenta);
    }
}
