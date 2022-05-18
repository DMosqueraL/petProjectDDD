package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Categoria implements ValueObject<String> {

    private final String value;

    public Categoria(String value) {
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()){
            throw new IllegalArgumentException("El nombre de la categoria no puede estar en blanco");
        }

        if(this.value.length() > 50){
            throw new IllegalArgumentException("El nombre de la categoria no permite mas de 50 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
