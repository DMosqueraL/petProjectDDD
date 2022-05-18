package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nit implements ValueObject<Long> {

    private final Long nit;

    public Nit(Long nit) {
        this.nit = Objects.requireNonNull(nit);

        if (String.valueOf(this.nit).length() < 8){
            throw new IllegalArgumentException("El nit no puede ser menor de 8 caracteres");
        }

        if (String.valueOf(this.nit).isBlank()){
            throw new IllegalArgumentException("El nit no puede estar vacio");
        }

        if (!this.nit.equals(this.nit.longValue())){
            throw new IllegalArgumentException("El nit no puede tener decimales");
        }
    }

    @Override
    public Long value() {
        return nit;
    }
}
