package co.com.d1.tiendas.puntosdeventa.agregadorootpuntodeventa.commands;

import co.com.d1.tiendas.puntosdeventa.agregadocaja.Caja;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.EquipoComputo;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.IdCaja;
import co.com.d1.tiendas.puntosdeventa.agregadocaja.values.TipoCaja;
import co.com.d1.tiendas.puntosdeventa.agregadoempleado.values.IdEmpleado;
import co.com.sofka.domain.generic.Command;

/**
 * [CM] Comando que ejecuta un usuario del sistema a través de una interfaz para designar el tipo de caja
 * en el punto de venta o tienda D1
 * @Autores: Andrés Lozano y Doris Mosquera
 */
public class DesignarTipoDeCaja extends Command {
    private final TipoCaja tipoCaja;
    private final IdCaja idCaja;
    private final Caja caja;
    private final IdEmpleado idEmpleado;
    private final EquipoComputo equipoComputo;

    public DesignarTipoDeCaja(TipoCaja tipoCaja, IdCaja idCaja, Caja caja, IdEmpleado idEmpleado, EquipoComputo equipoComputo) {
        this.tipoCaja = tipoCaja;
        this.idCaja = idCaja;
        this.caja = caja;
        this.idEmpleado = idEmpleado;
        this.equipoComputo = equipoComputo;
    }

    public TipoCaja getTipoCaja() {
        return tipoCaja;
    }

    public IdCaja getIdCaja() {
        return idCaja;
    }

    public Caja getCaja() {
        return caja;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public EquipoComputo getEquipoComputo() {
        return equipoComputo;
    }
}
