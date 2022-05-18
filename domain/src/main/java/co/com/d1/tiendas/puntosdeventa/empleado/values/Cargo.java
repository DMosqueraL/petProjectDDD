package co.com.d1.tiendas.puntosdeventa.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

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