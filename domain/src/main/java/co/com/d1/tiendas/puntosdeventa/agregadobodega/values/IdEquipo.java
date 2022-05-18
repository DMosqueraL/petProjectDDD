package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.Identity;

public class IdEquipo extends Identity {

    public IdEquipo(String idEquipo) {
        super(idEquipo);
    }

    public IdEquipo() {}

    public static IdEquipo of(String idEquipo) {
        return new IdEquipo(idEquipo);
    }
}
