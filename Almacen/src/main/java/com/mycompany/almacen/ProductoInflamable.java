/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

/**
 * Clase que representa un producto inflamable en la aplicación
 * Extiende de Producto
 * @author maria
 */
public class ProductoInflamable extends Producto{

    /**
     * Constructor de la clase ProductoInflamable
     * @param idProducto -> id del producto
     * @param nombre -> nombre del producto
     * @param precio -> precio del producto
     * @param descripcion -> descripción del producto.
     * En este tipo de Producto, la descripción se establece en "Inflamable"
     */
    
    public ProductoInflamable(int idProducto, String nombre, int precio, String descripcion) {
        super (idProducto, nombre, precio, descripcion) ;
        this.setDescripcion("Inflamable");
    }
    
}
