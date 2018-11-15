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
    private boolean block1, block2;
    private int prefx, prefy, prefmov = -1;

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
        } else if (dif == 2){
            block1 =  false; block2 =  false;
            do{
                boolean block = false;
                
                System.out.println("Generando...");
                for (int i = 0; i < tabsz - 2; i++){
                    for (int j = 0; j < tabsz - 2; j++) {
                        
                        if (gamemec.tab[i][j] != 0 && gamemec.tab[i][j] != gamemec.getTurn()){
                            
                            if (gamemec.tab[i][j] == gamemec.tab[i][j+1] && gamemec.tab[i][j] == gamemec.tab[i][j+2]){
                                
                                
                                    
                                    
                                    if ((j-1) < 0 || gamemec.tab[i][j-1] != 0){
                                        block = true;
                                        casy = j + 3;
                                        casx = i;

                                    } else if (j + 3 >= tabsz || gamemec.tab[i][j+3] != 0){
                                        block = true;
                                        casy = j-1;
                                        casx = i;

                                    } else{
                                        if (Math.random() < 0.5){
                                            block = true;
                                            casy = j-1;
                                            casx = i;
                                        } else{
                                            block = true;
                                            casy = j+3;
                                            casx = i;
                                            if(!(gamemec.tab[casx][casy] != 0)){
                                                casy = j-1;
                                                casx = i;
                                            }
                                        }
                                    }
                                    
                                    if(gamemec.tab[i][j+3] != 0 && gamemec.tab[i][j-1] != 0){
                                        block = false;
                                    }
                                    
                            } else if (gamemec.tab[i][j] == gamemec.tab[i+1][j] && gamemec.tab[i][j] == gamemec.tab[i+2][j]){
                                
                                        if ((i-1) < 0 || gamemec.tab[i-1][j] != 0){
                                            block = true;
                                            casy = j;
                                            casx = i+3;
                                        } else if (i + 3 >= tabsz || gamemec.tab[i+3][j] != 0){
                                            block = true;
                                            casy = j;
                                            casx = i-1;
                                        } else{
                                            if (Math.random() < 0.5){
                                                block = true;
                                                casy = j;
                                                casx = i-1;
                                            } else{
                                                block = true;
                                                casy = j;
                                                casx = i+3;
                                            }
                                        }
                                        
                                        if(gamemec.tab[i-1][j] != 0 && gamemec.tab[i+3][j] != 0){
                                            block = false;
                                        }
                                        
                                        
                                    
                                    
                                
                            } else if (i >= 1 && j >= 1){
                                if (gamemec.tab[i][j] == gamemec.tab[i+1][j+1] && gamemec.tab[i][j] == gamemec.tab[i+2][j+2]){    
                                    
                                    if ((i-1) < 0 && (j-1) < 0){
                                        block = true;
                                        casy = j+3;
                                        casx = i+3;
                                    } else if (i + 3 >= tabsz && j + 3 >= tabsz){
                                        block = true;
                                        casy = j-1;
                                        casx = i-1;
                                    } else{
                                        if (Math.random() < 0.5){
                                            block = true;
                                            casy = j-1;
                                            casx = i-1;
                                        } else{
                                            block = true;
                                            casy = j+3;
                                            casx = i+3;
                                        }
                                    }
                                    
                                    if(gamemec.tab[casx][casy] != 0){
                                            block = false;
                                    }
                                    
                                } else if(gamemec.tab[i][j] == gamemec.tab[i+1][j-1] && gamemec.tab[i][j] == gamemec.tab[i+2][j-2]){
                                    
                                    if ((i-1) < 0 && (j+1) >= tabsz){
                                        block = true;
                                        casy = j-3;
                                        casx = i+3;
                                    } else if (i + 3 >= tabsz  && j - 3 < 0){
                                        block = true;
                                        casy = j+1;
                                        casx = i-1;
                                    } else{
                                        if (Math.random() < 0.5){
                                            block = true;
                                            casy = j+1;
                                            casx = i-1;
                                        } else{
                                            block = true;
                                            casy = j-3;
                                            casx = i+3;
                                        }
                                    }
                                    
                                    if(gamemec.tab[casx][casy] != 0){
                                            block = false;
                                    }
                                }
                            } 
                        }
                    }
                    
                }
                
                if (!block){
                    
                    for (int i = 0; i < tabsz; i++) {
                        for (int j = 0; j < tabsz; j++) {
                            if (gamemec.tab[j][i] == 0){
                                if (laMejor(chkAllMov(j,i))){
                                    prefmov = chkAllMov(j,i);
                                    prefx = j;
                                    prefy = i;

                                }
                            }
                                
                            
                        }
                    }
                    
                    
                    if (prefmov == 0){
                        int randx = (int) (Math.random()*((1-(-1)) + 1)) -1;
                        int randy = (int) (Math.random()*((1-(-1)) + 1)) -1;
                        casx = ((butt.getX()-18)/33) + randx;
                        casy = ((butt.getY()-18)/33) + randy;
                    } else{
                        if(gamemec.tab[prefx][prefy] != 0){
                                    int randx = (int) (Math.random()*((1-(-1)) + 1)) -1;
                                    int randy = (int) (Math.random()*((1-(-1)) + 1)) -1;
                                    casx = ((butt.getX()-18)/33) + randx;
                                    casy = ((butt.getY()-18)/33) + randy;
                        } else {
                            casx = prefx;
                            casy = prefy;
                        }
                        
                    }
                    
                }
                System.out.print("Coordenadas generadas: ");
                System.out.println(casx + ", " + casy);
                if(casx < 0 || casx >= tabsz || casy < 0 || casy >= tabsz){
                    System.out.println("Coordenadas Inválidas, Regenerando...");
                    System.out.println("");
                }
                
            }while(casx < 0 || casx > tabsz || casy < 0 || casy > tabsz);
        }

    }
    
    private boolean laMejor(int sol){
        
        return sol > prefmov;
    }
    
    private int chkAllMov(int x, int y){
        int selmov = 0;
        if (chkHorMov(x,y) > selmov){
            selmov = chkHorMov(x,y);
        } else if (chkVerMov(x,y) > selmov){
            selmov = chkVerMov(x,y);
        } else if (x >= 1 && y >= 1){
            if (chkDiag1Mov(x,y) > selmov){
                selmov = chkDiag1Mov(x,y);
            } else if (chkDiag2Mov(x,y) > selmov){
                selmov = chkDiag2Mov(x,y);
            } else if (chkDiag3Mov(x,y) > selmov){
                selmov = chkDiag3Mov(x,y);
            } else if (chkDiag3Mov(x,y) > selmov){
                selmov = chkDiag4Mov(x,y);
            }
            
        }
        if (selmov != 0)
            System.out.println(selmov);
        return selmov;
    }
    
    private int chkHorMov(int x, int y){
        if (gamemec.tab[x+1][y] != gamemec.getTurn()){
            return 0;
        } else{
            return 1 + chkHorMov(x+1, y);
        }
    }
    
    private int chkVerMov(int x, int y){
        if (gamemec.tab[x][y+1] != gamemec.getTurn()){
            return 0;
        } else{
            return 1 + chkVerMov(x, y+1);
        }
    }
    
    private int chkDiag1Mov(int x, int y){
        if (gamemec.tab[x+1][y+1] != gamemec.getTurn()){
            return 0;
        } else{
            return 1 + chkDiag1Mov(x+1, y+1);
        }
    }
    private int chkDiag2Mov(int x, int y){
        if (gamemec.tab[x-1][y+1] != gamemec.getTurn()){
            return 0;
        } else{
            return 1 + chkDiag2Mov(x-1, y+1);
        }
    }
    
    private int chkDiag3Mov(int x, int y){
        if (gamemec.tab[x-1][y-1] != gamemec.getTurn()){
            return 0;
        } else{
            return 1 + chkDiag3Mov(x-1, y-1);
        }
    }
    
    private int chkDiag4Mov(int x, int y){
        if (gamemec.tab[x+1][y-1] != gamemec.getTurn()){
            return 0;
        } else{
            return 1 + chkDiag4Mov(x+1, y-1);
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

    public void IATurn(JFrame frame) {
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
                mec.marcar(IAButton, turno);
                
                
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
