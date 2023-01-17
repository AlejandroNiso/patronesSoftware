/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.almacen;

import java.sql.SQLException;

/**
 *
 * @author maria
 */
public interface EstrategiaBuscar {
        public void buscar (String tabla, String buscador) throws SQLException;
}
