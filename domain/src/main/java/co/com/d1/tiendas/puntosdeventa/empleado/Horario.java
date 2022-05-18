package co.com.d1.tiendas.puntosdeventa.empleado;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Horario implements ValueObject<List<Objects>> {

    private final DiasTrabajo diasTrabajo;
    private final LocalTime horaInicio;
    private final LocalTime horaFinal;


    public Horario(DiasTrabajo diasTrabajo, LocalTime horaInicio, LocalTime horaFinal) {
        this.diasTrabajo = Objects.requireNonNull(diasTrabajo);
        this.horaInicio = Objects.requireNonNull(horaInicio);
        this.horaFinal = Objects.requireNonNull(horaFinal);
    }

    @Override
    public List<Objects> value() {



        return List<Objects>;
    }
}
