/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package almacen.Strategy;

import almacen.Facade.MenuPrincipal;
import almacen.Singleton.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Realiza la ordenación en una determinada tabla de la base de datos por ID
 * @author alexc
 */
public class OrdenaID extends javax.swing.JFrame implements EstrategiaOrdenar {
    
    
    private static String tabla;
    /**
     * Constructor de OrdenaID
     */
    public OrdenaID(String tabla) {
        initComponents();
        this.tabla=tabla;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        button5 = new java.awt.Button();
        textArea2 = new java.awt.TextArea();
        label7 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button5.setBackground(new java.awt.Color(255, 255, 255));
        button5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        button5.setForeground(new java.awt.Color(51, 51, 51));
        button5.setLabel("Menú");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        textArea2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        textArea2.setForeground(new java.awt.Color(51, 51, 51));

        label7.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label7.setForeground(new java.awt.Color(51, 51, 51));
        label7.setText("ORDENAR POR ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón para retornar al menú principal
     */ 
    
    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menu =new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button5ActionPerformed

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
            java.util.logging.Logger.getLogger(OrdenaID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenaID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenaID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenaID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenaID(tabla).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button5;
    private java.awt.Label label7;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Método para realizar la ordenación de una determinada tabla de la base de datos por ID
     * @param tabla -> tabla a ordenar
     */ 
    
    public void ordenar(String tabla) throws SQLException{
        BaseDatos bd = BaseDatos.getInstancia();
        
        //Consulta que retorna todos los elementos de la tabla pasada como parámetro en orden ascendente
        String query = "SELECT * FROM public.\""+ tabla+"\" ORDER BY id" + tabla + " ASC" ;
        Statement consulta = bd.prepararConsulta();
        ResultSet resultado = bd.lanzarQuery(consulta, query);
        
        //Mostrar resultado
        while (resultado.next()){
            if(tabla!="Producto"){
                
                String salida = resultado.getInt(1) +" "+ resultado.getString(2)+" "+resultado.getString(3)+" "+resultado.getString(4)+" "+resultado.getString(5);
                System.out.println(salida);
                textArea2.append("\n" + salida);
            }
            else{
                String salida = resultado.getInt(1) + " "+resultado.getString(2)+" "+
                        resultado.getInt(3) +" "+ resultado.getString(4) ;
                textArea2.append("\n" + salida);
            }
        }
    }

}