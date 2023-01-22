/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package almacen.Strategy;

import java.sql.SQLException;

/**
 * Interfaz EstrategiaBuscar que deben implementar los diferentes métodos de 
 * búsqueda sobre la base de datos
 * @author maria
 */
public interface EstrategiaBuscar {
    
        /**
        * Declaración del método buscar que deben implementar todas las clases que extiendan de esta interfaz
        * @param tabla -> tabla de la BD sobre la que se va a realizar la búsqueda
        * @param buscador -> item que se va a buscar en la BD
        * @throws java.sql.SQLException
        */ 
    
        public void buscar (String tabla, String buscador) throws SQLException;
}
