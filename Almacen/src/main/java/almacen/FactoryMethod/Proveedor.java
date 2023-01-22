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
 * Clase que representa a un Proveedor en la aplicación
 * Extiende de la clase Persona
 * @author maria
 */

public class Proveedor extends Persona {
    
    /**
     * Constructor de la clase Proveedor
     * @param idPersona -> id del cliente a construir
     * @param nombre -> nombre del cliente a construir
     * @param email -> email del cliente a construir
     * @param telefono -> telefono del cliente a construir
     * @param direccion -> direccion del cliente a construir
     * Se inserta además el proveedor en la BD
     */
    
    public Proveedor(int idPersona, String nombre, String email, String telefono, String direccion) throws SQLException {
        super(idPersona,nombre,email,telefono,direccion);
        insertarProveedor(this);
    }
    
    /**
     * Método que inserta un Proveedor en la BD
     * @param proveedor -> proveedor a insertar en la base de datos
     */
    
    public void insertarProveedor (Proveedor proveedor) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        
        //Consulta para comprobar que no existe un proveedor con el mismo id
        String query2 = " SELECT * FROM public.\"Proveedor\" WHERE  idproveedor=" + proveedor.getIdPersona() ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        if (resultado.next()==false){ //No existe el id del proveedor
            //Introducir el proveedor en la base de datos
            String query = "INSERT INTO public.\"Proveedor\" (IdProveedor, Nombre, Email, Telefono, Direccion) VALUES ('" + proveedor.getIdPersona() + "',' " 
                + proveedor.getNombre() +"','"+ proveedor.getEmail() +"','" + proveedor.getTelefono() +"','" + proveedor.getDireccion() +"')" ;
            bd.lanzarQuery(query);
            
            //Retornar al menú principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            
        }
        else{
            
            System.out.println("No puede introducirse el proveedor, ya existe el id");
        }
    }
    
}
