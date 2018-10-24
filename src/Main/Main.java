/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.ImageIcon;

/**
 *
 * @author ragaleano
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        inises = new javax.swing.JButton();
        regist = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gomoku");
        setMaximumSize(new java.awt.Dimension(400, 620));
        setMinimumSize(new java.awt.Dimension(400, 620));
        setPreferredSize(new java.awt.Dimension(400, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho NP-B", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("五目並べ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 70, 210, 80);

        jLabel3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gomoku");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 80);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Base3.png"))); // NOI18N
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                salirMouseReleased(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(150, 430, 100, 50);

        inises.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Base1.png"))); // NOI18N
        inises.setBorderPainted(false);
        inises.setContentAreaFilled(false);
        inises.setPreferredSize(new java.awt.Dimension(200, 57));
        inises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inisesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inisesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inisesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                inisesMouseReleased(evt);
            }
        });
        inises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inisesActionPerformed(evt);
            }
        });
        getContentPane().add(inises);
        inises.setBounds(110, 290, 180, 50);

        regist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Base2.png"))); // NOI18N
        regist.setBorderPainted(false);
        regist.setContentAreaFilled(false);
        regist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registMouseReleased(evt);
            }
        });
        regist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registActionPerformed(evt);
            }
        });
        getContentPane().add(regist);
        regist.setBounds(120, 360, 160, 50);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/gear_icon-icons.com_69371 (1).png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 530, 50, 50);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/MainBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, -30, 450, 630);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void inisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inisesActionPerformed
        inises vent = new inises();
        
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inisesActionPerformed

    private void registActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registActionPerformed
        Registro wat = new Registro();
        wat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // button.setOpaque(false);
        //button.setContentAreaFilled(false);
        //button.setBorderPainted(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inisesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inisesMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/tilted1.png"));
        inises.setIcon(ii);
    }//GEN-LAST:event_inisesMouseEntered

    private void inisesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inisesMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/base1.png"));
        inises.setIcon(ii);
    }//GEN-LAST:event_inisesMouseExited

    private void inisesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inisesMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/pressed1.png"));
        inises.setIcon(ii);
    }//GEN-LAST:event_inisesMousePressed

    private void inisesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inisesMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/base1.png"));
        inises.setIcon(ii);
    }//GEN-LAST:event_inisesMouseReleased

    private void registMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/tilted2.png"));
        regist.setIcon(ii);
    }//GEN-LAST:event_registMouseEntered

    private void registMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/base2.png"));
        regist.setIcon(ii);
    }//GEN-LAST:event_registMouseExited

    private void registMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/pressed2.png"));
        regist.setIcon(ii);
    }//GEN-LAST:event_registMousePressed

    private void registMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/base2.png"));
        regist.setIcon(ii);
    }//GEN-LAST:event_registMouseReleased

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/tilted3.png"));
        salir.setIcon(ii);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/base3.png"));
        salir.setIcon(ii);
    }//GEN-LAST:event_salirMouseExited

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/pressed3.png"));
        salir.setIcon(ii);
    }//GEN-LAST:event_salirMousePressed

    private void salirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/base3.png"));
        salir.setIcon(ii);
    }//GEN-LAST:event_salirMouseReleased

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inises;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton regist;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
