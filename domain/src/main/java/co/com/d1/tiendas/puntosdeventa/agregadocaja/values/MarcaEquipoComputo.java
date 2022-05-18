package co.com.d1.tiendas.puntosdeventa.agregadocaja.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar la marca del equipo de computo
 * @return marca tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class MarcaEquipoComputo implements ValueObject<String>{

    private final String marca;

    public MarcaEquipoComputo(String marca) {
        this.marca = Objects.requireNonNull(marca);

        if (this.marca.isBlank()) {
            throw new IllegalArgumentException("Las especificaciones del equipo no pueden estar en blanco.");
        }

    }

    @Override
    public String value() {
        return marca;
    }

}
