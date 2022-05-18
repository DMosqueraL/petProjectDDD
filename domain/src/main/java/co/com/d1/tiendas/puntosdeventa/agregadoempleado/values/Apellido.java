package co.com.d1.tiendas.puntosdeventa.agregadoempleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar el apellido de los empleados del dominio
 * @return apellido tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class Apellido implements ValueObject<String> {

    private final String apellido;

    public Apellido(String apellido) {
        this.apellido = Objects.requireNonNull(apellido);

        if (this.apellido.isBlank()){
            throw new IllegalArgumentException("El apellido no puede estar vacio");
        }

        if(this.apellido.length() > 50){
            throw new IllegalArgumentException("El apellido no permite mas de 50 caracteres");
        }

    }

    @Override
    public String value() {
        return apellido;
    }
}
