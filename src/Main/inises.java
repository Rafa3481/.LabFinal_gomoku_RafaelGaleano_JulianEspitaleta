/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Guacha
 */
public class inises extends javax.swing.JFrame {

    /**
     * Creates new form inises
     */
    public inises() {
        initComponents();
        acc.setVisible(false);
    }
    
    private String usrh;
    public inises(boolean usr2, String usr1){
        initComponents();
        if (usr2){
            nobutton();
            usrh = usr1;
        }
        
    }
    public static String usrlog1;
    public static String usrlog2;
    
    private String conv(char[] chr){
        String res = "";
        
        for (int i = 0; i < chr.length; i++){
            res = res + chr[i];
        }
        return res;
    }
    
    private boolean compcred(String usr, char[] pswi){
        dbclass regusr = new dbclass("src/files/usr.txt");
        dbclass regpsw = new dbclass("src/files/psw.txt");
        int pos = 0;
        try {
            String[] reg = regusr.leerArch();
            
            
            while (!(reg[pos].equalsIgnoreCase(usr)) && (pos < reg.length)){
                pos++;
            }           
            
            if (pos == reg.length){
                
                return false;
            }
            
        } catch (IOException ex) {
            Logger.getLogger(inises.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            String[] psws = regpsw.leerArch();
            
            if (conv(pswi).equals(psws[pos])){
                usrlog1 = usr;
                return true;                
            }
        } catch (IOException ex) {
            Logger.getLogger(inises.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    private void nobutton(){
        P2.setVisible(false);
        IA.setVisible(false);
        acc.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        psw = new javax.swing.JPasswordField();
        P2 = new javax.swing.JButton();
        IA = new javax.swing.JButton();
        acc = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho NP-B", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ログイン");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 460, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicie Sesión");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 460, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre de Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 460, -1));

        usr.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrActionPerformed(evt);
            }
        });
        getContentPane().add(usr, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 460, -1));

