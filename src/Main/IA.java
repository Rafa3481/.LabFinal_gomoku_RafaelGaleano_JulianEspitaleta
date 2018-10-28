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
public class IA {
    private int tabsz;
    private int brain;
    private int casx;
    private int casy;
    
    public IA(int tamtab, int diff){
        tabsz = tamtab;
        brain = diff;
        selcas(brain);
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
    
    
}
