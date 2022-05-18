package co.com.d1.tiendas.puntosdeventa.agregadobodega;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.Categoria;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.PrecioUnitario;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Producto extends Entity<IdProducto> {

    protected Nombre nombreProducto;
    protected Categoria categoria;
    protected PrecioUnitario precioUnitario;
    protected Cantidad cantidad;

    public Producto(IdProducto idProducto) {
        super(idProducto);
    }

    public Producto(IdProducto idProducto, Cantidad cantidad) {
        super(idProducto);
        this.cantidad = cantidad;
    }

    public Producto(IdProducto idProducto, Nombre nombreProducto, Categoria categoria,
                        PrecioUnitario precioUnitario, Cantidad cantidad) {
        super(idProducto);
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public void actualizarCantidadDisponibleProducto(Cantidad cantidad){

        if (cantidad.value() < 0){
            throw new IllegalArgumentException("No puede actualizar una cantidad disponible" +
                                               " del producto menor que 0");
        }

        if (String.valueOf(cantidad).isEmpty()){
            throw new IllegalArgumentException("No puede actualizar una cantidad disponible" +
                                               " del producto como vacio");
        }

        if (!cantidad.equals(cantidad.value().intValue())){
            throw new IllegalArgumentException("No puede actualizar una cantidad disponible" +
                                               " del producto con decimales");
        }

        this.cantidad = cantidad;
    }
}
