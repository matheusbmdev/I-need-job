/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interfaces.Usuario;

/**
 *
 * @author Matheus
 */
public class Chefe extends Usuario{
    float NotaComoChefe;
    
    public Chefe(String NomeCompleto, String CPF, String Email, String Telefone,String DataNasc,String Senha,float NotaComoChefe){
        super(NomeCompleto,CPF,Email,Telefone,DataNasc, Senha);
        this.NotaComoChefe = NotaComoChefe;
        
    }
    void setNotaComoChefe(float NotaComoChefe){
        this.NotaComoChefe = NotaComoChefe;
    }
    
    float getNotaComoChefe(){
        return this.NotaComoChefe;
    }
   
}