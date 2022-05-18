package co.com.d1.tiendas.puntosdeventa.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {

        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()){
            throw new IllegalArgumentException("El nombre del producto no puede estar en blanco");
        }

        if (this.value.length() > 100){
            throw new IllegalArgumentException("El nombre del producto no permite mas de 100 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
