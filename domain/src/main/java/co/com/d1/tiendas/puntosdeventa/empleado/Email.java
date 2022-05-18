package co.com.d1.tiendas.puntosdeventa.empleado;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {

    private final String url;

    public Email(String url) {
        this.url = Objects.requireNonNull(url);

        if (this.url.isBlank()){
            throw new IllegalArgumentException("El apellido no puede estar en blanco");
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
