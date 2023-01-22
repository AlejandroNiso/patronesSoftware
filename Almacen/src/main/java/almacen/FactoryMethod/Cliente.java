/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.FactoryMethod;

import almacen.Facade.MenuPrincipal;
import almacen.Singleton.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase Cliente que representa un cliente en el almacén.
 * Extiende de la clase Persona.
 * @author maria
 */
public class Cliente extends Persona{
    
    /**
     * Constructor de la clase Cliente
     * @param idPersona -> id del cliente a construir
     * @param nombre -> nombre del cliente a construir
     * @param email -> email del cliente a construir
     * @param telefono -> telefono del cliente a construir
     * @param direccion -> direccion del cliente a construir
     */
    
    public Cliente(int idPersona, String nombre, String email, String telefono, String direccion) throws SQLException {
        super(idPersona,nombre,email,telefono,direccion);   
        insertarCliente(this);
    }
    
    /**
     * Inserta en la base de datos un cliente determinado
     * @param cliente -> cliente a insertar
     */
    
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
