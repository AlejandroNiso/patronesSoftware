/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

import java.sql.*;

/**
 * Clase que contiene la interacción con la base de datos PostgreSQL
 * @author maria
 */

public class BaseDatos {

    // Instancia única de BaseDatos
    private static BaseDatos instanciaUnica = null;
    
    
    // Atributos
    private Statement consulta;
    private ResultSet resultado;
    private Connection conexion;
    
    /**
     * Constructor privado para asegurar que la instancia sea única
     */
    private BaseDatos() {
        abrirConexion();
    }

    /**
     * Abre la conexión con la BD.
     */
    private void abrirConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Almacen", "postgres", "maria");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Prepara una consulta sobre la BD. 
     * Es necesario para las consultas que devuelven resultados 
     * @return -> objeto consulta. 
     */
    public Statement prepararConsulta() {
        Statement consultaPreparada = null;
        try {
            consultaPreparada = conexion.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return consultaPreparada;

    }

    /**
     * Lanza la consulta en la BD.
     * @param query -> query a lanzar. 
     */
    public void lanzarQuery(String query) {
        try {
            consulta = conexion.createStatement();
            consulta.executeUpdate(query);
            consulta.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Lanza una consulta en la BD que devuelve un resultado
     * @param consulta -> consulta preparada. 
     * @param query -> query a lanzar. 
     * @return resultSet -> resultado de la ejecución de la consulta
     */
    public ResultSet lanzarQuery(Statement consulta, String query) {
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }


    /**
     * Devolver el objeto Singleton
     * @return Instacia única de la clase
     */
    public static BaseDatos getInstancia() {
        try {
            if (instanciaUnica == null) {
                instanciaUnica = new BaseDatos();
            } else if (instanciaUnica.conexion.isClosed()) {
                instanciaUnica.abrirConexion();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return instanciaUnica;
    }

    

    /**
     * Cerrar la conexión 
     */
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

