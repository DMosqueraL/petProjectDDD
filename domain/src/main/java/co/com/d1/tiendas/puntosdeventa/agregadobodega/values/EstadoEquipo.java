package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoEquipo implements ValueObject<EstadoEquipo.Estados> {

private Estados value;

    public EstadoEquipo(Estados value) {
        this.value = Objects.requireNonNull(value);
    }

    public enum Estados{
        BUENO, REGULAR, DAÑADO
    }

    @Override
    public EstadoEquipo.Estados value() {
        return value();
    }
}
