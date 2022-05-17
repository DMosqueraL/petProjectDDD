package co.com.d1.tiendas.puntosdeventa.agregadobodega.events;

import co.com.d1.tiendas.puntosdeventa.Empleado;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.Equipo;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdBodega;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.KardexInventario;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class BodegaCreada extends DomainEvent {
    public BodegaCreada(Empleado empleadoBodega, IdBodega idBodega, KardexInventario inventario, Set<Equipo> listaEquipos, Set<Producto> listaProductos) {
        super();
    }
}
