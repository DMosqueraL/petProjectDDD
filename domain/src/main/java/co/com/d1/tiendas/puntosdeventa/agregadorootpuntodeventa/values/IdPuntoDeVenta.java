package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values;

import co.com.sofka.domain.generic.Identity;

/**
 * [OV] Objeto de Valor que permite identificar al agregado root PuntoDeVenta por medio de su id.
 * @return idPuntoDeVenta tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class IdPuntoDeVenta extends Identity {

    public IdPuntoDeVenta(String idPuntoDeVenta) {
        super(idPuntoDeVenta);
    }

    public static IdPuntoDeVenta of(String idPuntoDeVenta){
        return new IdPuntoDeVenta(idPuntoDeVenta);
    }
}
