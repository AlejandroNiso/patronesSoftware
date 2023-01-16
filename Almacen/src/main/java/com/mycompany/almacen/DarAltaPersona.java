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
public class DarAltaPersona {
    public Persona crearPersona (int idPersona, String nombre, String email, int telefono, String direccion, int tipo){
        if (tipo == 0){
            //Creación de un Cliente
            return new Cliente (idPersona, nombre, email, telefono, direccion);
        }
        else {
            //Creación de un Proveedor
            return new Proveedor (idPersona, nombre, email, telefono, direccion);
        }
    }
    
    public void insertarCliente (Cliente cliente) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        
        String query2 = " SELECT * FROM public.\"Cliente\" WHERE  idcliente=" + cliente.getIdPersona() ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        if (resultado.next()==false){
            //Insertar cliente en la base de datos
            String query = "INSERT INTO public.\"Cliente\" (IdCliente, Nombre, Email, Telefono, Direccion) VALUES ('" + cliente.getIdPersona() + "',' " 
                + cliente.getNombre() +"','"+ cliente.getEmail() +"','" + cliente.getTelefono() +"','" + cliente.getDireccion() +"')" ;
            bd.lanzarQuery(query);
        }
        else{
            System.out.println("No puede introducirse el cliente, ya existe el id");
        }
    }
    
    public void insertarProveedor (Proveedor proveedor) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
                
        String query2 = " SELECT * FROM public.\"Proveedor\" WHERE  idproveedor=" + proveedor.getIdPersona() ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        if (resultado.next()==false){
            //Introducir el proveedor en la base de datos
            String query = "INSERT INTO public.\"Proveedor\" (IdProveedor, Nombre, Email, Telefono, Direccion) VALUES ('" + proveedor.getIdPersona() + "',' " 
                + proveedor.getNombre() +"','"+ proveedor.getEmail() +"','" + proveedor.getTelefono() +"','" + proveedor.getDireccion() +"')" ;
            bd.lanzarQuery(query);
        }
        else{
            System.out.println("No puede introducirse el proveedor, ya existe el id");
        }
    }
}
