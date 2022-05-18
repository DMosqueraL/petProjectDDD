package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdUsuario;
import co.com.sofka.domain.generic.Entity;

public class Usuario extends Entity<IdUsuario> {

    protected DocumentoUsuario numeroDocumento;

    public Usuario(IdUsuario idUsuario, DocumentoUsuario numeroDocumento) {
        super(idUsuario);
        this.numeroDocumento = numeroDocumento;
    }

    public void generarReclamo(DocumentoUsuario documentoUsuario){
        this.numeroDocumento = documentoUsuario;
    }

}
