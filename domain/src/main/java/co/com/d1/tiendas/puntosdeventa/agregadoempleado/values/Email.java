package co.com.d1.tiendas.puntosdeventa.agregadoempleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * [OV] Objeto de Valor que le permite a los empleados del dominio determinar cu correo electrónico
 * @return url tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class Email implements ValueObject<String> {

    private final String url;

    public Email(String url) {
        this.url = Objects.requireNonNull(url);

        if (this.url.isBlank()){
            throw new IllegalArgumentException("La url no puede estar vacía");
        }

        if(this.url.length() > 100){
            throw new IllegalArgumentException("La url no permite más de 100 carácteres");
        }

    }

    @Override
    public String value() {
        return url;
    }
}
