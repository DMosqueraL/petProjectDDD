package co.com.d1.tiendas.puntosdeventa.agregadoempleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que le permite determinar el cardo de los empleados del dominio
 * @return cargo tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class Cargo implements ValueObject<String> {

    private final String cargo;

    public Cargo(String cargo) {
        this.cargo = Objects.requireNonNull(cargo);

        if (this.cargo.isBlank()){
            throw new IllegalArgumentException("El nombre del cargo no puede estar vacio");
        }

        if(this.cargo.length() > 50){
            throw new IllegalArgumentException("El nombre del cargo no permite mas de 50 caracteres");
        }
    }

    @Override
    public String value() {
        return cargo;
    }
}
