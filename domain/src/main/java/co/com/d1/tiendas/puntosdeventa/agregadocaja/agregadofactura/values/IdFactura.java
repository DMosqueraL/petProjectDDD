package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.Identity;

public class IdFactura extends Identity {
    public IdFactura(String id){
        super(id);
    }

    public IdFactura() {

    }

    public static IdFactura of(String id){
        return new IdFactura(id);
    }
}
