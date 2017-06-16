/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Interfaces.Usuario;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Matheus
 */
public class INeedJob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        //==============DEFININDO ONDE FICARÁ O ARQUIVO!==================//
        File dados = new File("C:\\Users\\Matheus\\Documents\\NetBeansProjects", "Dados.txt");
        dados.createNewFile();
        dados.mkdir();
        
        Usuario[] usu = new Usuario[1];
        
        usu[0].addDados("112", "112", "112", "112", "112", "112");
        
 
      
    }
    
}
