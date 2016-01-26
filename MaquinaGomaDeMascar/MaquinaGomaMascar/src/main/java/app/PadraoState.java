/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import java.util.Scanner;
import util.Maquina;

/**
 *
 * @author 20131BSI0491
 */
public class PadraoState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maquina maquina1 = new Maquina(2);
        System.out.println("Inserindo moeda...");
        maquina1.inserirMoeda(0);
        System.out.println("Puxando a alavanca...");
        maquina1.puxarAlavanca();
        
        
        System.out.println(maquina1.getEstadoAtual());
    }
    
}
