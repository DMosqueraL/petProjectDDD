package co.com.d1.tiendas.puntosdeventa.agregadocaja.commands;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.EquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.Empleado;
import co.com.sofka.domain.generic.Command;

public class CrearCaja extends Command {
    private final IdCaja idCaja;
    private final Empleado empleadoCaja;
    /*private final Factura factura;*/
    private final EquipoComputo equipoComputo;

    public CrearCaja(IdCaja idCaja,
                     Empleado empleadoCaja,
                     /*Factura factura,*/
                     EquipoComputo equipoComputo) {
        this.idCaja = idCaja;
        this.empleadoCaja = empleadoCaja;
        /*this.factura = factura;*/
        this.equipoComputo = equipoComputo;
    }

    public IdCaja getIdCaja() {
        return idCaja;
    }

    public Empleado getEmpleadoCaja() {
        return empleadoCaja;
    }

    /*public Factura getFactura() {
        return factura;
    }*/

    public EquipoComputo getEquipoComputo() {
        return equipoComputo;
    }
}
