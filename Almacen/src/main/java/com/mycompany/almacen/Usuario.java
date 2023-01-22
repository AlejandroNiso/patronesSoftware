/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

/**
 * Clase que representa un Usuario en la aplicación
 * @author maria
 */
public class Usuario {
    //Atributos de la clase
    private String email ;
    private String telefono ;
    private String password ;

    /**
     * Constructor de la clase Usuario
     * @param email -> email del usuario.
     * @param telefono -> telefono del usuario.
     * @param password -> constraseña del usuario.
     */ 
    
    public Usuario(String email, String telefono, String password) {
        this.email = email;
        this.telefono = telefono;
        this.password = password;
    }
    
    /**
     * Método get del email del usuario
     * @return email -> email del usuario.
     */ 

    public String getEmail() {
        return email;
    }

    /**
     * Método set del email del usuario
     * @param email -> email del usuario.
     */ 
    
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método get del telefono del usuario
     * @return telefono -> telefono del usuario.
     */ 
    
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método set del telefono del usuario
     * @param telefono -> telefono del usuario.
     */ 
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método get de la contraseña del usuario
     * @return password -> contraseña del usuario.
     */ 
    
    public String getPassword() {
        return password;
    }

    /**
     * Método set de la contraseña del usuario
     * @param password -> contraseña del usuario.
     */ 
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
