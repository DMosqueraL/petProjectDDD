package co.com.d1.tiendas.puntosdeventa.agregadobodega.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreProductoActualizado extends DomainEvent {

    private final IdProducto idProducto;
    private final Nombre nombreProducto;

    public NombreProductoActualizado(IdProducto idProducto, Nombre nombreProducto) {
        super("co.com.d1.tiendas.puntosdeventa.agregadobodega.NombreProductoActualizado");
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Nombre getNombreProducto() {
        return nombreProducto;
    }
}
