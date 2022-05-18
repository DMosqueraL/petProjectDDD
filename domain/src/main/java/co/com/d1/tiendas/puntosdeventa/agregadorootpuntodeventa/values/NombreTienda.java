package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values;

import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreTienda implements ValueObject<Object> {

    private final Nombre nombreTienda;

    public NombreTienda(Nombre nombreTienda) {
        this.nombreTienda = Objects.requireNonNull(nombreTienda);

        if (this.nombreTienda.value().isBlank()){
            throw new IllegalArgumentException("El nombre de la tienda no puede estar vacio");
        }

        if(this.nombreTienda.value().length() > 50){
            throw new IllegalArgumentException("El nombre de la tienda no permite mas de 50 caracteres");
        }
    }

    @Override
    public Object value() {
        return nombreTienda;
    }
}
