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
public class Cliente extends Persona{
    
    public Cliente(int idPersona, String nombre, String email, String telefono, String direccion) throws SQLException {
        super(idPersona,nombre,email,telefono,direccion);   
        insertarCliente(this);
    }
    public void insertarCliente (Cliente cliente) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        
        
        String query2 = " SELECT * FROM public.\"Cliente\" WHERE  idcliente=" + cliente.getIdPersona() ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        if (resultado.next()==false){
            MenuPrincipal menu = new MenuPrincipal();
            //Insertar cliente en la base de datos
            String query = "INSERT INTO public.\"Cliente\" (IdCliente, Nombre, Email, Telefono, Direccion) VALUES ('" + cliente.getIdPersona() + "',' " 
                + cliente.getNombre() +"','"+ cliente.getEmail() +"','" + cliente.getTelefono() +"','" + cliente.getDireccion() +"')" ;
            bd.lanzarQuery(query);
            menu.setVisible(true);
        }
        else{
            System.out.println("No puede introducirse el cliente, ya existe el id");
        }
    }
}
