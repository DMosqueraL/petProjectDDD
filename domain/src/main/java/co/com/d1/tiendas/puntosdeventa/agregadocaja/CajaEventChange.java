package co.com.d1.tiendas.puntosdeventa.agregadocaja;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.agregadofactura.Factura;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.CajaCreada;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.EquipoComputoCreado;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.EquipoComputoReemplazado;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.events.FacturaCreada;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.MarcaEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.NumeroSerieEquipoComputo;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.EventChange;

public class CajaEventChange extends EventChange {
    public CajaEventChange(Caja caja) {

        apply((CajaCreada event) -> {
            caja.idEmpleadoCaja = event.getIdEmpleadoCaja();
            caja.equipoComputo = event.getEquipoComputo();
            caja.tipoCaja = event.getTipoCaja();
        });

        apply((EquipoComputoCreado event) -> {
            var idEquipoComputo = event.getIdEquipoComputo();
            var equipoComputo = new EquipoComputo(idEquipoComputo,
                    event.getNombreEquipo(),
                    event.getMarca(),
                    event.getSerial());
            caja.equipoComputo = equipoComputo;
        });

        apply((EquipoComputoReemplazado event) -> {
            var idEquipoComputo = event.getIdEquipoComputo();
            caja.equipoComputo.nombreEquipo = new Nombre(
                    event.getNombreEquipo().value());
            caja.equipoComputo.marca = new MarcaEquipoComputo(
                    event.getMarcaEquipoComputo().value());
            caja.equipoComputo.serial = new NumeroSerieEquipoComputo(
                    event.getSerial().value());
        });

        apply((FacturaCreada event) -> {
            var idFactura = event.getIdFactura();
            var factura = new Factura(idFactura,
                    event.getDetalleFactura(),
                    event.getDocumentoUsuario(),
                    event.getProducto(),
                    event.getCantidadProducto()
            );
        });

        apply((FacturaImpresa event) -> {
            var idFactura = event.getIdFactura();
            var idCaja = event.getIdCaja();

            var factura = new FacturaImpresa(idFactura, event.getFactura(), idCaja);
        });

        apply((ReclamoGenerado event) -> {
            var idFactura = event.getIdFactura();
            var factura = event.getFactura();
            var documento = event.getDocumentoUsuario();

            var reclamo = new ReclamoGenerado(idFactura,factura,documento);
        });
    }
}
