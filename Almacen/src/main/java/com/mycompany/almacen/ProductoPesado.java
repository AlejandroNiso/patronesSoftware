/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

/**
 *
 * @author maria
 */
public class ProductoPesado extends Producto{

    public ProductoPesado(int idProducto, String nombre, int precio, String descripcion) {
        super (idProducto, nombre, precio, descripcion) ;
        this.setDescripcion("Pesado");
    }

}
