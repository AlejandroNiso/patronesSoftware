/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package almacen.Strategy;

import java.sql.SQLException;

/**
 * Interfaz EstrategiaOrdenar que deben implementar los diferentes métodos de 
 * ordenación sobre la base de datos
 * @author maria
 */
public interface EstrategiaOrdenar{

    /**
     * Declaración del método ordenar que deben implementar todas las clases que extiendan de esta interfaz
     * @param tabla -> tabla sobre la que se va a realizar la ordenación
     * @throws SQLException
     */
    public void ordenar (String tabla) throws SQLException;
}
