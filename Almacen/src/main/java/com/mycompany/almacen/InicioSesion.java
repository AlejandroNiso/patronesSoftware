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
public class InicioSesion {
    private JFrame jf = new JFrame("Registro") ;
    private static JLabel email = new JLabel("Email") ;
    private static JTextField textoEmail = new JTextField(40);
    private static JLabel password = new JLabel("Password") ;
    private static JTextField textoPassword = new JTextField(20);
    private static JButton botonInicioSesion = new JButton("Iniciar Sesion") ;
    private JPanel jp = new JPanel ();
    
    public InicioSesion(){
        //Añadir al panel los textos y el boton
        jp.add(email);
        jp.add(textoEmail);
        jp.add(password) ;
        jp.add(textoPassword);
        jp.add(botonInicioSesion);
        
        jp.setBounds(0, 0, 800, 800);

        email.setBounds(300,300,60,20); 
        textoEmail.setBounds(400,300,200,20); 
        password.setBounds(300,500,60,20) ; 
        textoPassword.setBounds (400,500,200,20) ; 
        botonInicioSesion.setBounds (400,600,150,30) ; 
                
        //Añadir el panel a la JFrame y establecer tamaño del Jframe
        jf.add(jp);
        jf.setSize(800,800);
        
        //Mostrar el JFrame
        jf.validate();
        jf.setVisible(true);
        
        botonInicioSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textoEmail.getText()!="" && textoPassword.getText()!="" ){
                    try {
                        validarInicioSesion(textoEmail.getText(), textoPassword.getText()) ;
                    } catch (SQLException ex) {
                        Logger.getLogger(ProxyProteccion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }			
        }	
        });
    }
    
    public void validarInicioSesion(String email, String password) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        
        String query2 = " SELECT * FROM public.\"Usuario\" WHERE  email='" + email + "'" ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query2);
        
        if (resultado.next()){
            //Validar el inicio de sesion
            System.out.println(email+"\n"+resultado.getString(1)+"\n"+password+"\n"+resultado.getString(2));

            if ((resultado.getString(1)).contains(email) && 
                    (resultado.getString(2)).contains(password)){
                Menu menu = new Menu();
                jf.dispose();
            }
            else{
                System.out.println("Credenciales incorrectas");
            }
        }
        else{
            System.out.println("Credenciales incorrectas");
        }
    }
}
