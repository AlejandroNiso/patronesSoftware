/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.almacen;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase MenuEntradas que contiene la interfaz para las posibles gestiones sobre las entradas en el almacén.
 * @author alexc
 */
public class MenuEntradas extends javax.swing.JFrame {

    /**
     * Constructor de MenuEntradas
     */
    public MenuEntradas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        button1 = new java.awt.Button();
        button10 = new java.awt.Button();
        label6 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        textField1.setForeground(new java.awt.Color(51, 51, 51));

        textField2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        textField2.setForeground(new java.awt.Color(51, 51, 51));

        textField3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        textField3.setForeground(new java.awt.Color(51, 51, 51));

        textField4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        textField4.setForeground(new java.awt.Color(51, 51, 51));
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });

        textField5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        textField5.setForeground(new java.awt.Color(51, 51, 51));

        label1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 51, 51));
        label1.setText("IdEntrada");

        label2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(51, 51, 51));
        label2.setText("IdProducto");

        label3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(51, 51, 51));
        label3.setText("Cantidad");

        label4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(51, 51, 51));
        label4.setText("IdProveedor");

        label5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(51, 51, 51));
        label5.setText("Fecha");

        button1.setBackground(new java.awt.Color(204, 255, 204));
        button1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(51, 51, 51));
        button1.setLabel("Insertar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button10.setBackground(new java.awt.Color(255, 255, 255));
        button10.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        button10.setForeground(new java.awt.Color(51, 51, 51));
        button10.setLabel("Menú");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(51, 51, 51));
        label6.setText("ENTRADAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón para retornar al menú principal
     */ 
    
    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menu =new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button10ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    /**
     * En caso de que todos los campos estén rellenados, al pulsar el botón Insertar,
     * se genera una entrada y se inserta esta en la BD
     */ 
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        if(!textField1.getText().isEmpty() && !textField2.getText().isEmpty() && !textField3.getText().isEmpty() && !textField4.getText().isEmpty() && !textField5.getText().isEmpty()){

            
            Entrada entrada = new Entrada(Integer.parseInt(textField1.getText()),Integer.parseInt(textField2.getText()),Integer.parseInt(textField3.getText()),
                    Integer.parseInt(textField4.getText()),textField5.getText());
            try {
                try {
                    insertarEntrada(entrada);
                } catch (IOException ex) {
                    Logger.getLogger(MenuEntradas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MenuEntradas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe rellenar todos los campos");
        }
        
    }//GEN-LAST:event_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEntradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para insertar una determinada entrada en la base de datos
     * @param entrada -> entrada a insertar en la BD
     */ 
    
    public void insertarEntrada (Entrada entrada) throws SQLException, IOException{
        BaseDatos bd = BaseDatos.getInstancia();  
        
        //Consulta para comprobar que exista el producto en la base de datos
        String query3 = " SELECT * FROM public.\"Producto\" WHERE  idproducto=" + entrada.getIdProducto() ;
        Statement consulta2 = bd.prepararConsulta();
        ResultSet resultado2 = bd.lanzarQuery(consulta2, query3);
        
        //Consulta para la comprobación de que exista la persona en la BD
        String query4 = " SELECT * FROM public.\"Proveedor\" WHERE  idproveedor=" + entrada.getIdPersona() ;
        Statement consulta3 = bd.prepararConsulta();
        ResultSet resultado3 = bd.lanzarQuery(consulta3, query4);
        
        //Consulta para comprobar que el id de la entrada no exista previamente en la BD
        String query5 = " SELECT * FROM public.\"Entrada\" WHERE  identrada=" + entrada.getIdEntrada() ;
        Statement consulta4 = bd.prepararConsulta();
        ResultSet resultado4 = bd.lanzarQuery(consulta4, query5);
        
        
        //Registrar entrada
        if(resultado4.next()==false){ //Comprobar id entrada único
            if (resultado2.next()) { //Comprobar que existe el producto
                if (resultado3.next()) { //Comprobar que existe la persona
                    
                    //Insertar entrada en BD
                    String query = "INSERT INTO public.\"Entrada\" (IdEntrada, IdProducto, Cantidad, IdProveedor, Fecha) VALUES ('" + entrada.getIdEntrada() + "',' "
                            + entrada.getIdProducto() + "','" + entrada.getCantidad() + "','" + entrada.getIdPersona() + "','" + entrada.getFecha() + "')";
                    bd.lanzarQuery(query);

                    //Consulta para actualizar o insertar en la base de datos existencias
                    String query2 = " SELECT cantidad FROM public.\"Existencias\" WHERE  idproducto=" + entrada.getIdProducto();
                    Statement consulta = bd.prepararConsulta();
                    ResultSet resultado = bd.lanzarQuery(consulta, query2);

                    if (resultado.next()) {
                        //Actualizar existencias
                        int cantidadActual = resultado.getInt(1);
                        int cantidadFinal = cantidadActual + entrada.getCantidad();
                        String queryUpdate = "UPDATE public.\"Existencias\" SET cantidad = " + cantidadFinal + " WHERE idproducto = " + entrada.getIdProducto();
                        bd.lanzarQuery(queryUpdate);
                    } else {
                        //Insertar
                        String queryInsert = "INSERT INTO public.\"Existencias\" (IdProducto, Cantidad) VALUES ('" + entrada.getIdProducto() + "','" + entrada.getCantidad() + "')";
                        bd.lanzarQuery(queryInsert);
                    }
                    
                    //Insertar un Recuerdo para tener "backup" en el txt
                    Recuerdo recuerdo = new Recuerdo();
                    String nuevaLinea = "ENTRADA: " + entrada.getIdEntrada() + ", " + entrada.getIdProducto() + ", " + entrada.getCantidad() 
                            + ", " + entrada.getIdPersona() + ", " + entrada.getFecha() ;
                    recuerdo.setRecuerdo(nuevaLinea);
                    
                    //Retornar al menú principal
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "No existe el proovedor, tiene que darlo de alta");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No existe el producto, tiene que darlo de alta");
            }
        }else{
            JOptionPane.showMessageDialog(this, "No puede introducirse la entrada, ya existe el id");
        }
        
        
    }



}
