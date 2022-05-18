package co.com.d1.tiendas.puntosdeventa.agregadoempleado.values;

import co.com.sofka.domain.generic.Identity;

public class IdEmpleado extends Identity {

    public IdEmpleado(String idEmpleado) {
        super(idEmpleado);
    }

    public static IdEmpleado of(String idEmpleado){
        return new IdEmpleado(idEmpleado);
    }
}
