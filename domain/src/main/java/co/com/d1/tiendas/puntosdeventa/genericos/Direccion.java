package co.com.d1.tiendas.puntosdeventa.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * Objeto de Valor [OV] générico que puede ser utilizado por varias entidades, otros objetos de valor y/o
 * agregados para  determinar la dirección de su(s) parámetro(s)
 * @return direccion de tipo String
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class Direccion implements ValueObject<String> {

    private final String direccion;


    public Direccion(String direccion) {
        this.direccion = Objects.requireNonNull(direccion);

        if (this.direccion.isBlank()){
            throw new IllegalArgumentException("La dirección no puede estar vacio");
        }

        if(this.direccion.length() > 100){
            throw new IllegalArgumentException("La dirección no permite mas de 100 caracteres");
        }

    }

    @Override
    public String value() {
        return direccion;
    }
}
