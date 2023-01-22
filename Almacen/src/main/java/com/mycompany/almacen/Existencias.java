/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

/**
 * Clase que representa las existencias del almacén
 * @author maria
 */
public class Existencias {
    
    // Atributos de la clase
    private int idProducto ;
    private int cantidad ;

    /**
     * Constructor de Existencias
     * @param idProducto -> id del producto.
     * @param cantidad -> cantidad del producto.
     */ 
    
    public Existencias(int idProducto, int cantidad) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }
    
    /**
     * Método get del id del producto.
     * @return idProducto -> id del producto.
     */ 
    
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Método set del id del producto.
     * @param idProducto -> id del producto.
     */ 
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Método get de la cantidad del producto
     * @return cantidad -> cantidad del producto.
     */ 
    
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Método get de la cantidad del producto.
     * @param cantidad -> cantidad del producto.
     */ 
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
