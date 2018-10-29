/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Guacha
 */
public class IA {
    private int tabsz;
    private int brain;
    private int casx;
    private int casy;
    private JButton prev;
    public static boolean myTurn;
    
    
    public IA(int tamtab, int diff, JButton prevButt){
        tabsz = tamtab;
        brain = diff;
        selcas(brain);
        prev = prevButt;
    }
    
    private void selcas(int dif){
        if (dif == 0){
            casx = (int) (Math.random() * tabsz);
            casy = (int) (Math.random() * tabsz);   
        }
        
    }
    
    public int getX(){
        return casx;
    }
    
    public int getY(){
        return casy;
    }
    
    public boolean chkplay(){
        gamemec mec = new gamemec();
        if(mec.tab[getX()][getY()] != 0 && mec.tab[getX()][getY()] != mec.getTurn()){
            
            return false;
        } else{
            System.out.println("Reintentando ");
        }
        return true;
    }
    
    public void IATurn(JFrame frame, JLabel lab1, JLabel lab2){
        gamemec mec = new gamemec();
        myTurn = true;
        int its = (int)(Math.random()*3+1)*1000;
        System.out.println(its);
        myTurn = true;
        
            
            
            new java.util.Timer().schedule( 
            new java.util.TimerTask() {
                
                @Override
                public void run() {
                    do{
                    
                    selcas(brain);
                    
                    int Y = getY()*33+20, X = getX()*33+18;
                    JButton IAButton = (JButton) frame.getContentPane().getComponentAt(X, Y);
                    System.out.println(X + ", " + Y);
                    mec.marcar(IAButton, mec.getTurn(), lab1, lab2);
                    }while(chkplay());
                    myTurn = false;
                    
                }
            }, 
            (its) 
            );
          
        
    }
    
    
    
    
}
