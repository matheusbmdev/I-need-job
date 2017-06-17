/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Matheus
 */
public abstract class Usuario {
     String NomeCompleto;
     String CPF;
     String Email;
     String Telefone;
     String DataNasc;
     String Senha;
     
     Empregado emp = new Empregado ();
     
     public Usuario(){
         
     }
     
     public Usuario(String NomeCompleto, String CPF, String Email, String Telefone,String DataNasc,String Senha){
         this.NomeCompleto = NomeCompleto;
         this.CPF = CPF;
         this.Email = Email;
         this.Telefone = Telefone;
         this.DataNasc = DataNasc;
         this.Senha = Senha;
     }
     
     void setNome(String NomeCompleto){
         this.NomeCompleto = NomeCompleto;
     }
     void setCPF(String CPF){
         this.CPF = CPF;
     }
     void setEmail(String Email){
         this.Email = Email;
     }
     void setTelefone(String Telefone){
         this.Telefone = Telefone;
     }
     void setDataNasc(String DataNasc){
         this.DataNasc = DataNasc;
     }
     void setSenha(String Senha){
         this.Senha = Senha;
     }
     
     String getNome(){
         return this.NomeCompleto;
     }
     String getCPF(){
         return this.CPF;
     }
     String getEmail(){
         return this.Email;
     }
     String getTelefone(){
         return this.Telefone;
     }
     String getDataNasc(){
         return this.DataNasc;
     }
     String getSenha(){
         return this.Senha;
     }
     
    
    
     /*public void addDados(String NomeCompleto, String CPF, String Email, String Telefone,String DataNasc,String Senha) throws IOException{
       File dados = new File("C:\\Users\\Matheus\\Documents\\NetBeansProjects", "Dados.txt");
         
       BufferedWriter writer = new BufferedWriter(new FileWriter(dados));
       try{
        FileWriter fw = new FileWriter(dados);
        
        System.out.println(" "+this.NomeCompleto);
        fw.write(this.NomeCompleto);
      
        fw.write(this.CPF);
      
        fw.write(this.Email);
      
        fw.write(this.Telefone);
       
        fw.write(this.DataNasc);
        
        fw.write(this.Senha);
       
        fw.flush();
        fw.close();
       }catch(Exception e){}
     }*/
}
