package co.com.d1.tiendas.puntosdeventa.agregadobodega;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.EstadoEquipo;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdEquipo;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.Entity;

/**
 * [E] Entidad Equipo que permite asignar a la bodega del punto de venta o tienda D1 los equipos
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class Equipo extends Entity<IdEquipo> {

    protected Nombre nombre;
    protected Cantidad cantidad;

    protected EstadoEquipo estadoEquipo;

    public Equipo(IdEquipo entityId, Nombre nombreEquipo, EstadoEquipo estadoEquipo) {
        super(entityId);
    }

    public Equipo(IdEquipo idEquipo, Nombre nombre,
                  Cantidad cantidad, EstadoEquipo estadoEquipo) {

        super(idEquipo);
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.estadoEquipo = new EstadoEquipo(EstadoEquipo.Estados.BUENO);
    }

    public void reportarEquipoDañado(IdEquipo idEquipo, Nombre nombre, EstadoEquipo estadoEquipo){

        if (nombre.value().isBlank()){
            throw new IllegalArgumentException("No puede reportar un equipo dañado con su nombre vacio");
        }

        if(idEquipo.value().isBlank()){
            throw new IllegalArgumentException("No puede reportar un equipo dañado con su id vacio");
        }

        if(String.valueOf(estadoEquipo.value()).isBlank()){
            throw new IllegalArgumentException("No puede reportar un equipo dañado con su estado" +
                                                  " del equipo vacio");
        }

        this.estadoEquipo = estadoEquipo;
    }
}
