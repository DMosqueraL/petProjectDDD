package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.Identity;

/**
 * [OV] Objeto de Valor que permite identificar al agregado Factura por medio de su id.
 * @return IdFactura tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class IdFactura extends Identity {
    public IdFactura(String id){
        super(id);
    }


    public static IdFactura of(String id){
        return new IdFactura(id);
    }
}
