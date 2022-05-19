package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar el estado de cada equipo
 * @return estados tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class EstadoEquipo implements ValueObject<EstadoEquipo.Estados> {

    private Estados estados;

    public EstadoEquipo(Estados estados) {
        this.estados = Objects.requireNonNull(estados);
    }

    public enum Estados {
        BUENO, REGULAR, DAÑADO
    }

    @Override
    public EstadoEquipo.Estados value() {
        return estados;
    }
}
