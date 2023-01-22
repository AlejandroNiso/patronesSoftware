/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.Builder;

/**
 * Clase que representa un Producto en nuestra aplicación.
 * @author maria
 */
public class Producto {
    //Atributos de la clase
    private int idProducto ;
    private String nombre ;
    private int precio ;
    private String descripcion ;
    
    /**
     * Constructor de la lase Producto
     * @param idProducto -> id del producto
     * @param nombre -> nombre del producto
     * @param precio -> precio del producto
     * @param descripcion -> descripción del producto.
     */

    public Producto(int idProducto, String nombre, int precio, String descripcion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    /**
     * Método get del id del producto
     * @return idProducto -> id del producto
     */
    
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Método set del id del producto
     * @param idProducto -> id del producto
     */
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Método get del nombre del producto
     * @return nombre -> nombre del producto
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set del nombre del producto
     * @param nombre -> nombre del producto
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get del precio del producto
     * @return precio -> precio del producto
     */
    
    public int getPrecio() {
        return precio;
    }

    /**
     * Método set del precio del producto
     * @param precio -> precio del producto
     */
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Método get de la descripcion del producto
     * @return descripcion -> descripcion del producto
     */
    
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método set de la descripcion del producto
     * @param descripcion -> descripcion del producto
     */
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
