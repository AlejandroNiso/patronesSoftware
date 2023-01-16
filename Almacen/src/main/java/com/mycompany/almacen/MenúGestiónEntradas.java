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
public class MenúGestiónEntradas {
    public void insertarEntrada (Entrada entrada) throws SQLException{
        //Registrar entrada
        BaseDatos bd = BaseDatos.getInstancia();
        String query = "INSERT INTO public.\"Entrada\" (IdEntrada, IdProducto, Cantidad, IdProveedor, Fecha) VALUES ('" + entrada.getIdEntrada() + "',' " 
                + entrada.getIdProducto() +"','"+ entrada.getCantidad() +"','" + entrada.getIdPersona() +"','" + entrada.getFecha() +"')" ;
        bd.lanzarQuery(query);
        
        //Actualizar existencias
        String query2 = " SELECT cantidad FROM public.\"Existencias\" WHERE  idproducto=" + entrada.getIdProducto() ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        if (resultado.next()){
            //Actualizar
            int cantidadActual = resultado.getInt(2) ;
            int cantidadFinal = cantidadActual + entrada.getCantidad() ;
            String queryUpdate = "UPDATE public.\"Existencias\" SET cantidad = " + cantidadFinal + "WHERE idproducto = " + entrada.getIdProducto() ;
            bd.lanzarQuery(queryUpdate);
        }
        else{
            //Insertar
            String queryInsert = "INSERT INTO public.\"Existencias\" (IdProducto, Cantidad) VALUES ('" + entrada.getIdProducto() + "','"+ entrada.getCantidad() + "')" ;
            bd.lanzarQuery(queryInsert);
        }
    }
}
