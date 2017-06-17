/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author Matheus
 */
public class Cadastro {
   

   public void cadastro() throws FileNotFoundException, IOException{
    OutputStream arq = new FileOutputStream("Dados.txt");
    OutputStreamWriter osw = new OutputStreamWriter(arq);
    BufferedWriter bw = new BufferedWriter(osw);
    PrintWriter out = new PrintWriter(bw);
    
    
    out.print("ok");
    out.flush();
    
    bw.close();
    
    
   }
    
    
}
