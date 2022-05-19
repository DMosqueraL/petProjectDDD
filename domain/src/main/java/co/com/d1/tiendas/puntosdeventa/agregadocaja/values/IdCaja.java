package co.com.d1.tiendas.puntosdeventa.agregadocaja.values;

import co.com.sofka.domain.generic.Identity;

/**
 * [OV] Objeto de Valor que permite identificar al agregado Caja por medio de su id.
 * @return idCaja tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class IdCaja extends Identity {

    public IdCaja(String id){
        super(id);
    }

    public static IdCaja of(String id){
        return new IdCaja(id);
    }
}
