/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

/**
 * Conjunto de productos que representa una entrada o una salida de productos del almacén.
 * @author maria
 */
public class ConjuntoProductos {
    
    // Atributos de la clase
    private int idProducto ;
    private int cantidad ;
    private int idPersona ;
    private String fecha ;

    /**
     * Constructor de ConjuntoProductos
     * @param idProducto -> id del producto
     * @param cantidad -> cantidad del producto
     * @param idPersona -> id de la persona 
     * @param fecha -> fecha en que se da la entrada o salida de los productos
     */
    
    public ConjuntoProductos(int idProducto, int cantidad, int idPersona, String fecha) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.idPersona = idPersona;
        this.fecha = fecha;
    }
    
    /**
     * Método get del id del producto del Conjunto de Productos
     * @return idProducto -> id del producto del conjunto.
     */
    
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Método set del id del producto del Conjunto de Productos
     * @param idProducto -> id del producto del conjunto.
     */
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Método get de la cantidad del producto del Conjunto de Productos
     * @return cantidad -> cantidad del producto del conjunto.
     */
    
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Método set de la cantidad del producto del Conjunto de Productos
     * @param cantidad -> cantidad del producto del conjunto.
     */
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Método get del id de la persona (cliente o proveedor) del Conjunto de Productos
     * @return idPersona -> id de la persona que proporciona el conjunto de productos.
     */
    
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * Método set del id de la persona (cliente o proveedor) del Conjunto de Productos
     * @param idPersona -> id de la persona que proporciona el conjunto de productos.
     */
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * Método get de la fecha en que se da el Conjunto de Productos
     * @return fecha -> fecha en que se da el conjunto de productos.
     */
    
    public String getFecha() {
        return fecha;
    }

    /**
     * Método set de la fecha en que se da el Conjunto de Productos
     * @param fecha -> fecha en que se da el conjunto de productos.
     */
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
