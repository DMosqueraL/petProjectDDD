package co.com.d1.tiendas.puntosdeventa.agregadobodega.commands;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdBodega;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreProducto extends Command {

    private final IdBodega idBodega;
    private final IdProducto idProducto;
    private final Nombre nombreProducto;


    public ActualizarNombreProducto(IdBodega idBodega, IdProducto idProducto, Nombre nombreProducto) {
        this.idBodega = idBodega;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }

    public IdBodega getIdBodega() {
        return idBodega;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Nombre getNombreProducto() {
        return nombreProducto;
    }
}
