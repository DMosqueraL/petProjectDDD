package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estanteria implements ValueObject<Integer> {

    private final Integer estanteria;

    public Estanteria(Integer estanteria) {
        this.estanteria = Objects.requireNonNull(estanteria);

        if (this.estanteria <= 0){
            throw new IllegalArgumentException("El punto de venta no puede tener 0 estantes");
        }

        if (String.valueOf(this.estanteria).isBlank()){
            throw new IllegalArgumentException("La estanteria no puede estar vacio en su campo");
        }

        if (!this.estanteria.equals(this.estanteria.intValue())){
            throw new IllegalArgumentException("La estanteria no puede tener decimales");
        }
    }

    @Override
    public Integer value() {
        return estanteria;
    }
}
