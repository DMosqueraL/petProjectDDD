package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.CantidadProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Map;

public class FacturaCreada extends DomainEvent {

    private final DetalleFactura detalleFactura;
    private final Map<IdProducto, Producto> producto;
    private final DocumentoUsuario documentoUsuario;
    private final CantidadProducto cantidadProducto;
    public FacturaCreada(DetalleFactura detalleFactura, Map<IdProducto, Producto> producto, DocumentoUsuario documentoUsuario, CantidadProducto cantidadProducto) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.FacturaCreada");
        this.detalleFactura = detalleFactura;
        this.producto = producto;
        this.documentoUsuario = documentoUsuario;
        this.cantidadProducto = cantidadProducto;
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

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }
}
