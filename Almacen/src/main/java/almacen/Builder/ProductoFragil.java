/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.Builder;

/**
 * Clase que representa un producto fragil en la aplicación
 * Extiende de Producto
 * @author maria
 */
public class ProductoFragil extends Producto {

    /**
     * Constructor de la clase ProductoFragil
     * @param idProducto -> id del producto
     * @param nombre -> nombre del producto
     * @param precio -> precio del producto
     * @param descripcion -> descripción del producto.
     * En este tipo de Producto, la descripción se establece en "Fragil"
     */
    
    public ProductoFragil(int idProducto, String nombre, int precio, String descripcion) {
        super (idProducto, nombre, precio, descripcion) ;
        this.setDescripcion("Fragil");
    }
    
}
