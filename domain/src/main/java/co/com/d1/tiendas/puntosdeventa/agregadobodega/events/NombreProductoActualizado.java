package co.com.d1.tiendas.puntosdeventa.agregadobodega.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * [CM] Comando que ejecuta un usuario del sistema a través de una interfaz para actualizar el nombre
 * de un producto de la bodega del punto de venta o tienda D1
 * @Autores: Andrés Lozano y Doris Mosquera
 */
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
