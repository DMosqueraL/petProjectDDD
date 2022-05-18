package co.com.d1.tiendas.puntosdeventa.agregadobodega.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Equipo;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdEquipo;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.KardexInventario;
import co.com.d1.tiendas.puntosdeventa.empleado.Empleado;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Map;

public class BodegaCreada extends DomainEvent {


    private Empleado empleadoBodega;
    private KardexInventario inventario;
    private Map<IdEquipo, Equipo> equipos;
    private Map<IdProducto, Producto> productos;

    public BodegaCreada(Empleado empleadoBodega, KardexInventario inventario,
                        Map<IdEquipo, Equipo> equipos, Map<IdProducto, Producto> productos) {
        super("co.com.d1.tiendas.puntosdeventa.agregadobodega.BodegaCreada");
        this.empleadoBodega = empleadoBodega;
        this.inventario = inventario;
        this.equipos = equipos;
        this.productos = productos;
    }

    public Empleado getEmpleadoBodega() {
        return empleadoBodega;
    }

    public KardexInventario getInventario() {
        return inventario;
    }

    public Map<IdEquipo, Equipo> getEquipos() {
        return equipos;
    }

    public Map<IdProducto, Producto> getProductos() {
        return productos;
    }
}
