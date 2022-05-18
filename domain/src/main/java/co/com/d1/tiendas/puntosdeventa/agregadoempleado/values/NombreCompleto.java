package co.com.d1.tiendas.puntosdeventa.agregadoempleado.values;

import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que le permite al agredado Empleado determinar su nombre y apellido
 * @return nombre de tipo Nombre
 * @return apellido de tipo Apellido
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class NombreCompleto implements ValueObject<String> {

    private final Nombre nombre;
    private final Apellido apellido;

    public NombreCompleto(Nombre nombre, Apellido apellido) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);

        if (this.nombre.value().isBlank() || this.apellido.value().isBlank()){
            throw new IllegalArgumentException("El nombre o el apellido no pueden estar vacio");
        }

        if(this.nombre.value().length() > 50 || this.apellido.value().length() > 50){
            throw new IllegalArgumentException("El nombre o el apellido no permite mas de 50 caracteresde");
        }
    }

    @Override
    public String value() {
        String nombreCompleto = this.nombre.value().concat(apellido.value());
        return nombreCompleto;
    }
}
