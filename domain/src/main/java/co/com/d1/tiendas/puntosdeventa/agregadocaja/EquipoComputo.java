package co.com.d1.tiendas.puntosdeventa.agregadocaja;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.MarcaEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.NumeroSerieEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.Entity;

/**
 * [E] Entidad EquipoComputo que permite asignar a la caja del punto de venta o tienda D1 un equipo de computo
 * (Caja Registradora)
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class EquipoComputo extends Entity<IdEquipoComputo> {

    protected Nombre nombreEquipo;
    protected MarcaEquipoComputo marca;
    protected NumeroSerieEquipoComputo serial;

    public EquipoComputo(IdEquipoComputo idEquipoComputo,
                         Nombre nombreEquipo,
                         MarcaEquipoComputo marca,
                         NumeroSerieEquipoComputo serial) {
        super(idEquipoComputo);
        this.nombreEquipo=nombreEquipo;
        this.marca = marca;
        this.serial = serial;
    }

    public void reemplazarEquipoComputo(IdEquipoComputo idEquipoComputo,
                                        Nombre nombreEquipo,
                                        MarcaEquipoComputo marca,
                                        NumeroSerieEquipoComputo serial){
        var equipoNuevo = new EquipoComputo(idEquipoComputo, nombreEquipo, marca, serial);
    }
}
