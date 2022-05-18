package co.com.d1.tiendas.puntosdeventa.agregadobodega.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.KardexInventario;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.sofka.domain.generic.DomainEvent;

public class KardexInvetantarioActualizado extends DomainEvent {

    private final IdProducto idProducto;
    private final Cantidad cantidad;

    public KardexInvetantarioActualizado(IdProducto idProducto, Cantidad cantidad) {
        super("co.com.d1.tiendas.puntosdeventa.agregadobodega.KardexInvetantarioActualizado");
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
