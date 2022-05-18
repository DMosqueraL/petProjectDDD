package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.Identity;

/**
 * [OV] Objeto de Valor que permite identificar a la entidad Equipo por medio de su id.
 * @return IdEquipo tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class IdEquipo extends Identity {

    public IdEquipo(String idEquipo) {
        super(idEquipo);
    }

    public IdEquipo() {}

    public static IdEquipo of(String idEquipo) {
        return new IdEquipo(idEquipo);
    }
}
