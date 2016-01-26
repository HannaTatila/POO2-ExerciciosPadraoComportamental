/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author dell
 */
public class ControleUniversal {
    private Command comandoLigar, comandoDesligar;
    
    public void setComandos(Command comandoLigar, Command camandoDesligar){
        this.comandoLigar = comandoLigar;
        this.comandoDesligar = camandoDesligar;
    }
    
    public void executarComando (){
        System.out.println("Executar comando");
        
        comandoLigar.executar();
    }
    
    public void desfazerComando (){
        System.out.println("Desfazer comando");
        comandoDesligar.executar();
    }
}
