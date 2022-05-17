package co.com.d1.tiendas.puntosdeventa.agregadocaja.values;

import co.com.sofka.domain.generic.Identity;

public class IdCaja extends Identity {

    public IdCaja(String id){
        super(id);
    }

    public static IdCaja of(String id){
        return new IdCaja(id);
    }
}
