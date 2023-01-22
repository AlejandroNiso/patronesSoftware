/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;


/**
 * Clase que representa una Entrada en el almacén.
 * Extiende de ConjuntoProductos.
 * @author maria
 */
public class Entrada extends ConjuntoProductos{
    
    //Atributo de la clase
    private int idEntrada ;

    /**
     * Constructor de entrada
     * @param idEntrada -> id de la entrada a registrar.
     * @param idProducto -> id del producto de la entrada.
     * @param cantidad -> cantidad del producto de la entrada.
     * @param idPersona -> id de la persona que proporciona la entrada.
     * @param fecha -> fecha en que se da la entrada.
     */ 
    
    public Entrada(int idEntrada, int idProducto, int cantidad, int idPersona, String fecha) {
        super(idProducto, cantidad, idPersona, fecha);
        this.idEntrada = idEntrada ;
    }

    /**
     * Método set del id de la entrada
     * @return idEntrada -> devuelve el id de la entrada
     */ 
    
    public int getIdEntrada() {
        return idEntrada;
    }
    
    /**
     * Método get del id de la entrada
     * @param idEntrada -> id de la entrada.
     */ 

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

}
