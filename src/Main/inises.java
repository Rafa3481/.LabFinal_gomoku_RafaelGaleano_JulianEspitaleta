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
    private int dfsel;
    private int tab;
    
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

        tabsel = new javax.swing.JDialog();
        b15 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        diffsel = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        med = new javax.swing.JButton();
        izi = new javax.swing.JButton();
        hrd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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

        tabsel.setMinimumSize(new java.awt.Dimension(317, 150));
        tabsel.setPreferredSize(new java.awt.Dimension(311, 117));
        tabsel.setResizable(false);
        tabsel.getContentPane().setLayout(null);

        b15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/15Xbase.png"))); // NOI18N
        b15.setContentAreaFilled(false);
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b15MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b15MouseReleased(evt);
            }
        });
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        tabsel.getContentPane().add(b15);
        b15.setBounds(10, 60, 90, 40);

        b19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/19Xbase.png"))); // NOI18N
        b19.setContentAreaFilled(false);
        b19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b19MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b19MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b19MouseReleased(evt);
            }
        });
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        tabsel.getContentPane().add(b19);
        b19.setBounds(110, 60, 90, 40);

        b21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/21Xbase.png"))); // NOI18N
        b21.setContentAreaFilled(false);
        b21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b21MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b21MouseReleased(evt);
            }
        });
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        tabsel.getContentPane().add(b21);
        b21.setBounds(210, 60, 90, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tamaño del tablero");
        tabsel.getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 10, 207, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/UB.jpg"))); // NOI18N
        tabsel.getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 310, 120);

        diffsel.setMinimumSize(new java.awt.Dimension(296, 150));
        diffsel.setResizable(false);
        diffsel.getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Elija la dificultad");
        diffsel.getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 10, 310, 29);

        med.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Mediabase.png"))); // NOI18N
        med.setContentAreaFilled(false);
        med.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                medMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                medMouseReleased(evt);
            }
        });
        med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medActionPerformed(evt);
            }
        });
        diffsel.getContentPane().add(med);
        med.setBounds(100, 60, 90, 40);

        izi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        izi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Facilbase.png"))); // NOI18N
        izi.setContentAreaFilled(false);
        izi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iziMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iziMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iziMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iziMouseReleased(evt);
            }
        });
        izi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iziActionPerformed(evt);
            }
        });
        diffsel.getContentPane().add(izi);
        izi.setBounds(10, 60, 90, 40);

        hrd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hrd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Dificilbase.png"))); // NOI18N
        hrd.setContentAreaFilled(false);
        hrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hrdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hrdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hrdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hrdMouseReleased(evt);
            }
        });
        hrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrdActionPerformed(evt);
            }
        });
        diffsel.getContentPane().add(hrd);
        hrd.setBounds(190, 60, 90, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/UB.jpg"))); // NOI18N
        jLabel8.setMinimumSize(new java.awt.Dimension(250, 250));
        diffsel.getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 290, 120);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(480, 560));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho NP-B", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ログイン");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 460, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicie Sesión");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -4, 460, 80);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre de Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 200, 460, 22);

        usr.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrActionPerformed(evt);
            }
        });
        getContentPane().add(usr);
        usr.setBounds(120, 230, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 280, 460, 22);

        psw.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        psw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswActionPerformed(evt);
            }
        });
        getContentPane().add(psw);
        psw.setBounds(120, 310, 220, 30);

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
        getContentPane().add(P2);
        P2.setBounds(240, 430, 210, 80);

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
        getContentPane().add(IA);
        IA.setBounds(10, 430, 210, 80);

        acc.setText("Aceptar");
        acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accActionPerformed(evt);
            }
        });
        getContentPane().add(acc);
        acc.setBounds(190, 360, 77, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/RegisterBackground.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-320, 0, 790, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswActionPerformed

    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed
        String[] opt = {"Registrar 2do Jugador", "Jugar como Invitado", "Iniciar Sesión"};
        //String[] dfopt = {"Fácil", "Medio", "Complejo"};
        if(compcred(usr.getText(), psw.getPassword())){
            int sel = JOptionPane.showOptionDialog(null, "Qué desea hacer?", "Opciones para Jugador 2", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,opt, opt[0]);
            this.setVisible(false);
            
            switch(sel){
                
                case 0: 
                    Registro vent0 = new Registro();
                    vent0.setVisible(true);
                break;
                
                case 1:
                    tabsel.setLocationRelativeTo(null);
                    tabsel.setVisible(true);
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
        String[] dfopt = {"Fácil", "Medio", "Complejo"};
        
        if(compcred(usr.getText(), psw.getPassword())){
            int iabr = JOptionPane.showOptionDialog(null, "Elija la dificultad de la partida", "Opciones de Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,dfopt, dfopt[0]);
            int sel = JOptionPane.showOptionDialog(null, "Elija su estilo de tablero", "Opciones de Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,opt, opt[0]);
                this.setVisible(false);

                switch(sel){

                    case 0: 
                        tab15 vent0 = new tab15(usr.getText(), "iaai", iabr, -1);
                        vent0.setVisible(true);
                        this.dispose();
                        
                    break;

                    case 1:
                        tab19 vent1 = new tab19(usr.getText(), "iaai", iabr, -1);
                        vent1.setVisible(true);
                        this.dispose();
                        
                    break;

                    case 2: 
                        tab21 vent2 = new tab21(usr.getText(), "iaai", iabr, -1);
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
        String[] dfopt = {"Fácil", "Medio", "Complejo"};
         //= JOptionPane.showOptionDialog(null, "Elija la dificultad de la partida", "Opciones de Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,dfopt, dfopt[0]);
            int diff = 10;
            
            switch(dfsel){
                case 0: diff tabselk;              
                case 1: diff = 5; break;
                case 2: diff = 3; break;
            }
        if(compcred(usr.getText(), psw.getPassword())){
            int sel = JOptionPane.showOptionDialog(null, "Elija su estilo de tablero", "Opciones de Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null ,opt, opt[0]);
                this.setVisible(false);

                switch(sel){

                    case 0: 
                        tab15 vent0 = new tab15(usrh,usr.getText(), -1, diff);
                        vent0.setVisible(true);
                        this.dispose();
                    break;

                    case 1:
                        tab19 vent1 = new tab19(usrh,usr.getText(), -1, diff);
                        vent1.setVisible(true);
                        this.dispose();
                    break;

                    case 2: 
                        tab21 vent2 = new tab21(usrh,usr.getText(), -1, diff);
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

    private void b15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/15Xtilted.png"));
        b15.setIcon(ii);
    }//GEN-LAST:event_b15MouseEntered

    private void b15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/15Xbase.png"));
        b15.setIcon(ii);
    }//GEN-LAST:event_b15MouseExited

    private void b15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/15Xpressed.png"));
        b15.setIcon(ii);
    }//GEN-LAST:event_b15MousePressed

    private void b15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/15Xbase.png"));
        b15.setIcon(ii);
    }//GEN-LAST:event_b15MouseReleased

    private void b19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b19MouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/19Xtilted.png"));
        b19.setIcon(ii);
    }//GEN-LAST:event_b19MouseEntered

    private void b19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b19MouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/19Xbase.png"));
        b19.setIcon(ii);
    }//GEN-LAST:event_b19MouseExited

    private void b19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b19MousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/19Xpressed.png"));
        b19.setIcon(ii);
    }//GEN-LAST:event_b19MousePressed

    private void b19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b19MouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/19Xbase.png"));
        b19.setIcon(ii);
    }//GEN-LAST:event_b19MouseReleased

    private void b21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/21Xtilted.png"));
        b21.setIcon(ii);
    }//GEN-LAST:event_b21MouseEntered

    private void b21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/21Xbase.png"));
        b21.setIcon(ii);
    }//GEN-LAST:event_b21MouseExited

    private void b21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/21Xpressed.png"));
        b21.setIcon(ii);
    }//GEN-LAST:event_b21MousePressed

    private void b21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/21Xbase.png"));
        b21.setIcon(ii);
    }//GEN-LAST:event_b21MouseReleased

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        tab = 15;
        tabsel.dispose();
        diffsel.setVisible(true);
    }//GEN-LAST:event_b15ActionPerformed

    private void iziMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iziMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Faciltilted.png"));
        izi.setIcon(ii);
    }//GEN-LAST:event_iziMouseEntered

    private void iziMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iziMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Facilbase.png"));
        izi.setIcon(ii);
    }//GEN-LAST:event_iziMouseExited

    private void iziMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iziMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Facilpressed.png"));
        izi.setIcon(ii);
    }//GEN-LAST:event_iziMousePressed

    private void iziMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iziMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Facilbase.png"));
        izi.setIcon(ii);
    }//GEN-LAST:event_iziMouseReleased

    private void medMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Mediatilted.png"));
        med.setIcon(ii);
    }//GEN-LAST:event_medMouseEntered

    private void medMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Mediabase.png"));
        med.setIcon(ii);
    }//GEN-LAST:event_medMouseExited

    private void medMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Mediapressed.png"));
        med.setIcon(ii);
    }//GEN-LAST:event_medMousePressed

    private void medMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Mediabase.png"));
        med.setIcon(ii);
    }//GEN-LAST:event_medMouseReleased

    private void hrdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hrdMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Dificiltilted.png"));
        hrd.setIcon(ii);
    }//GEN-LAST:event_hrdMouseEntered

    private void hrdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hrdMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Dificilbase.png"));
        hrd.setIcon(ii);
    }//GEN-LAST:event_hrdMouseExited

    private void hrdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hrdMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Dificilpressed.png"));
        hrd.setIcon(ii);
    }//GEN-LAST:event_hrdMousePressed

    private void hrdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hrdMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/Buttons/Dificilbase.png"));
        hrd.setIcon(ii);
    }//GEN-LAST:event_hrdMouseReleased

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        tab = 19;
        tabsel.dispose();
        diffsel.setVisible(true);
    }//GEN-LAST:event_b19ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        tab = 21;
        tabsel.dispose();
        diffsel.setVisible(true);
    }//GEN-LAST:event_b21ActionPerformed

    private void iziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iziActionPerformed
        switch(tab){
            case 15: 
                tab15 brd15 = new tab15("Invitado", usr.getText(),-1,10);
                brd15.setVisible(true); 
                
                this.dispose(); 
                
            break;
            
            case 19: 
                tab19 brd19 = new tab19("Invitado", usr.getText(),-1,10);
                brd19.setVisible(true); 
                diffsel.setVisible(false);
                this.dispose(); 
                
            break;
            
            case 21: 
                tab21 brd21 = new tab21("Invitado", usr.getText(),-1,10);
                brd21.setVisible(true); 
                diffsel.setVisible(false);
                this.dispose();
            break;
        }
    }//GEN-LAST:event_iziActionPerformed

    private void medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medActionPerformed
        switch(tab){
            case 15: 
                tab15 brd15 = new tab15("Invitado", usr.getText(),-1,5);
                brd15.setVisible(true); 
                
                this.dispose(); 
                
            break;
            
            case 19: 
                tab19 brd19 = new tab19("Invitado", usr.getText(),-1,5);
                brd19.setVisible(true); 
                diffsel.setVisible(false);
                this.dispose(); 
                
            break;
            
            case 21: 
                tab21 brd21 = new tab21("Invitado", usr.getText(),-1,5);
                brd21.setVisible(true); 
                diffsel.setVisible(false);
                this.dispose();
            break;
        }
    }//GEN-LAST:event_medActionPerformed

    private void hrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrdActionPerformed
        switch(tab){
            case 15: 
                tab15 brd15 = new tab15("Invitado", usr.getText(),-1,3);
                brd15.setVisible(true); 
                
                this.dispose(); 
                
            break;
            
            case 19: 
                tab19 brd19 = new tab19("Invitado", usr.getText(),-1,3);
                brd19.setVisible(true); 
                diffsel.setVisible(false);
                this.dispose(); 
                
            break;
            
            case 21: 
                tab21 brd21 = new tab21("Invitado", usr.getText(),-1,3);
                brd21.setVisible(true); 
                diffsel.setVisible(false);
                this.dispose();
            break;
        }
    }//GEN-LAST:event_hrdActionPerformed

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
    private javax.swing.JButton b15;
    private javax.swing.JButton b19;
    private javax.swing.JButton b21;
    private javax.swing.JDialog diffsel;
    private javax.swing.JButton hrd;
    private javax.swing.JButton izi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton med;
    private javax.swing.JPasswordField psw;
    private javax.swing.JDialog tabsel;
    private javax.swing.JTextField usr;
    // End of variables declaration//GEN-END:variables
}
