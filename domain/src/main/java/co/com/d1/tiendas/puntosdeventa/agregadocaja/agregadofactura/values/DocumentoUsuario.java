package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


/**
 * [OV] Objeto de Valor que permite determinar o asignar el documento de identidad de un usuario
 * @return documento tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class DocumentoUsuario implements ValueObject<String> {
    private final String documento;

    public DocumentoUsuario(String documento) {
        this.documento = Objects.requireNonNull(documento);

        if(this.documento.isBlank()){
            throw new IllegalArgumentException("El documento de identidad no puede estar en blanco.");
        }
    }

    @Override
    public String value() {
        return documento;
    }
}
