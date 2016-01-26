/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Hanna
 */
public class Carro {
    String mensagem;
    
    public Carro(){
        this.mensagem = "";
    }

    public void ligarCarro() {
        mensagem = "Carro ligado";
        System.out.println("Carro ligado");
    }

    public void desligarCarro() {
        mensagem = "Carro desligado";
        System.out.println("Carro desligado");
    }
    
    public String getMensagem(){
        return mensagem;
    }
    
    
}
