package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Map;

/**
 * [EV] Evento donde se ha creado una factura de caja en el punto de venta o tienda D1
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class FacturaCreada extends DomainEvent {
    private final IdFactura idFactura;
    private final DetalleFactura detalleFactura;
    private final Map<IdProducto, Producto> producto;
    private final DocumentoUsuario documentoUsuario;
    private final Cantidad cantidadProducto;
    public FacturaCreada(IdFactura idFactura,
                         DetalleFactura detalleFactura,
                         Map<IdProducto, Producto> producto,
                         DocumentoUsuario documentoUsuario,
                         Cantidad cantidadProducto) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.FacturaCreada");
        this.idFactura = idFactura;
        this.detalleFactura = detalleFactura;
        this.producto = producto;
        this.documentoUsuario = documentoUsuario;
        this.cantidadProducto = cantidadProducto;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public Map<IdProducto, Producto> getProducto() {
        return producto;
    }

    public DocumentoUsuario getDocumentoUsuario() {
        return documentoUsuario;
    }

    public Cantidad getCantidadProducto() {
        return cantidadProducto;
    }
}
