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

    public IA(int tamtab, int diff, JButton prevButt) {
        tabsz = tamtab;
        brain = diff;
        prev = prevButt;
        selcas(brain, prev);
        
    }

    private void selcas(int dif, JButton butt) {
        if (dif == 0 || butt == null) {
            casx = (int) (Math.random() * tabsz);
            casy = (int) (Math.random() * tabsz);
        } else if (dif == 1){
            do{
                System.out.println("Generando...");
                int randx = (int) (Math.random()*((1-(-1)) + 1)) -1;
                int randy = (int) (Math.random()*((1-(-1)) + 1)) -1;
                casx = ((butt.getX()-18)/33) + randx;
                
                casy = ((butt.getY()-18)/33) + randy;
                System.out.println();
            }while(!(casx >= 0 && casx <= 13)&&!(casy >= 0 && casy <= 13));
        }

    }

    public int getX() {
        return casx;
    }

    public int getY() {
        return casy;
    }

    public boolean chkplay(int x, int y) {
        gamemec mec = new gamemec();
        if (mec.tab[x][y] != 0) {
            System.out.println("Reintentando");
            
            return true;
        } else {
            System.out.println("Colocable");
        }
        return false;
    }

    public void IATurn(JFrame frame, JLabel lab1, JLabel lab2) {
        gamemec mec = new gamemec();
        myTurn = true;
        int its = (int) (Math.random() * 3 + 1) * 1000;
        
        
        
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                int turn;
            @Override
            public void run() {
                
                    
                myTurn = true;
                
                int turno = mec.getTurn();
                JButton IAButton;
                do{
                    selcas(brain, prev);
                    int Y = getY() * 33 + 20, X = getX() * 33 + 18;
                    IAButton = (JButton) frame.getContentPane().getComponentAt(X, Y);
                } while(chkplay(getX(), getY()));
                mec.marcar(IAButton, turno, lab1, lab2);
                System.out.println(getX() + ", " + getY());
                
                myTurn = false;

            }
        },
                (its)
        );

    }

}
