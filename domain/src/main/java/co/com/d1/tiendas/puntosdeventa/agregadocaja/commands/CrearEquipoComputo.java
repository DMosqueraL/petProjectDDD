package co.com.d1.tiendas.puntosdeventa.agregadocaja.commands;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.MarcaEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.NumeroSerieEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.Command;

/**
 * [CM] Comando que ejecuta un usuario del sistema a través de una interfaz para crear un equipo de
 * computo para una caja en el punto de venta o tienda D1
 * @Autores: Andrés Lozano y Doris Mosquera
 */
public class CrearEquipoComputo extends Command {
    private final IdEquipoComputo idEquipoComputo;
    private final Nombre nombreEquipoComputo;
    private final MarcaEquipoComputo marcaEquipoComputo;
    private final NumeroSerieEquipoComputo serialEquipoComputo;

    public CrearEquipoComputo(IdEquipoComputo idEquipoComputo,
                              Nombre nombreEquipoComputo,
                              MarcaEquipoComputo marcaEquipoComputo,
                              NumeroSerieEquipoComputo serialEquipoComputo) {
        this.idEquipoComputo = idEquipoComputo;
        this.nombreEquipoComputo = nombreEquipoComputo;
        this.marcaEquipoComputo = marcaEquipoComputo;
        this.serialEquipoComputo = serialEquipoComputo;
    }

    public IdEquipoComputo getIdEquipoComputo() {
        return idEquipoComputo;
    }

    public Nombre getNombreEquipoComputo() {
        return nombreEquipoComputo;
    }

    public MarcaEquipoComputo getMarcaEquipoComputo() {
        return marcaEquipoComputo;
    }

    public NumeroSerieEquipoComputo getSerialEquipoComputo() {
        return serialEquipoComputo;
    }
}
