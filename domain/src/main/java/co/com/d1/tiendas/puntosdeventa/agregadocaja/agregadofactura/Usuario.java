package co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.DocumentoUsuario;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.values.IdUsuario;
import co.com.d1.tiendas.puntosdeventa.genericos.Direccion;
import co.com.sofka.domain.generic.Entity;

/**
 * [E] Entidad Usuario que permite asignar a la factura el documento de identidad del usuario
 * @Autores Andrés Lozada y Doris Mosquera
 */
public class Usuario extends Entity<IdUsuario> {
    protected IdUsuario idUsuario;
    protected DocumentoUsuario numeroDocumento;
    protected Direccion direccion;

    public Usuario(IdUsuario idUsuario,
                   DocumentoUsuario numeroDocumento,
                   Direccion direccion) {
        super(idUsuario);
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
    }

    public void cambiarDireccion(IdUsuario idUsuario,
                                 DocumentoUsuario documentoUsuario,
                                 Direccion direccion){
        this.idUsuario = idUsuario;
        this.numeroDocumento = documentoUsuario;
        this.direccion = direccion;

    }

}
