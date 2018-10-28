/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

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
    
}
