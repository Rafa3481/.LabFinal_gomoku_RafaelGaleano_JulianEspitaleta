/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author Guacha
 */
public class dbclass {
    public String arch;
    public boolean SE;
    
    public dbclass(String archivo){
        arch = archivo;
        
    }
    
    public dbclass(String archivo, boolean sobre){
        arch = archivo;
        SE = sobre;
        
    }
    
    public void escrArch(String texto) throws IOException{
        FileWriter escritor = new FileWriter(arch, SE);
        PrintWriter escribir = new PrintWriter(escritor);
        
        escribir.printf("%s" + "%n", texto);
        escribir.close();
    }
    
}
