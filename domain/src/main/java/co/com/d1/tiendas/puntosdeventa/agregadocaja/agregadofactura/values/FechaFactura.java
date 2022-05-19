package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;

/**
 * [OV] Objeto de Valor que permite determinar la fecha de creación de la factura
 * hace parte de un [OV] superior - DetalleFactura
 * @return marca tipo String
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class FechaFactura implements ValueObject<LocalDateTime> {

    private final LocalDateTime fechaFactura;


    public FechaFactura(LocalDateTime fechaFactura) {
        this.fechaFactura = LocalDateTime.now();
    }

    @Override
    public LocalDateTime value() {
        return fechaFactura;
    }
}
