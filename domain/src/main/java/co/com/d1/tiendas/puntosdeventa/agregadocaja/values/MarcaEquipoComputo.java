package co.com.d1.tiendas.puntosdeventa.agregadocaja.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MarcaEquipoComputo implements ValueObject<String>{

    private final String value;

    public MarcaEquipoComputo(String value) {
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Las especificaciones del equipo no pueden estar en blanco.");
        }

    }

    @Override
    public String value() {
        return value;
    }

}
