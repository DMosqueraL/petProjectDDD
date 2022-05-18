package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.Identity;

public class IdProducto extends Identity {

    public IdProducto(String idProducto) {
        super(idProducto);
    }

    public IdProducto() {}

    public static IdProducto of(String idProducto) {
        return new IdProducto(idProducto);
    }
}
