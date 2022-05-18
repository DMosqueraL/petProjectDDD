package co.com.d1.tiendas.puntosdeventa.agregadobodega;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.BodegaCreada;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.EquipoDañadoReportado;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.KardexInvetantarioActualizado;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.NombreProductoActualizado;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.EstadoEquipo;
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

        apply((NombreProductoActualizado event) ->{
            var idProducto = event.getIdProducto();
            var nombreProducto = event.getNombreProducto();
            bodega.productos.put(idProducto, new Producto(idProducto, nombreProducto));
        });

        apply((EquipoDañadoReportado event) ->{
            var idEquipo = event.getIdEquipo();
            var nombreEquipo = event.getNombreEquipo();
            var estadoEquipo = event.getEstadoEquipo();
            bodega.equipos.put(idEquipo, new Equipo(idEquipo, nombreEquipo, new EstadoEquipo(EstadoEquipo.Estados.DAÑADO)));
        });

    }
}
