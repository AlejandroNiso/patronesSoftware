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
public class Entrada extends ConjuntoProductos{
    private int idEntrada ;

    public Entrada(int idProducto, int cantidad, int idPersona, Date fecha, int idEntrada) {
        super(idProducto, cantidad, idPersona, fecha);
        this.idEntrada = idEntrada ;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

}
