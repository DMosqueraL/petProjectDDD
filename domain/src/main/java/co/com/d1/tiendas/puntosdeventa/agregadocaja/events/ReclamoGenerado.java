package co.com.d1.tiendas.puntosdeventa.agregadocaja.events;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdFactura;
import co.com.sofka.domain.generic.DomainEvent;

public class ReclamoGenerado extends DomainEvent {
    public ReclamoGenerado(IdFactura idFactura, DocumentoUsuario documentoUsuario) {
        super(id);
    }
}
