package co.com.d1.tiendas.puntosdeventa.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * Objeto de Valor [OV] générico que puede ser utilizado por varias entidades, otros objetos de valor y/o
 * agregados para obtener el teléfono de su(s) parámetro(s)
 * @return numeroTelefono de tipo String
 * @Autores: Andrés Lozada y Doris Mosquera
 */
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
