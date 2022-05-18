package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.commands;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdUsuario;
import co.com.sofka.domain.generic.Command;

import java.util.Map;

public class CrearFactura extends Command {

    private final IdFactura idFactura;
    private final IdUsuario idUsuario;
    private final DetalleFactura detalleFactura;
    private final Map<IdProducto, Producto> productos;

    public CrearFactura(IdFactura idFactura,
                        IdUsuario idUsuario,
                        DetalleFactura detalleFactura,
                        Map<IdProducto, Producto> productos) {
        this.idFactura = idFactura;
        this.idUsuario = idUsuario;
        this.detalleFactura = detalleFactura;
        this.productos = productos;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public Map<IdProducto, Producto> getProductos() {
        return productos;
    }
}
