/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Guacha
 */
public class Registro extends javax.swing.JFrame {

    
    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
    }
    
    
    private String conv(char[] chr){
        String res = "";
        
        for (int i = 0; i < chr.length; i++){
            res = res + chr[i];
        }
        return res;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usr = new javax.swing.JTextField();
        conpss = new javax.swing.JPasswordField();
        pss = new javax.swing.JPasswordField();
        salir = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        reg = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registre su usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Confirmar Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 20));

        usr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrActionPerformed(evt);
            }
        });
        getContentPane().add(usr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, -1));

        conpss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        conpss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpssActionPerformed(evt);
            }
        });
        getContentPane().add(conpss, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 130, -1));

        pss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pssActionPerformed(evt);
            }
        });
        getContentPane().add(pss, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 130, -1));

        salir.setText("Volver a menú");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 440, 40));

        reg.setText("Registrarme");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        getContentPane().add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void pssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pssActionPerformed
        
    }//GEN-LAST:event_pssActionPerformed

    private void usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrActionPerformed

    private void conpssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpssActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        char[] psw = pss.getPassword();
        char[] psw2 = conpss.getPassword();
        String usuario = usr.getText();
        if (conv(psw2).equals(conv(psw))){
            
            
            dbclass regusr = new dbclass("src/files/usr.txt");
            dbclass regpsw = new dbclass("src/files/psw.txt", true);
            
            try {
                if (regusr.compArch(usuario)){
                    JOptionPane.showMessageDialog(null, "El usuario " + usuario + " Ya se encuentra registrado, Inténte con otro nombre.", "Error de registro", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        regusr.escrArch(usuario);
                        regpsw.escrArch(conv(psw));
                        JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha sido registrado satisfactoriamente", "Registro Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
                        
                        Main vent = new Main();
                        vent.setVisible(true);
                        this.dispose();
                    } catch (IOException ex) {
                        System.out.println("ERROR DE ESCRITURA!");
                        System.out.println("Tipo de Error: " + ex);
                        System.out.println("Contacte a Servicio técnico");
                    }
                }
            } catch (IOException ex) {
                try {
                    regusr.escrArch(usuario);
                    regpsw.escrArch(conv(psw));
                    JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha sido registrado satisfactoriamente", "Registro Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex1) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            
        } else{
            JOptionPane.showMessageDialog(null, "Las contraseñas ingresadas no coinciden, Inténte nuevamente", "Error de registro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_regActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField conpss;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField pss;
    private javax.swing.JButton reg;
    private javax.swing.JButton salir;
    private javax.swing.JTextField usr;
    // End of variables declaration//GEN-END:variables
}
