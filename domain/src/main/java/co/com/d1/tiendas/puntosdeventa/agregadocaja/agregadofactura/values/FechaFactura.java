package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;

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
