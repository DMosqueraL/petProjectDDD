package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.MarcaEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.NumeroSerieEquipoComputo;
import co.com.sofka.domain.generic.DomainEvent;

public class EquipoComputoReemplazado extends DomainEvent {
    public EquipoComputoReemplazado(IdEquipoComputo idEquipoComputo, Nombre nombreEquipo, MarcaEquipoComputo marca, NumeroSerieEquipoComputo serial) {
        super(idEquipoComputo);
    }
}
