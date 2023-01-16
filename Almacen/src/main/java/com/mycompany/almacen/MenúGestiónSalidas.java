/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

import java.sql.*;

/**
 *
 * @author maria
 */
public class MenúGestiónSalidas {
    public void insertarPedido (Pedido pedido){
        BaseDatos bd = BaseDatos.getInstancia();
        String query = "INSERT INTO public.\"Pedido\" (IdPedido, IdProducto, Cantidad, IdCliente, Fecha, Completado) VALUES ('" + pedido.getIdPedido() + "',' " 
                + pedido.getIdProducto() +"','"+ pedido.getCantidad() +"','" + pedido.getIdPersona() +"','" + pedido.getFecha() +"','" + pedido.isCompletado()+"')" ;
        bd.lanzarQuery(query);
    }
    
    public void completarPedido (Pedido pedido) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        String query2 = " SELECT cantidad FROM public.\"Existencias\" WHERE  idproducto=" + pedido.getIdProducto() ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        resultado.next();
        int cantidadActual = resultado.getInt(2) ;
        int cantidadFinal = cantidadActual - pedido.getCantidad() ;
        if (cantidadFinal >= 0){
            //Eliminar unidades de existencias
            String queryUpdate = "UPDATE public.\"Existencias\" SET cantidad = " + cantidadFinal + "WHERE idproducto = " + pedido.getIdProducto() ;
            bd.lanzarQuery(queryUpdate);
            
            //Poner Completado a true
            String queryUpdate2 = "UPDATE public.\"Pedido\" SET completado = true WHERE idpedido = " + pedido.getIdPedido() ;
            bd.lanzarQuery(queryUpdate2);
        }
        else{
            System.out.println("No se puede completar el pedido");
        }
    }
    
    
}
