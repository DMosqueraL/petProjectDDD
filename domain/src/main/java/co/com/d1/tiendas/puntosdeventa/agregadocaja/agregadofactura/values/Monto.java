package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar el monto a pagar por la factura
 * hace parte de un [OV] superior - DetalleFactura
 * @return marca tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class Monto implements ValueObject<Double> {
    private final Double monto;

    public Monto(Double monto) {
        this.monto = Objects.requireNonNull(monto);

        if(this.monto <= 0){
            throw new IllegalArgumentException("El valor a pagar no puede ser cero o negativo");
        }
        if(String.valueOf(this.monto).isBlank()){
            throw new IllegalArgumentException("LEl monto a pagar no pueder estar vacío");
        }
    }

    @Override
    public Double value() {
        return monto;
    }
}
