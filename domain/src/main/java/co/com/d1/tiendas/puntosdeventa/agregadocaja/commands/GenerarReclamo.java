package co.com.d1.tiendas.puntosdeventa.agregadocaja.commands;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.Factura;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.sofka.domain.generic.Command;

/**
 * [CM] Comando que ejecuta un usuario del sistema a través de una interfaz para generar un
 * reclamo en el punto de venta o tienda D1
 * @Autores: Andrés Lozano y Doris Mosquera
 */
public class GenerarReclamo extends Command {
    private final IdFactura idFactura;
    private final Factura factura;
    private final DocumentoUsuario documentoUsuario;

    public GenerarReclamo(IdFactura idFactura,
                          Factura factura,
                          DocumentoUsuario documentoUsuario) {
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
