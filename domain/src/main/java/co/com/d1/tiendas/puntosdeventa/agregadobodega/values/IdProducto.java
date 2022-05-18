package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.Identity;

/**
 * [OV] Objeto de Valor que permite identificar a la entidad Producto por medio de su id.
 * @return IdProducto tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class IdProducto extends Identity {

    public IdProducto(String idProducto) {
        super(idProducto);
    }

    public IdProducto() {}

    public static IdProducto of(String idProducto) {
        return new IdProducto(idProducto);
    }
}
