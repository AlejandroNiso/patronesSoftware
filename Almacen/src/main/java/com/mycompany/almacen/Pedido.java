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
public class Pedido extends ConjuntoProductos{
    private int idPedido ;
    private boolean completado ;
    
    public Pedido(int idProducto, int cantidad, int idPersona, String fecha, int idPedido, boolean completado) {
        super(idProducto, cantidad, idPersona, fecha);
        this.idPedido = idPedido ;
        this.completado = completado ;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
    
    
}
