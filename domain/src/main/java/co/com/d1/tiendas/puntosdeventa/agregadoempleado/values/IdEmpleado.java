package co.com.d1.tiendas.puntosdeventa.agregadoempleado.values;

import co.com.sofka.domain.generic.Identity;

/**
 * [OV] Objeto de Valor que permite identificar al agregado Empleado por medio de su id.
 * @return idEmpleado tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class IdEmpleado extends Identity {

    public IdEmpleado(String idEmpleado) {
        super(idEmpleado);
    }

    public static IdEmpleado of(String idEmpleado){
        return new IdEmpleado(idEmpleado);
    }
}
