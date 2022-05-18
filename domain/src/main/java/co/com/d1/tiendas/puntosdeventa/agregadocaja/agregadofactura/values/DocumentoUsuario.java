package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DocumentoUsuario implements ValueObject<String> {
    private final String value;

    public DocumentoUsuario(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El documento de identidad no puede estar en blanco.");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
