package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar el precio unitario de cada producto
 * @return precioUnitario tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class PrecioUnitario implements ValueObject<Integer> {

    private final Integer precioUnitario;

    public PrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = Objects.requireNonNull(precioUnitario);

        if (this.precioUnitario <= 0){
            throw new IllegalArgumentException("El precio del producto no puede ser 0");
        }

        if (String.valueOf(this.precioUnitario).isBlank()){
            throw new IllegalArgumentException("El precio del producto no puede estar vacio");
        }

        if (!this.precioUnitario.equals(this.precioUnitario.intValue())){
            throw new IllegalArgumentException("El precio del producto no puede tener decimales");
        }
    }

    @Override
    public Integer value() {
        return precioUnitario;
    }
}
