package co.com.d1.tiendas.puntosdeventa.agregadocaja.values;

import co.com.sofka.domain.generic.Identity;

/**
 * [OV] Objeto de Valor que permite identificar a la entidad EquipoComputo por medio de su id.
 * @return IdEquipoComputo tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class IdEquipoComputo extends Identity {

    public IdEquipoComputo(String id){
        super(id);
    }
    public static IdEquipoComputo of(String id){
        return new IdEquipoComputo(id);
    }
}
