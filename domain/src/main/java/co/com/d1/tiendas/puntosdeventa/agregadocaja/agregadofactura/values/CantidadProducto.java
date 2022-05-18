package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

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
