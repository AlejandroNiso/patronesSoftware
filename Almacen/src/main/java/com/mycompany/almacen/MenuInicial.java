/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author maria
 */
public class MenuInicial {
    
    private JFrame jf = new JFrame("Gestion Almacenes") ;
    private static JButton botonRegistro = new JButton("Registrarse") ;
    private static JButton botonInicioSesion = new JButton("Iniciar Sesión");
    private JPanel jp = new JPanel();
    
    public MenuInicial(){
        
        botonRegistro.setBounds(300, 300, 100, 20);
        botonInicioSesion.setBounds (500,500,100,20);
        jp.setBounds(0,0,800,800);
        
        jp.add(botonRegistro);
        jp.add(botonInicioSesion);
        
        jf.setSize(800,800);
        
        jf.add(jp);
        jf.validate();
        jf.setVisible(true);
        
        botonRegistro.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                ProxyProteccion proxy = new ProxyProteccion();
                jf.dispose();
            }
        });
        
        botonInicioSesion.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                InicioSesion inicio = new InicioSesion();
                jf.dispose();
            }
        });
        
    }
}
