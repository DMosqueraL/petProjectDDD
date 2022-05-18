package co.com.d1.tiendas.puntosdeventa.agregadobodega;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.BodegaCreada;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.EquipoDañadoReportado;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.KardexInvetantarioActualizado;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.NombreProductoActualizado;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.EstadoEquipo;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdBodega;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdEquipo;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.KardexInventario;
import co.com.d1.tiendas.puntosdeventa.empleado.Empleado;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

public class Bodega extends AggregateEvent<IdBodega> {

    protected Empleado empleadoBodega;
    protected Map<IdProducto, Producto> productos;
    protected Map<IdEquipo, Equipo> equipos;

    protected KardexInventario inventario;

    public Bodega(IdBodega entityId, Empleado empleadoBodega, Map<IdProducto, Producto> productos,
                  Map<IdEquipo, Equipo> equipos, KardexInventario inventario) {

        super(entityId);
        appendChange(new BodegaCreada(empleadoBodega, inventario, equipos, productos)).apply();
        subscribe(new BodegaEventChange(this));
    }

    public Bodega(IdBodega idBodega) {
        super(idBodega);
        subscribe(new BodegaEventChange(this));
    }

    public static Bodega from(IdBodega idBodega, List<DomainEvent> events){
        var bodega = new Bodega(idBodega);
        events.forEach(bodega::applyEvent);
        return bodega;
    }

    public void actualizarKardexInventario(Cantidad cantidad, IdProducto idProducto) {
        appendChange(new KardexInvetantarioActualizado(idProducto, cantidad)).apply(); }

    public void actualizarNombreProducto(IdProducto idProducto, Nombre nombreProducto){
        appendChange(new NombreProductoActualizado(idProducto, nombreProducto));
    }

    public void reportarEquipoDañado(IdEquipo idEquipo, Nombre nombreEquipo, EstadoEquipo estadoEquipo){
        appendChange(new EquipoDañadoReportado(idEquipo, nombreEquipo, estadoEquipo));
    }

    public Empleado empleadoBodega() {
        return empleadoBodega;
    }

    public Map<IdProducto, Producto> productos() {
        return productos;
    }

    public Map<IdEquipo, Equipo> equipos() {
        return equipos;
    }

    public KardexInventario inventario() {
        return inventario;
    }
}