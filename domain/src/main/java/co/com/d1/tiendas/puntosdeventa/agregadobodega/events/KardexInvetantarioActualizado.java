package co.com.d1.tiendas.puntosdeventa.agregadobodega.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.sofka.domain.generic.DomainEvent;


/**
 * [CM] Comando que ejecuta un usuario del sistema a través de una interfaz para actualizar el
 * kardex del inventario de bodega del punto de venta o tienda D1
 * @Autores: Andrés Lozano y Doris Mosquera
 */
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
