package co.com.d1.tiendas.puntosdeventa.agregadobodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que permite determinar el kardex de productos del inventario
 * @return inventario tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class KardexInventario implements ValueObject<String> {

    private final String inventario;

    public KardexInventario(String inventario) {
        this.inventario = Objects.requireNonNull(inventario);

        if (this.inventario.isBlank()){
            throw new IllegalArgumentException("El inventario no puede estar vacio");
        }

        if(this.inventario.length() > 50){
            throw new IllegalArgumentException("El inventario no permite mas de 50 caracteres");
        }
    }

    @Override
    public String value() {
        return inventario;
    }
}
