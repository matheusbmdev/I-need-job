/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interfaces.Usuario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Matheus
 */
public class Empregado extends Usuario{
    float NotaTrabalho;
    String AreaTrabalho;
    
    
    public Empregado(){ 
        
    }
    
    public Empregado(String NomeCompleto, String CPF, String Email, String Telefone,String DataNasc,String Senha){
        super(NomeCompleto,CPF,Email,Telefone,DataNasc, Senha);
       
    }
    public Empregado(String NomeCompleto, String CPF, String Email, String Telefone,String DataNasc,String Senha,float NotaTrabalho,String AreaTrabalho){
        super(NomeCompleto,CPF,Email,Telefone,DataNasc, Senha);
        this.NotaTrabalho = NotaTrabalho;
        this.AreaTrabalho = AreaTrabalho;
    }
       
    void setNotaTrabalho(float NotaTrabalho){
        this.NotaTrabalho = NotaTrabalho;
    }
    void setAreaTrabalho(String AreaTrabalho){
        this.AreaTrabalho = AreaTrabalho;
    }
    float getNotaTrabalho(){
        return this.NotaTrabalho;
    }
    String getAreaTrabalho(){
        return this.AreaTrabalho;
    }
    public void imprimir( ){
           System.out.println("Aqui!");
       }
       
  public void addDados(String NomeCompleto) throws IOException{
      
      Cadastro cad = new Cadastro();
      
    
      
     }
}
