package co.com.d1.tiendas.puntosdeventa.agregadobodega;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.BodegaCreada;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.KardexInvetantarioActualizado;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashMap;

public class BodegaEventChange extends EventChange {
    public BodegaEventChange(Bodega bodega) {
        apply((BodegaCreada event) -> {
            bodega.empleadoBodega = event.getEmpleadoBodega();
            bodega.productos = new HashMap<>();
            bodega.equipos = new HashMap<>();
            bodega.inventario = event.getInventario();
        });

        apply((KardexInvetantarioActualizado event) ->{
            var cantidad = new Cantidad(event.getCantidad().value());
            var idProducto = event.getIdProducto();
            bodega.productos.put(idProducto, new Producto(idProducto, cantidad));
        });


    }
}
