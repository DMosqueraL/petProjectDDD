package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que le permite a los puntos de venta del dominio determinar la cantidad
 * de estanterias que posee  la tienda
 * @return estanteria tipo Integer
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class Estanteria implements ValueObject<Integer> {

    private final Integer estanteria;

    public Estanteria(Integer estanteria) {
        this.estanteria = Objects.requireNonNull(estanteria);

        if (this.estanteria <= 0){
            throw new IllegalArgumentException("El punto de venta no puede tener 0 estantes");
        }

        if (String.valueOf(this.estanteria).isBlank()){
            throw new IllegalArgumentException("La estanteria no puede estar vacio en su campo");
        }

        if (!this.estanteria.equals(this.estanteria.intValue())){
            throw new IllegalArgumentException("La estanteria no puede tener decimales");
        }
    }

    @Override
    public Integer value() {
        return estanteria;
    }
}
