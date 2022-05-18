package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.CantidadProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaCreada extends DomainEvent {

    private final DetalleFactura detalleFactura;
    private final Set<Producto> producto;
    private final DocumentoUsuario documentoUsuario;
    private final CantidadProducto cantidadProducto;
    public FacturaCreada(DetalleFactura detalleFactura, DocumentoUsuario documentoUsuario, CantidadProducto cantidadProducto) {
        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.FacturaCreada");
        this.detalleFactura = detalleFactura;
        this.documentoUsuario = documentoUsuario;
        this.cantidadProducto = cantidadProducto;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public Set<Producto> getProducto() {
        return producto;
    }

    public DocumentoUsuario getDocumentoUsuario() {
        return documentoUsuario;
    }

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }
}
