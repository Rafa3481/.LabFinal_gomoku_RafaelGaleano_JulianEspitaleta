/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Timer;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Guacha
 */
public class gamemec {
    public gamemec(){
        
    }
    private static int turn;
    
    private static int noire;
    private static int blanche;
    public String p1;
    public String p2;
    
    public static int[][] tab = new int[21][21];
    private long iniTemp = 0, finTmp = 0;
    private boolean stp = false;
    
    public void tempstart(){
        this.iniTemp = System.currentTimeMillis();
        stp = true;
    }
    
    public void tempstop(){
        this.finTmp = System.currentTimeMillis();
        stp = false;
    }
    

    
    
    public static final Icon blanc = new ImageIcon("src/Buttons/blancafinal.png");
    public static final Icon noir = new ImageIcon("src/Buttons/negrafinal.png");
    public static final Icon transnoir = new ImageIcon("src/Buttons/negratransfinal.png");
    public static final Icon transblanc = new ImageIcon("src/Buttons/blancatransfinal.png");
    
    
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
           return chkdiag();
       }
       if(chkhor() != 0){
           return chkhor();
       }
       if(chkver() != 0){
           return chkver();
       }
       return 0;
   }
    
}
