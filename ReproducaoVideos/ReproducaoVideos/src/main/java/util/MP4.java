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
public class MP4 extends FormatoVideo{
    @Override
    public void carregar() {
        System.out.println("Carregados arquivo e legenda do video MP4");
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzido o video MP4");
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizado o video MP4\n");
    }
    
}
