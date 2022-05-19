package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.Identity;

/**
 * [OV] Objeto de Valor que permite identificar al agregado Bodega por medio de su id.
 * @return IdBodega tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class IdBodega extends Identity {

    public IdBodega(String idBodega) {
        super(idBodega);
    }

    public static IdBodega of(String idBodega){
        return new IdBodega(idBodega);
    }
}
