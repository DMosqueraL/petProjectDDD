package co.com.d1.tiendas.puntosdeventa.agregadobodega.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.EstadoEquipo;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdEquipo;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class EquipoDañadoReportado extends DomainEvent {

    private final IdEquipo idEquipo;
    private final Nombre nombreEquipo;
    private final EstadoEquipo estadoEquipo;

    public EquipoDañadoReportado(IdEquipo idEquipo, Nombre nombreEquipo, EstadoEquipo estadoEquipo) {
        super("co.com.d1.tiendas.puntosdeventa.agregadobodega.EquipoDañadoReportado");
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.estadoEquipo = estadoEquipo;
    }

    public IdEquipo getIdEquipo() {
        return idEquipo;
    }

    public Nombre getNombreEquipo() {
        return nombreEquipo;
    }

    public EstadoEquipo getEstadoEquipo() {
        return estadoEquipo;
    }
}
