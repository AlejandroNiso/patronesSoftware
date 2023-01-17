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
public class Proveedor extends Persona {
    public Proveedor(int idPersona, String nombre, String email, String telefono, String direccion) throws SQLException {
        super(idPersona,nombre,email,telefono,direccion);
        insertarProveedor(this);
    }
    public void insertarProveedor (Proveedor proveedor) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        
                
        String query2 = " SELECT * FROM public.\"Proveedor\" WHERE  idproveedor=" + proveedor.getIdPersona() ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        if (resultado.next()==false){
            MenuPrincipal menu = new MenuPrincipal();
            //Introducir el proveedor en la base de datos
            String query = "INSERT INTO public.\"Proveedor\" (IdProveedor, Nombre, Email, Telefono, Direccion) VALUES ('" + proveedor.getIdPersona() + "',' " 
                + proveedor.getNombre() +"','"+ proveedor.getEmail() +"','" + proveedor.getTelefono() +"','" + proveedor.getDireccion() +"')" ;
            bd.lanzarQuery(query);
            menu.setVisible(true);
            
        }
        else{
            
            System.out.println("No puede introducirse el proveedor, ya existe el id");
        }
    }
    
}
