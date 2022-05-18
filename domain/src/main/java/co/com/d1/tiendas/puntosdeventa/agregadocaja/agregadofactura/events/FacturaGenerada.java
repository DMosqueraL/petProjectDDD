package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Map;

/**
 * [EV] Evento donde se ha generado una factura en caja en el punto de venta o tienda D1
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class FacturaGenerada extends DomainEvent {

    private final IdFactura idFactura;
    private final DetalleFactura detalleFactura;
    private final DocumentoUsuario numeroIdentificacion;
    private final Map<IdProducto, Producto> productos;

    private final Cantidad cantidadProducto;

    public FacturaGenerada(IdFactura idFactura, DetalleFactura detalleFactura, DocumentoUsuario numeroIdentificacion, Map<IdProducto, Producto> productos, Cantidad cantidadProducto) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.FacturaGenerada");
        this.idFactura = idFactura;
        this.detalleFactura = detalleFactura;
        this.numeroIdentificacion = numeroIdentificacion;
        this.productos = productos;
        this.cantidadProducto = cantidadProducto;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public DocumentoUsuario getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public Map<IdProducto, Producto> getProductos() {
        return productos;
    }

    public Cantidad getCantidadProducto() {
        return cantidadProducto;
    }
}
