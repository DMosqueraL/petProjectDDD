package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que le permite a los puntos de venta del dominio determinar la ciudad donde
 * se encuentran ubicados - Hace parte de un [OV] superior DetallePuntoDeVenta
 * @return ciudad tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class Ciudad implements ValueObject<String> {

    private final String ciudad;

    public Ciudad(String ciudad) {
        this.ciudad = Objects.requireNonNull(ciudad);

        if (this.ciudad.isBlank()){
            throw new IllegalArgumentException("La ciudad no puede estar vacio");
        }

        if(this.ciudad.length() > 50){
            throw new IllegalArgumentException("La ciudad no permite mas de 50 caracteres");
        }

    }

    @Override
    public String value() {
        return ciudad;
    }
}
