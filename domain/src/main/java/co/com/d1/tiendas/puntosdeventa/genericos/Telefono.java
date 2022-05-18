package co.com.d1.tiendas.puntosdeventa.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {

    private final String numeroTelefono;

    public Telefono(String numeroTelefono) {
        this.numeroTelefono = Objects.requireNonNull(numeroTelefono);

        if (this.numeroTelefono.isBlank()){
            throw new IllegalArgumentException("El telefono no puede estar vacio");
        }

        if(this.numeroTelefono.length() > 10){
            throw new IllegalArgumentException("El telefono no permite mas de 10 caracteres");
        }

    }

    @Override
    public String value() {
        return numeroTelefono;
    }
}
