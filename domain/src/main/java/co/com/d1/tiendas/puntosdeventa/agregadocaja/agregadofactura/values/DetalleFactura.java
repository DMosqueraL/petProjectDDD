package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values;

import co.com.d1.tiendas.puntosdeventa.DetallePuntoDeVenta;
import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class DetalleFactura implements ValueObject<List<Object>> {

    private final FechaFactura fechaFactura;
    private final Monto montoFactura;
    private final Double IVA;
    private final DetallePuntoDeVenta detalleTienda;
    private final List<Object> value = null;

    public DetalleFactura(FechaFactura fechaFactura,
                          Monto montoFactura,
                          DetallePuntoDeVenta detalleTienda) {

        this.fechaFactura = Objects.requireNonNull(fechaFactura);
        this.montoFactura = Objects.requireNonNull(montoFactura);
        this.IVA = 0.19;
        this.detalleTienda = Objects.requireNonNull(detalleTienda);

        this.value.add(fechaFactura);
        this.value.add(montoFactura);
        this.value.add(IVA);
        this.value.add(detalleTienda);

    }

    @Override
    public List<Object> value() {
        return value;
    }
}
