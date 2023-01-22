/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

/**
 * Clase que representa una Persona (cliente o proveedor) en la aplicación
 * @author maria
 */
public class Persona {
    //Atributos de la clase
    private int idPersona ;
    private String nombre ;
    private String email ;
    private String telefono ;
    private String direccion ;

     /**
     * Constructor de la clase Cliente
     * @param idPersona -> id del cliente a construir
     * @param nombre -> nombre del cliente a construir
     * @param email -> email del cliente a construir
     * @param telefono -> telefono del cliente a construir
     * @param direccion -> direccion del cliente a construir
     */
    
    public Persona(int idPersona, String nombre, String email, String telefono, String direccion) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
     /**
     * Método get del id de la persona
     * @return idPersona -> id de la persona.
     */
    
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * Método set del id de la persona
     * @param idPersona -> id de la persona.
     */
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * Método get del nombre de la persona
     * @return nombre -> nombre de la persona.
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set del nombre de la persona
     * @param nombre -> nombre de la persona.
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get del email de la persona
     * @return email -> email de la persona.
     */
    
    public String getEmail() {
        return email;
    }

    /**
     * Método set del email de la persona
     * @param email -> email de la persona.
     */
    
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método get del telefono de la persona
     * @return telefono -> telefono de la persona.
     */
    
    public String getTelefono() {
        return telefono;
    }
    
    /**
     * Método set del telefono de la persona
     * @param telefono -> telefono de la persona.
     */
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método get de la direccion de la persona
     * @return direccion -> direccion de la persona.
     */
    
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método set de la direccion de la persona
     * @param direccion -> direccion de la persona.
     */
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
