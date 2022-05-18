package co.com.d1.tiendas.puntosdeventa.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {

    private final String url;

    public Email(String url) {
        this.url = Objects.requireNonNull(url);

        if (this.url.isBlank()){
            throw new IllegalArgumentException("La url no puede estar vacia");
        }

        if(this.url.length() > 100){
            throw new IllegalArgumentException("El apellido no permite mas de 100 caracteres");
        }

    }

    @Override
    public String value() {
        return url;
    }
}
