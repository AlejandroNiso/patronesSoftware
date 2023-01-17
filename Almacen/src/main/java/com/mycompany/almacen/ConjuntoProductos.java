/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

import java.sql.Date;

/**
 *
 * @author maria
 */
public class ConjuntoProductos {
    private int idProducto ;
    private int cantidad ;
    private int idPersona ;
    private String fecha ;

    public ConjuntoProductos(int idProducto, int cantidad, int idPersona, String fecha) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.idPersona = idPersona;
        this.fecha = fecha;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
