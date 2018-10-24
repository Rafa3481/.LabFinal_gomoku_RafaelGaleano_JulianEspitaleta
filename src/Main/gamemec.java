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
public class gamemec {
    
    private int turn;
    
    private int noire;
    private int blanche;
    public String p1;
    public String p2;
    
    public gamemec(boolean IA, String usr1, String usr2){
        p1 = usr1;
        if (!IA){
            p2 = usr2;
        }
    }
    
    public void assturn(){
        double rand = Math.random();
        if (rand < 0.5){
            noire = 1;
            blanche = 2;
        }
    }
    
    public int getnoir(){
        return noire;
    }
    public int getTurn(){
        return turn;
    }
    public void mecturn(int turn){
        if (turn == 1){
            turn = 2;
        } else{
            turn = 1;
        }
        
    }
    
}
