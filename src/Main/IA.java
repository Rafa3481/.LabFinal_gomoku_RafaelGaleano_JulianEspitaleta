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
        
        
    }

    private void selcas(int dif, JButton butt) {
        if (dif == 0 || butt == null) {
            System.out.println("Generando...");
            casx = (int) (Math.random() * tabsz);
            casy = (int) (Math.random() * tabsz);
            System.out.print("Coordenadas generadas: ");
            System.out.println(casx + ", " + casy);
        } else if (dif == 1){
            do{
                System.out.println("Generando...");
                int randx = (int) (Math.random()*((1-(-1)) + 1)) -1;
                int randy = (int) (Math.random()*((1-(-1)) + 1)) -1;
                casx = ((butt.getX()-18)/33) + randx;
                
                casy = ((butt.getY()-18)/33) + randy;
                System.out.print("Coordenadas generadas: ");
                System.out.println(casx + ", " + casy);
                if(casx < 0 || casx >= tabsz || casy < 0 || casy >= tabsz){
                    System.out.println("Coordenadas Inválidas, Regenerando...");
                    System.out.println("");
                }
                
            }while(casx < 0 || casx >= tabsz || casy < 0 || casy >= tabsz);
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
            System.out.println("Ya hay una ficha en esas coordenadas, Reintentando...");
            System.out.println("");
            
            return true;
        } else {
            System.out.println("Colocable, Coordenadas Válidas");
            
        }
        return false;
    }

    public void IATurn(JFrame frame, JLabel lab1, JLabel lab2) {
        gamemec mec = new gamemec();
        myTurn = true;
        int its = (int) (Math.random() * 2 + 1) * 1000;
        
        
        
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
                System.out.println("Colocando Ficha...");
                mec.marcar(IAButton, turno, lab1, lab2);
                
                
                myTurn = false;
                
                System.out.println("Turno dejado");
                System.out.println("");
                System.out.println("-----------------------------------------");
                System.out.println("");

            }
        },
                (its)
        );

    }

}
