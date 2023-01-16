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
public class DarAltaProducto {
    
    public ProductoPesado darAltaProductoPesado (int idProducto, String nombre, int precio, String descripcion){
        return new ProductoPesado (idProducto, nombre, precio, descripcion);
    }
    
    public ProductoFragil darAltaProductoFragil (int idProducto, String nombre, int precio, String descripcion){
        return new ProductoFragil(idProducto, nombre, precio, descripcion);
    }
    
    public ProductoNormal darAltaProductoNormal (int idProducto, String nombre, int precio, String descripcion){
        return new ProductoNormal (idProducto, nombre, precio, descripcion);
    }
    
    public ProductoInflamable darAltaProductoInflamable (int idProducto, String nombre, int precio, String descripcion){
        return new ProductoInflamable (idProducto, nombre, precio, descripcion);
    }
    
    public void insertarProducto (Producto producto) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        
        String query2 = " SELECT * FROM public.\"Producto\" WHERE  idproducto=" + producto.getIdProducto() ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        if (resultado.next()==false){
            //Insertar el producto
            String query = "INSERT INTO public.\"Producto\" (IdProducto, Nombre, Precio, Descripcion) VALUES ('" + producto.getIdProducto() + "',' " 
                + producto.getNombre() +"','"+ producto.getPrecio() +"','" + producto.getDescripcion() +"')" ;
            bd.lanzarQuery(query);
        }
        else{
            System.out.println("No puede introducirse el producto, ya existe el id");
        }
    }
}
