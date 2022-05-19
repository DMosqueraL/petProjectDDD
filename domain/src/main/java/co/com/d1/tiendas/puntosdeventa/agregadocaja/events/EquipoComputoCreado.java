package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.MarcaEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.NumeroSerieEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * [EV] Evento donde se ha creado un equipo de computo en una caja en el punto de venta o tienda D1
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class EquipoComputoCreado extends DomainEvent {

    private final IdEquipoComputo idEquipoComputo;
    private final Nombre nombreEquipo;
    private final MarcaEquipoComputo marca;
    private final NumeroSerieEquipoComputo serial;

    public EquipoComputoCreado(IdEquipoComputo idEquipoComputo, Nombre nombreEquipo, MarcaEquipoComputo marca, NumeroSerieEquipoComputo serial){
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.EquipoComputoCreado");
        this.idEquipoComputo = idEquipoComputo;
        this.nombreEquipo = nombreEquipo;
        this.marca = marca;
        this.serial = serial;
    }

    public IdEquipoComputo getIdEquipoComputo() {
        return idEquipoComputo;
    }

    public Nombre getNombreEquipo() {
        return nombreEquipo;
    }

    public MarcaEquipoComputo getMarca() {
        return marca;
    }

    public NumeroSerieEquipoComputo getSerial() {
        return serial;
    }
}
