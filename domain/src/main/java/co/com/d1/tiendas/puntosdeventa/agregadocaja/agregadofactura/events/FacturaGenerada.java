package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.events;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.Producto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.CantidadProducto;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DetalleFactura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Map;

public class FacturaGenerada extends DomainEvent {

    private final IdFactura idFactura;
    private final DetalleFactura detalleFactura;
    private final DocumentoUsuario numeroIdentificacion;
    Map<IdProducto, Producto> productos

    public FacturaGenerada(IdFactura idFactura, DetalleFactura detalleFactura, DocumentoUsuario numeroIdentificacion, Map<IdProducto, Producto> productos, CantidadProducto cantidadProducto) {
        super(id);
    }
}
