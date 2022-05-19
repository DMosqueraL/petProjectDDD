package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.Identity;

/**
 * [OV] Objeto de Valor que permite identificar a la entidad Usuario por medio de su id.
 * @return IdUsuario tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class IdUsuario extends Identity {

    public IdUsuario(String id){
        super(id);
    }
    public static IdUsuario of(String id){
        return new IdUsuario(id);
    }
}
