/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Guacha
 */
public class tab21 extends javax.swing.JFrame {

    /**
     * Creates new form tab21
     */
    public tab21() {
        initComponents();
    }
    
    public tab21(String nom1, String nom2){
        initComponents();
        if (nom2.equalsIgnoreCase("iaai")){
            gamemec mec = new gamemec(true, nom1, nom2);
            mec.assturn();
            if (mec.getnoir() == 1){
                kuro.setText(nom1);
                shiro.setText("IA");
            } else{
                kuro.setText("IA");
                shiro.setText(nom1);
            }
        } else{
            gamemec mec = new gamemec(true, nom1, nom2);
            mec.assturn();
            if (mec.getnoir() == 1){
                kuro.setText(nom1);
                shiro.setText(nom2);
            } else{
                kuro.setText(nom2);
                shiro.setText(nom1);
            }
            
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kuro = new javax.swing.JTextField();
        shiro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho NP-B", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("五目並べ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 400, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tabs/21x21.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 730));

        jLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 18)); // NOI18N
        jLabel3.setText("黒いのチップス");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 130, -1));

        jLabel4.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 18)); // NOI18N
        jLabel4.setText("(Fichas Negras)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 18)); // NOI18N
        jLabel5.setText("白いのチップス");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, 130, -1));

        jLabel6.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 18)); // NOI18N
        jLabel6.setText("(Fichas Blancas)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 190, -1, -1));

        kuro.setEditable(false);
        getContentPane().add(kuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 140, -1));

        shiro.setEditable(false);
        getContentPane().add(shiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(tab21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tab21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tab21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tab21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tab21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kuro;
    private javax.swing.JTextField shiro;
    // End of variables declaration//GEN-END:variables
}
