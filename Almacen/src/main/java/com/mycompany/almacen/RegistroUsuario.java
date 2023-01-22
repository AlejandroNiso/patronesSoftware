/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.almacen;

import java.sql.SQLException;

/**
 * Interfaz ResgitroUsuario que debe implementar la clase que realiza el registro de usuarios (PRoxy)
 * @author maria
 */
public interface RegistroUsuario {
    
    /**
        * Declaración del método insertarUsuario 
        * @param usuario -> usuario que se quiere insertar en la BD
        * @throws java.sql.SQLException
        */ 
    public void insertarUsuario(Usuario usuario) throws SQLException ;
}
