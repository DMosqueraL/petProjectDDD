package co.com.d1.tiendas.puntosdeventa.agregadocaja.values;

import co.com.sofka.domain.generic.Identity;

public class IdEquipoComputo extends Identity {

    public IdEquipoComputo(String id){
        super(id);
    }
    public static IdEquipoComputo of(String id){
        return new IdEquipoComputo(id);
    }
}
