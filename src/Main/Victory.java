/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.ImageIcon;





/**
 *
 * @author galea
 */
public class Victory extends javax.swing.JFrame {

    /**
     * Creates new form Victory
     */
    public Victory(){
        initComponents();
    }
    public Victory(int winner, String wnr) {
        initComponents();
        gamemec mec = new gamemec();
        int wh = mec.getblanc(), bl = mec.getnoir();
        temps.setText(mec.getTime());
        fichas.setText(String.valueOf(mec.contFich()));
        

           txt.setText("winner winner chicken dinner (" + wnr + ")");
           omedetou.setText(wnr.toUpperCase() + "さん、おめでとうございます！！");
        

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
        txt = new javax.swing.JLabel();
        omedetou = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fichas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        temps = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(329, 106));
        setPreferredSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/vjbase.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 210, 170, 30);

        txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.setLabelFor(txt);
        txt.setText("winner winner chicken dinner");
        txt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(txt);
        txt.setBounds(0, 10, 500, 44);
        txt.getAccessibleContext().setAccessibleParent(txt);

        omedetou.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 22)); // NOI18N
        omedetou.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        omedetou.setText("###############さん、おめでとうございます！！");
        getContentPane().add(omedetou);
        omedetou.setBounds(1, 86, 500, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/vmpbase.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 210, 260, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Fichas Colocadas: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 160, 140, 20);

        fichas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fichas.setText("fichas");
        getContentPane().add(fichas);
        fichas.setBounds(290, 160, 70, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Tiempo de partida: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 140, 150, 20);

        temps.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        temps.setText("temps");
        getContentPane().add(temps);
        temps.setBounds(290, 140, 70, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/RegisterBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-220, -240, 720, 660);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inises vent = new inises();
        vent.setVisible(true);
        this.dispose();
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main vent = new Main();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/vjtilted.png"));
        jButton1.setIcon(ii);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/vjbase.png"));
        jButton1.setIcon(ii);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/vjpressed.png"));
        jButton1.setIcon(ii);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/vmptilted.png"));
        jButton2.setIcon(ii);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/vmpbase.png"));
        jButton2.setIcon(ii);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/vmppressed.png"));
        jButton2.setIcon(ii);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/vjbase.png"));
        jButton1.setIcon(ii);
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/vmpbase.png"));
        jButton2.setIcon(ii);
    }//GEN-LAST:event_jButton2MouseReleased

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
            java.util.logging.Logger.getLogger(Victory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Victory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Victory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Victory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Victory().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fichas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel omedetou;
    private javax.swing.JLabel temps;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
