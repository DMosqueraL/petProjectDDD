package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.MarcaEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.NumeroSerieEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * [EV] Evento donde se ha reemplazado un equipo de computo en una caja en el punto de venta o tienda D1
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class EquipoComputoReemplazado extends DomainEvent {

    private final IdEquipoComputo idEquipoComputo;
    private final Nombre nombreEquipo;
    private final MarcaEquipoComputo marcaEquipoComputo;
    private final NumeroSerieEquipoComputo serial;
    public EquipoComputoReemplazado(IdEquipoComputo idEquipoComputo,
                                    Nombre nombreEquipo,
                                    MarcaEquipoComputo marca,
                                    NumeroSerieEquipoComputo serial) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.EquipoComputoReemplazado");
        this.idEquipoComputo = idEquipoComputo;
        this.nombreEquipo = nombreEquipo;
        this.marcaEquipoComputo = marca;
        this.serial = serial;
    }

    public IdEquipoComputo getIdEquipoComputo() {
        return idEquipoComputo;
    }

    public Nombre getNombreEquipo() {
        return nombreEquipo;
    }

    public MarcaEquipoComputo getMarcaEquipoComputo() {
        return marcaEquipoComputo;
    }

    public NumeroSerieEquipoComputo getSerial() {
        return serial;
    }
}
