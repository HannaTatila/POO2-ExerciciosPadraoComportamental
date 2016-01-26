/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import util.AbrirPortao;
import util.Carro;
import util.Command;
import util.ControleUniversal;
import util.DesligarCarro;
import util.FecharPortao;
import util.LigarCarro;
import util.Portao;

/**
 *
 * @author Hanna
 */
public class App {

    public static void main(String[] args) {
        // Criando um carro e os comandos ligar e desligar
        Carro carro = new Carro();
        Command ligarCarro = new LigarCarro(carro);
        Command desligarCarro =  new DesligarCarro(carro);
        
        // Criando um porão e os comandor ligar e desligar
        Portao portao = new Portao();
        Command abrirPortao = new AbrirPortao(portao);
        Command fecharPortao =  new FecharPortao(portao);
        
        //Controle do Carro
        ControleUniversal c = new ControleUniversal();
        c.setComandos(ligarCarro, desligarCarro);
        c.executarComando();
        c.desfazerComando();
        
        //Controle do Portao
        c.setComandos(abrirPortao, fecharPortao);
        c.executarComando();
        c.desfazerComando();
    }

}
