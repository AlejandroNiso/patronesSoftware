/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

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
    
    public void insertarCliente (Cliente cliente){
        BaseDatos bd = BaseDatos.getInstancia();
        String query = "INSERT INTO public.\"Cliente\" (IdCliente, Nombre, Email, Telefono, Direccion) VALUES ('" + cliente.getIdPersona() + "',' " 
                + cliente.getNombre() +"','"+ cliente.getEmail() +"','" + cliente.getTelefono() +"','" + cliente.getDireccion() +"')" ;
        bd.lanzarQuery(query);
    }
    
    public void insertarProveedor (Proveedor proveedor){
        BaseDatos bd = BaseDatos.getInstancia();
        String query = "INSERT INTO public.\"Proveedor\" (IdProveedor, Nombre, Email, Telefono, Direccion) VALUES ('" + proveedor.getIdPersona() + "',' " 
                + proveedor.getNombre() +"','"+ proveedor.getEmail() +"','" + proveedor.getTelefono() +"','" + proveedor.getDireccion() +"')" ;
        bd.lanzarQuery(query);
    }
}
