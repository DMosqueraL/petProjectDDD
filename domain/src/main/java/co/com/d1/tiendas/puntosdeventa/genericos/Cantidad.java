package co.com.d1.tiendas.puntosdeventa.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor générico que puede ser utilizado por varias entidades, otros objetos de valor y/o
 * agregados para  determinar la cantidad de su(s) parámetro(s)
 * @return cantidad de tipo Interger
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class Cantidad implements ValueObject<Integer> {

    private final Integer cantidad;

    public Cantidad(Integer cantidad) {
        this.cantidad = Objects.requireNonNull(cantidad);

        if (this.cantidad <= 0){
            throw new IllegalArgumentException("La cantidad del producto no puede ser menor o igual a 0");
        }

        if (String.valueOf(this.cantidad).isBlank()){
            throw new IllegalArgumentException("La cantidad del producto no puede estar vacio");
        }

        if (!this.cantidad.equals(this.cantidad.intValue())){
            throw new IllegalArgumentException("La cantidad del producto no puede tener decimales");
        }
    }

    @Override
    public Integer value() {
        return cantidad;
    }
}
