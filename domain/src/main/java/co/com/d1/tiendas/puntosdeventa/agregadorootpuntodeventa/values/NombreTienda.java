package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values;

import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que le permite a los puntos de venta del dominio el nombre de la tienda
 * Hace parte de un [OV] superior DetallePuntoDeVenta
 * @return nombreTienda tipo Nombre - [OV] Genérico
 * @Autores Andrés Lozada y Doris Mosquera
 */
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