        psw.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        psw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswActionPerformed(evt);
            }
        });
        getContentPane().add(psw, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 220, -1));

        P2.setBackground(new java.awt.Color(235, 159, 29));
        P2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 15)); // NOI18N
        P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/tomo.png"))); // NOI18N
        P2.setText("<html>\n<p style=\"text-align: center;\">友とゲームする </p><br><p style=\"text-align: center;\"> Jugar VS Otro Jugador</p>\n");
        P2.setContentAreaFilled(false);
        P2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P2MouseExited(evt);
            }
        });
        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });
        getContentPane().add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 210, 80));

        IA.setBackground(new java.awt.Color(235, 159, 29));
        IA.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 15)); // NOI18N
        IA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/ia.png"))); // NOI18N
        IA.setText("<html> <p style=\"text-align: center;\">AIとゲームする </p><br><p style=\"text-align: center;\"> Jugar VS IA</p>");
        IA.setContentAreaFilled(false);
        IA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IAMouseExited(evt);
            }
        });
        IA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IAActionPerformed(evt);
            }
        });
        getContentPane().add(IA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 210, 80));

        acc.setText("Aceptar");
        acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accActionPerformed(evt);
            }
        });
        getContentPane().add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/RegisterBackground.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-470, 0, 930, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswActionPerformed

    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed
        String[] opt = {"Registrar 2do Jugador", "Jugar como Invitado", "Iniciar Sesión"};
        if(compcred(usr.getText(), psw.getPassword())){
            int sel = JOptionPane.showOptionDialog(null, "Qué desea hacer?", "Opciones para Jugador 2", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,opt, opt[0]);
            this.setVisible(false);
            
            switch(sel){
                
                case 0: 
                    Registro vent0 = new Registro();
                    vent0.setVisible(true);
                break;
                
                case 1:
                    String[] tabs = {"15x15", "19x19", "21x21"};
                    int sel2 = JOptionPane.showOptionDialog(null, "Elija su estilo de tablero", "Opciones de Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,tabs, opt[0]);
                    this.setVisible(false);

                    switch(sel2){

                        case 0: 
                            tab15 vent = new tab15(usr.getText(),"Invitado", -1);
                            vent.setVisible(true);
                            this.dispose();
                        break;

                        case 1:
                            tab19 vent1 = new tab19(usr.getText(),"Invitado", -1);
                            vent1.setVisible(true);
                            this.dispose();
                        break;

                        case 2: 
                            tab21 vent2 = new tab21(usr.getText(),"Invitado", -1);
                            vent2.setVisible(true);
                            this.dispose();
                        break;
                    }
                break;
                
                case 2: 
                    inises vent2 = new inises(true, usr.getText());
                    vent2.setVisible(true);

                break;
            }
        } else{
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Inválido", "Error al Iniciar Sesión", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_P2ActionPerformed

    private void IAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IAActionPerformed
        String[] opt = {"15x15", "19x19", "21x21"};
        String[] iaopt = {"Fácil", "Medio", "Complejo"};
        if(compcred(usr.getText(), psw.getPassword())){
            int iabr = JOptionPane.showOptionDialog(null, "Elija la dificultad de la partida", "Opciones de Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,iaopt, iaopt[0]);
            int sel = JOptionPane.showOptionDialog(null, "Elija su estilo de tablero", "Opciones de Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,opt, opt[0]);
                this.setVisible(false);

                switch(sel){

                    case 0: 
                        tab15 vent0 = new tab15(usr.getText(), "iaai", iabr);
                        vent0.setVisible(true);
                        this.dispose();
                    break;

                    case 1:
                        tab19 vent1 = new tab19(usr.getText(), "iaai", iabr);
                        vent1.setVisible(true);
                        this.dispose();
                    break;

                    case 2: 
                        tab21 vent2 = new tab21(usr.getText(), "iaai", iabr);
                        vent2.setVisible(true);
                        this.dispose();
                    break;
                }
        } else{
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Inválido", "Error al Iniciar Sesión", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_IAActionPerformed

    private void P2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2MouseEntered
        ImageIcon tilted = new ImageIcon("src/Buttons/tomotilted.png");
        P2.setIcon(tilted);
    }//GEN-LAST:event_P2MouseEntered

    private void P2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2MouseExited
        ImageIcon tilt = new ImageIcon("src/Buttons/tomo.png");
        P2.setIcon(tilt);
    }//GEN-LAST:event_P2MouseExited

    private void IAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IAMouseEntered
        ImageIcon tilted = new ImageIcon("src/Buttons/iatilted.png");
        IA.setIcon(tilted);
    }//GEN-LAST:event_IAMouseEntered

    private void IAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IAMouseExited
        ImageIcon tilt = new ImageIcon("src/Buttons/ia.png");
        IA.setIcon(tilt);
    }//GEN-LAST:event_IAMouseExited

    private void accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accActionPerformed
        String[] opt = {"15x15", "19x19", "21x21"};
        
        if(compcred(usr.getText(), psw.getPassword())){
            int sel = JOptionPane.showOptionDialog(null, "Elija su estilo de tablero", "Opciones de Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,opt, opt[0]);
                this.setVisible(false);

                switch(sel){

                    case 0: 
                        tab15 vent0 = new tab15(usrh,usr.getText(), -1);
                        vent0.setVisible(true);
                        this.dispose();
                    break;

                    case 1:
                        tab19 vent1 = new tab19(usrh,usr.getText(), -1);
                        vent1.setVisible(true);
                        this.dispose();
                    break;

                    case 2: 
                        tab21 vent2 = new tab21(usrh,usr.getText(), -1);
                        vent2.setVisible(true);
                        this.dispose();
                    break;
                }
        } else{
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Inválido", "Error al Iniciar Sesión", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_accActionPerformed

    private void usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrActionPerformed

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
            java.util.logging.Logger.getLogger(inises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inises().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IA;
    private javax.swing.JButton P2;
    private javax.swing.JButton acc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField psw;
    private javax.swing.JTextField usr;
    // End of variables declaration//GEN-END:variables
}
