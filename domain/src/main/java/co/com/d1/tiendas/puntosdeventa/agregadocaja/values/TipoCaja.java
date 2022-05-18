package co.com.d1.tiendas.puntosdeventa.agregadocaja.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar el tipo de caja en el punto de venta o tienda D1
 * @return tipoCaja tipo Tipo
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class TipoCaja implements ValueObject<TipoCaja.Tipo> {

    private Tipo tipoCaja;

    public TipoCaja(Tipo tipoCaja) {
        this.tipoCaja = Objects.requireNonNull(tipoCaja);
    }

    @Override
    public Tipo value() {
        return tipoCaja;
    }

    public enum Tipo{
        CAJA_RAPIDA, CAJA_NORMAL;
    }
}
