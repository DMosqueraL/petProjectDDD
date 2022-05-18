package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.Caja;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.Empleado;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events.CargoAsignadoEmpleado;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events.EmpleadoCreado;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events.PuntoDeVentaCreado;
import co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.events.TipoDeCajaDesignado;
import co.com.sofka.domain.generic.EventChange;

public class PuntoDeVentaEventChange extends EventChange {
    public PuntoDeVentaEventChange(PuntoDeVenta puntoDeVenta) {

        apply((PuntoDeVentaCreado event) ->{
            puntoDeVenta.detallePuntoDeVenta = event.getDetallePuntoDeVenta();
            puntoDeVenta.idCaja = event.getIdCaja();
            puntoDeVenta.estanteria = event.getEstanteria();
            puntoDeVenta.empleados = event.getEmpleados();
        });

        apply((EmpleadoCreado event) ->{
            var idEmpleado = event.getIdEmpleado();
            var nombreCompleto = event.getNombreCompleto();
            var email = event.getEmail();
            var telefono = event.getTelefono();
            var cargo = event.getCargo();
            puntoDeVenta.empleados.put(idEmpleado, new Empleado(idEmpleado,
                                        nombreCompleto, email, telefono, cargo));
        });

        apply((TipoDeCajaDesignado event) ->{
            var idCaja = event.getIdCaja();
            var tipoDeCaja = event.getTipoCaja();
            var caja = new Caja(event.getIdCaja(), event.getIdEmpleado(), event.getEquipoComputo(),
                                    new TipoCaja.Tipo.CAJA_RAPIDA);
            puntoDeVenta.designarTipoDeCaja(idCaja,tipoDeCaja,caja);

        });

        apply((CargoAsignadoEmpleado event) ->{
            var idEmpleado = event.getIdEmpleado();
            var cargo = event.getCargo();

            puntoDeVenta.empleados.put(idEmpleado, new Empleado(idEmpleado, cargo));
        });
    }
}
