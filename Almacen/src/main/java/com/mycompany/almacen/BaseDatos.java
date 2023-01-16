/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

/**
 *
 * @author maria
 */

import java.sql.*;

/**
 * Provee de una pasarela de interacción con la base de datos de derby.
 * Es un objeto singleton. 
 * @author marco
 */
public class BaseDatos {

    // Instancia única de la clase GestorBaseDatos
    private static BaseDatos instanciaUnica = null;
    
    
    // Atributos de la clase
    private Connection conexion;
    private Statement consulta;
    private ResultSet resultado;
    
    /**
     * Constructor privado
     */
    private BaseDatos() {
        abrirConexion();
    }

    /**
     * Abre la conexión con la base de datos.
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
     * Prepara una consulta sobre la base de datos. Usado
     * Para querys que devuelven resultados.
     * @return -> objeto consulta. 
     */
    public Statement prepararConsulta() {
        Statement consultaPreparada = null;
        try {
            consultaPreparada = conexion.createStatement();
        } catch (Exception e) {
            System.out.println("Error lanzando consulta: ");
            e.printStackTrace();
        }
        return consultaPreparada;

    }

    /**
     * Lanza la query dada sobre la base de datos.
     * Es una query de update, no devuelve resultados.
     * @param query -> query a lanzar. 
     */
    public void lanzarQuery(String query) {
        try {
            consulta = conexion.createStatement();
            consulta.executeUpdate(query);
            consulta.close();

        } catch (Exception e) {
            System.out.println("Error al lanzar query: ");
            System.out.println("Query: " + query);
            e.printStackTrace();
        }
    }

    /**
     * Lanza una query sobre la BBDD que devuelve un resultado
     * en el resultSet. 
     * @param consulta -> consulta preparada. 
     * @param query -> query a lanzar. 
     * @return 
     */
    public ResultSet lanzarQuery(Statement consulta, String query) {
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery(query);

        } catch (Exception e) {
            System.out.println("Error al lanzar query: ");
            System.out.println("Query: " + query);
            e.printStackTrace();
        }
        return resultado;
    }


    /**
     * *
     * Método estático desde el que devolvemos el objeto Singleton
     *
     * @return devuelve la instacia única de la clase
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
     * Cierra la conexión con la base de datos
     */
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

