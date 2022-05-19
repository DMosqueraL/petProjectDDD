package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar la cantidad de producto
 * @return documento tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class CantidadProducto implements ValueObject<Integer> {

    private final Integer value;

    public CantidadProducto(Integer value) {
        this.value = Objects.requireNonNull(value);

        if(this.value == 0){
            throw new IllegalArgumentException("La cantidad de producto no pueder ser cero");
        }
        if(this.value <= 0){
            throw new IllegalArgumentException("La cantidad de producto no pueder ser negativa");
        }
        if(String.valueOf(this.value).isBlank()){
            throw new IllegalArgumentException("La cantidad de producto no pueder estar vacía");
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}
