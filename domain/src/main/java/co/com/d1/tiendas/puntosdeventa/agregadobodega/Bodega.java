package co.com.d1.tiendas.puntosdeventa.agregadobodega;

import co.com.d1.tiendas.puntosdeventa.Empleado;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.events.BodegaCreada;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdBodega;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.KardexInventario;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Bodega extends AggregateEvent<IdBodega> {

    protected Empleado empleadoBodega;
    protected Set<Producto> listaProductos;
    protected Set<Equipo> listaEquipos;
    protected KardexInventario inventario;

    public Bodega(IdBodega idBodega, Empleado empleadoBodega, Set<Producto> listaProductos,
                  Set<Equipo> listaEquipos, KardexInventario inventario) {
        super(idBodega);
        appendChange(new BodegaCreada(empleadoBodega, idBodega, inventario, listaEquipos, listaProductos)).apply();
        subscribe(new BodegaEventChange(this));
    }

    public Bodega(IdBodega idBodega) {
        super(idBodega);
        subscribe(new BodegaEventChange(this));
    }

    public void actualizarKardexInventario() {

    }

    public void agregarProducto(){

    }

    public void reportarEquipoDañado(){

    }

}
