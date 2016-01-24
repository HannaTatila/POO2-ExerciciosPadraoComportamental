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
public class MP3 extends FormatoVideo{
    @Override
    public void carregar() {
        System.out.println("Carregados arquivo e legenda do video MP3");
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzido o video MP3");
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizado o video MP3\n");
    }
    
}
