package co.com.d1.tiendas.puntosdeventa.agregadocaja.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar el serial o número de serie del equipo de computo
 * @return serial tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class NumeroSerieEquipoComputo implements ValueObject<String> {
    private final String serial;

    public NumeroSerieEquipoComputo(String serial) {
        this.serial = Objects.requireNonNull(serial);

        if (this.serial.isBlank()) {
            throw new IllegalArgumentException("Las especificaciones del equipo no pueden estar en blanco.");
        }

    }

    @Override
    public String value() {
        return serial;
    }
}
