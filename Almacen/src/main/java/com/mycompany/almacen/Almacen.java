/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.almacen;
import java.sql.*;

/**
 * Clase que contiene el main del proyecto e inicializa el menú del inicio
 * @author maria
 */
public class Almacen {

    public static void main(String[] args) throws SQLException {
        MenuInicio menu = new MenuInicio();
        menu.setVisible(true);
    }
}
