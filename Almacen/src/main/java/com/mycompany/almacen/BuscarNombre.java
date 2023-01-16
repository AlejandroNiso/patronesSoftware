/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maria
 */
public class BuscarNombre implements EstrategiaBuscar {
    public void buscar (String tabla, String buscador) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        String query = " SELECT * FROM public.\""+ tabla+"\" WHERE nombre=" + buscador ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query);
        
        //Mostrar datos
        while (resultado.next()){
            if(tabla!="Producto"){
                String salida = resultado.getInt(1) + resultado.getString(2)+resultado.getString(3)
                        +resultado.getInt(4) + resultado.getString(5);
                System.out.println(salida);
            }
            else{
                String salida = resultado.getInt(1) + resultado.getString(2)+
                        resultado.getInt(3) + resultado.getString(4) ;
                System.out.println(salida);
            }
        }
    }
}
