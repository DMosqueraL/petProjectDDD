package co.com.d1.tiendas.puntosdeventa.agregadoempleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HorasLaboralesAlDia implements ValueObject<Integer> {

    private final Integer horasLaborales;

    public HorasLaboralesAlDia(Integer horasLaborales) {
        this.horasLaborales = Objects.requireNonNull(horasLaborales);

        if (this.horasLaborales <= 0){
            throw new IllegalArgumentException("Minimo debe laborar 1 hora por dia");
        }

        if (String.valueOf(this.horasLaborales).isBlank()){
            throw new IllegalArgumentException("No se permite vacio las horas laborales por dia");
        }

        if (!this.horasLaborales.equals(this.horasLaborales.intValue())){
            throw new IllegalArgumentException("Las horas laborales por dia no puede tener decimales");
        }

    }

    @Override
    public Integer value() {
        return horasLaborales;
    }
}
