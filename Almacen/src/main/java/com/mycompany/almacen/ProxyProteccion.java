/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maria
 */
public class ProxyProteccion implements RegistroUsuario{
    
    private JFrame jf = new JFrame("Registro") ;
    private static JLabel email = new JLabel("Email") ;
    private static JTextField textoEmail = new JTextField(40);
    private static JLabel telefono = new JLabel("Telefono") ;
    private static JTextField textoTelefono = new JTextField(10);
    private static JLabel password = new JLabel("Password") ;
    private static JTextField textoPassword = new JTextField(20);
    private static JButton botonRegistro = new JButton("Registrarse") ;
    private JPanel jp = new JPanel ();
    
    public ProxyProteccion(){
        
        //Añadir al panel los textos y el boton
        jp.add(email);
        jp.add(textoEmail);
        jp.add(telefono);
        jp.add(textoTelefono);
        jp.add(password) ;
        jp.add(textoPassword);
        jp.add(botonRegistro);
        
        jp.setBounds(0, 0, 800, 800);

        email.setBounds(300,300,60,20); 
        textoEmail.setBounds(400,300,200,20); 
        telefono.setBounds (300, 400, 60, 20) ; 
        textoTelefono.setBounds (400,400,200,20);
        password.setBounds(300,500,60,20) ; 
        textoPassword.setBounds (400,500,200,20) ; 
        botonRegistro.setBounds (400,600,150,30) ; 
                
        //Añadir el panel a la JFrame y establecer tamaño del Jframe
        jf.add(jp);
        jf.setSize(800,800);
        
        //Mostrar el JFrame
        jf.validate();
        jf.setVisible(true);
        
        //Establecer acción para el boton
        botonRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textoEmail.getText()!="" && textoTelefono.getText()!="" && textoPassword.getText()!="" ){
                    try {
                        insertarUsuario(textoEmail.getText(),textoTelefono.getText(), textoPassword.getText()) ;
                    } catch (SQLException ex) {
                        Logger.getLogger(ProxyProteccion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }			
        }	
        });
    }
    
    @Override
    public void insertarUsuario(String email, String telefono, String password) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        
        String query2 = " SELECT * FROM public.\"Usuario\" WHERE  email='" + email + "'" ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        if (resultado.next()==false){
            //Insertar el producto
            String query = "INSERT INTO public.\"Usuario\" (Email, Password, Telefono) VALUES ('" + email + "',' " 
                + password +"','"+ telefono +"')" ;
            bd.lanzarQuery(query);
            MenuInicial menu = new MenuInicial();
            jf.dispose();

        }
        else{
            System.out.println("No puede introducirse el usuario, ya existe el email");
        }
    }
}
