package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.Identity;

public class IdUsuario extends Identity {

    public IdUsuario(String id){
        super(id);
    }
    public static IdUsuario of(String id){
        return new IdUsuario(id);
    }
}
