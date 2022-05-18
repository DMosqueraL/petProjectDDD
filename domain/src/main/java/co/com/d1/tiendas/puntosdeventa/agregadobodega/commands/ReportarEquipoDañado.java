package co.com.d1.tiendas.puntosdeventa.agregadobodega.commands;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.EstadoEquipo;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdBodega;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdEquipo;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.Command;

public class ReportarEquipoDañado extends Command {

    private final IdBodega idBodega;

    private final Nombre nombreEquipo;

    private final IdEquipo idEquipo;

    private final EstadoEquipo estadoEquipo;


    public ReportarEquipoDañado(IdBodega idBodega, Nombre nombreEquipo, IdEquipo idEquipo, EstadoEquipo estadoEquipo) {
        this.idBodega = idBodega;
        this.nombreEquipo = nombreEquipo;
        this.idEquipo = idEquipo;
        this.estadoEquipo = estadoEquipo;
    }

    public IdBodega getIdBodega() {
        return idBodega;
    }

    public Nombre getNombreEquipo() {
        return nombreEquipo;
    }

    public IdEquipo getIdEquipo() {
        return idEquipo;
    }

    public EstadoEquipo getEstadoEquipo() {
        return estadoEquipo;
    }
}
