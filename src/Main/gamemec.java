/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Guacha
 */
public class gamemec {
    public gamemec(){
        
    }
    private static int turn;
    private static long init;
    private static Timer tmp;
    private static int noire;
    private static int blanche;
    public String p1;
    public String p2;
    private static int fichcont;
    private static int tabsz;
    private static int inisegs;
    private static int segs;
    private static JLabel templabel, lab1, lab2;
    private static JFrame frameTab;
    private static int diff;
    private static boolean IAiru;
    public static int[][] tab = new int[21][21];
    
    
    
    

    
    
    public static final Icon blanc = new ImageIcon("src/Buttons/blancafinal.png");
    public static final Icon noir = new ImageIcon("src/Buttons/negrafinal.png");
    public static final Icon transnoir = new ImageIcon("src/Buttons/negratransfinal.png");
    public static final Icon transblanc = new ImageIcon("src/Buttons/blancatransfinal.png");
    
    public void getTabInfo(int integer, int df, JFrame frame, JLabel label, JLabel label2, JLabel temp, boolean iagame){
        tabsz = integer;
        frameTab = frame;
        lab1 = label; lab2 = label2; templabel = temp;
        IAiru = iagame;
        diff = df;
        
    }
    public void assturn(){
        double rand = Math.random();
        if (rand < 0.5){
            noire = 1;
            blanche = 2;
            turn = 1;
            
        } else{
            noire = 2;
            blanche = 1;
            turn = 2;
            
        }
    }
    
    public int getnoir(){
        return noire;
    }
    
        public int getblanc(){
        return blanche;
    }    
    
    public int getTurn(){
        return turn;
    }
    public void mecturn(int turno){
        if (turn == 1){
            turn = 2;
        } else{
            turn = 1;
        }
        
    }
    
    public javax.swing.JButton getButt(Object obt){
        return (javax.swing.JButton)obt;
    }
    
    public void stp(int seg){
        inisegs = seg;
        segs = inisegs;
        int delay = 1000, period = delay;
        tmp = new Timer();
        templabel.setText(String.valueOf(inisegs));
        tmp.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                
                templabel.setText(String.valueOf(setInterval()));
                if(segs == 0){
                    
                    JOptionPane.showMessageDialog(null, "Has perdido tu turno", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    IA ia = new IA(tabsz, 0, null);
                    
                    tmp.cancel();
                    ia.IATurn(frameTab);
                    
                    
                }
            }
        }, delay, period);
    }
    private final int setInterval(){
        if (segs < 2){
            tmp.cancel();
        }
        int res = (segs - 1);
        segs = res;
        return res;
    }
    public int getcol(javax.swing.JButton button){
        
        int i = 18;
        int j = 0;
        while (i != button.getX()){
            i = i+33;
            
            j++;
        }
        return j;
        
            
    }
    
    public int getfil(javax.swing.JButton button){
        
        int i = 20;
        int j = 0;
        while (i != button.getY()){
            i = i+33;
            j++;
        }
        return j;
        
            
    }
    
    public void initab(){
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                tab[i][j] = 0;
            }
        }
        init = System.currentTimeMillis();
        
    }
    
    public void marcar(javax.swing.JButton button, int turno){
        if(tab[getcol(button)][getfil(button)] == 0){
            tab[getcol(button)][getfil(button)] = turno;
            
            if (noire == turno){
                button.setIcon(noir);
            } else if (blanche == turno){
                button.setIcon(blanc);
            }
            mecturn(turno);
            lblupd();
            fichcont++;
            if(!IAiru){
                
                tmp.cancel();
                stp(diff); 
            }
            
            
        } else{
            System.out.println("NOPE!, ya hay un " + tab[getcol(button)][getfil(button)]);
        }
            
    }
    
    public void sombrear(javax.swing.JButton button, int turno, boolean ent){
        if(tab[getcol(button)][getfil(button)] == 0){
            if(ent){
                if(turno == noire){
                    button.setIcon(transnoir);
                } else{
                    button.setIcon(transblanc);
                }
            } else{
                button.setIcon(null);
            }
        }
            
    }
    
    private int chkver(){
        for (int i = 0; i < 21; i++){
            for (int j = 0; j < 17; j++){
                if(tab[i][j] != 0){
                    if (tab[i][j] == tab[i][j+1] && tab[i][j] == tab[i][j+2] && tab[i][j] == tab[i][j+3] && tab[i][j] == tab[i][j+4]){
                        if(tab[i][j] == noire){
                            return noire;
                        } else{
                            return blanche;
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    private int chkhor(){
        for (int i = 0; i < 17; i++){
            for (int j = 0; j < 21; j++){
                if(tab[i][j] != 0){
                    if (tab[i][j] == tab[i+1][j] && tab[i][j] == tab[i+2][j] && tab[i][j] == tab[i+3][j] && tab[i][j] == tab[i+4][j]){
                        if(tab[i][j] == noire){
                            return noire;
                        } else{
                            return blanche;
                        }
                    }
                }
            }
        }
        return 0;
    }
    
   private int chkdiag(){
       for (int i = 0; i < 17; i++) {
           for (int j = 0; j < 17; j++) {
               if (tab[j][i] != 0) {
                   if (tab[j][i] == tab[j+1][i+1] && tab[j][i] == tab[j+2][i+2] && tab[j][i] == tab[j+3][i+3] && tab[j][i] == tab[j+4][i+4]){
                       if(tab[j][i] == noire){
                            return noire;
                        } else{
                            return blanche;
                        }
                   }
               }
            }    
       }
       
       for (int i = 0; i < 17; i++) {
           for (int j = 5; j < 17; j++) {
               if (tab[j][i] != 0) {
                   if (tab[j][i] == tab[j-1][i+1] && tab[j][i] == tab[j-2][i+2] && tab[j][i] == tab[j-3][i+3] && tab[j][i] == tab[j-4][i+4]){
                       if(tab[j][i] == noire){
                            return noire;
                        } else{
                            return blanche;
                        }
                   }
               }
           }
           
       }
       return 0;
   }
   
   public int chkvic(){
       if(chkdiag() != 0){
           if (!IAiru) {
               tmp.cancel();
           }
           
           return chkdiag();
       }
       if(chkhor() != 0){
           if (!IAiru) {
               tmp.cancel();
           }
           return chkhor();
       }
       if(chkver() != 0){
           if (!IAiru) {
               tmp.cancel();
           }
           return chkver();
       }
       return 0;
   }
   
   public int getSegs(){
       long l = System.currentTimeMillis();

       return (int)((l-init)/1000);
   }
   public String getTime(){
       String res = "";
       
       res = res + (int)(getSegs()/60) + ":" + getSegs()%60; 
       return res;
   }
   public void lblupd(){
       if (getTurn() == getnoir()){
            lab1.setText("黒");
            lab2.setText("(Negras)");
        } else{
            lab1.setText("白");
            lab2.setText("(Blancas)");
        }
   }
   

   public boolean chkplz(JButton button){
       if(tab[getcol(button)][getfil(button)] == 0){
           return true;
       }
       return false;
   }
   
   public int contFich(){
       return fichcont;
   }

   

}
