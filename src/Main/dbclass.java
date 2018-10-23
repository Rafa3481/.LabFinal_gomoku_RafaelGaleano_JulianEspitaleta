/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
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
    
    int lineas() throws IOException{
        FileReader leer = new FileReader(arch);
        BufferedReader linea = new BufferedReader(leer);
        int res = 0;
        while(linea.readLine() != null){
            res++;
        }
        linea.close();
        return res;        
    }
    
    public String[] leerArch() throws IOException{
        FileReader leer = new FileReader(arch);
        BufferedReader lire = new BufferedReader(leer);
        
        
        String nullcito[] = new String[lineas()];
        
        for (int i = 0; i < lineas(); i++){
            nullcito[i] = lire.readLine();
        }
        lire.close();
        return nullcito;        
    }
    
    public boolean compArch(String usr) throws IOException{
        FileReader leer = new FileReader(arch);
        BufferedReader lire = new BufferedReader(leer);
        
        
        String nullcito[] = new String[lineas()];
        
        for (int i = 0; i < lineas(); i++){
            nullcito[i] = lire.readLine();
            if (nullcito[i].equalsIgnoreCase(usr)){
                return true;
            }
        }
        lire.close();
        return false;
    }
}
