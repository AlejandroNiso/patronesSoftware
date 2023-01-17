/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.almacen;
import java.sql.*;

/**
 *
 * @author maria
 */
public class Almacen {

    public static void main(String[] args) throws SQLException {
        /**String query = "INSERT INTO public.\"Producto\" (IdProducto, Nombre, Precio, Descripcion) VALUES ('1','Lapiz','3','Normal')" ;
        bd.lanzarQuery(query);
        String query = " SELECT * FROM public.\"Producto\" WHERE  idproducto=1" ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query);
        resultado.next();
        System.out.println(resultado.getInt(3));*/
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
}
