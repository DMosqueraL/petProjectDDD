package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar la categoria del producto
 * @return categoria tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class Categoria implements ValueObject<String> {

    private final String categoria;

    public Categoria(String categoria) {
        this.categoria = Objects.requireNonNull(categoria);

        if (this.categoria.isBlank()){
            throw new IllegalArgumentException("El nombre de la categoria no puede estar vacio");
        }

        if(this.categoria.length() > 50){
            throw new IllegalArgumentException("El nombre de la categoria no permite mas de 50 caracteres");
        }
    }

    @Override
    public String value() {
        return categoria;
    }
}
