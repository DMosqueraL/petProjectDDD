package co.com.d1.tiendas.puntosdeventa.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cantidad implements ValueObject<Integer> {

    private final Integer value;

    public Cantidad(Integer value) {
        this.value = Objects.requireNonNull(value);

        if (this.value <= 0){
            throw new IllegalArgumentException("El precio del producto no puede ser 0");
        }

        if (String.valueOf(this.value).isBlank()){
            throw new IllegalArgumentException("El precio del producto no puede estar vacio");
        }

        if (!this.value.equals(this.value.intValue())){
            throw new IllegalArgumentException("El precio del producto no puede tener decimales");
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}
