package co.com.d1.tiendas.puntosdeventa.empleado;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DiasTrabajo implements ValueObject<DiasTrabajo.DiasSemana> {

    private final DiasSemana diaSemana;

    public DiasTrabajo(DiasSemana diaSemana) {
        this.diaSemana = Objects.requireNonNull(diaSemana);
    }

    public enum DiasSemana{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    @Override
    public DiasSemana value() {
        return diaSemana;
    }
}
