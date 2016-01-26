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
public class Portao {
    String mensagem;
    
    public Portao(){
        this.mensagem = "";
    }

    public void abrirPortao() {
        System.out.println("Abrir portao");
        mensagem = "Portão aberto";
    }

    public void fecharPortao() {
        System.out.println("Fechar portao");
        mensagem = "Portão fechado";
    }
    
    public String getMensagem(){
        return mensagem;
    }
    
    
}
