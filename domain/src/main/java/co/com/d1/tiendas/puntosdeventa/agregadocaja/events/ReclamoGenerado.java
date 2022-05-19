package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.Factura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * [EV] Evento donde se ha generado un reclamo por parte de un usuario en el punto de venta o tienda D1
 * @Autores: Andrés Lozada y Doris Mosquera
 */
public class ReclamoGenerado extends DomainEvent {

    private final IdFactura idFactura;
    private final Factura factura;
    private final DocumentoUsuario documentoUsuario;
    public ReclamoGenerado(IdFactura idFactura, Factura factura, DocumentoUsuario documentoUsuario) {

        super("co.com.d1.tiendas.puntosdeventa.agregadocaja.ReclamoGenerado");
        this.idFactura = idFactura;
        this.factura = factura;
        this.documentoUsuario = documentoUsuario;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public Factura getFactura() {
        return factura;
    }

    public DocumentoUsuario getDocumentoUsuario() {
        return documentoUsuario;
    }
}
