/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class Notas {
    
    public void AvaliarNotas(String Login, String Senha){
         File Dados = new File("Dados.txt");
         
        try( FileWriter fw = new FileWriter(Dados, true) ){
               
        try( FileReader fr = new FileReader(Dados) ){
                BufferedReader br = new BufferedReader(fr);
                     for(int i = 0;i < 8 ;i++){
                       if(br.readLine().equals(Login)){
                           if(br.readLine().equals(Senha)){
                               
                                      System.out.println("Entrou");
                               
                             }                           
                       }
                     }
                          
                            }
                        }
                        
                        
                    catch(IOException ex){
                 ex.printStackTrace();
                }
               
               
                    
    }
}

