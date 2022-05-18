package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.values;

import co.com.d1.tiendas.puntosdeventa.genericos.Direccion;
import co.com.d1.tiendas.puntosdeventa.genericos.Telefono;
import co.com.sofka.domain.generic.ValueObject;

import java.util.List;

public class DetallePuntoDeVenta implements ValueObject<List<Object>> {

    private final Direccion direccion;
    private final Ciudad ciudad;
    private final Telefono telefono;
    private final Nit nit;
    private final NombreTienda nombreTienda;

    private final List<Object> value = null;

    public DetallePuntoDeVenta(Direccion direccion, Ciudad ciudad, Telefono telefono,
                               Nit nit, NombreTienda nombreTienda) {

        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.nit = nit;
        this.nombreTienda = nombreTienda;

        this.value.add(direccion);
        this.value.add(ciudad);
        this.value.add(telefono);
        this.value.add(nit);
        this.value.add(nombreTienda);
    }

    @Override
    public List<Object> value() {
        return value;
    }
}
