package co.com.d1.tiendas.puntosdeventa.agregadobodega;

import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.Categoria;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.IdProducto;
import co.com.d1.tiendas.puntosdeventa.agregadobodega.values.PrecioUnitario;
import co.com.d1.tiendas.puntosdeventa.genericos.Cantidad;
import co.com.d1.tiendas.puntosdeventa.genericos.Nombre;
import co.com.sofka.domain.generic.Entity;

/**
 * [E] Entidad EquipoComputo que permite asignar a la bodega del punto de venta o tienda D1 los productos
 * @Autores Andrés Lozada y Doris Mosquera
 */
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

    public Producto(IdProducto idProducto, Nombre nombreProducto) {
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

    public void actualizarNombreProducto(IdProducto idProducto, Nombre nombreProducto){

        if(idProducto.value().isBlank()){
            throw new IllegalArgumentException("No puede actualizar el nombre de un producto " +
                                               " pasando un paramtero vacio");
        }

        if (String.valueOf(nombreProducto).isBlank()){
            throw new IllegalArgumentException("No puede actualizar el nombre de un producto " +
                                               " pasando un paramtero vacio");
        }
        this.nombreProducto = nombreProducto;
    }
}
