package co.com.d1.tiendas.puntosdeventa.agregadobodega.commands;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdBodega;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.sofka.domain.generic.Command;

public class ActualizarKardexInventario extends Command {

    private final IdBodega idBodega;

    private final IdProducto idProducto;

    private final Cantidad cantidad;

    public ActualizarKardexInventario(IdBodega idBodega, IdProducto idProducto, Cantidad cantidad) {
        this.idBodega = idBodega;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public IdBodega getIdBodega() {
        return idBodega;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
