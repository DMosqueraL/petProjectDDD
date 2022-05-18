package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.Identity;

public class IdBodega extends Identity {

    public IdBodega(String idBodega) {
        super(idBodega);
    }

    public static IdBodega of(String idBodega){
        return new IdBodega(idBodega);
    }
}
