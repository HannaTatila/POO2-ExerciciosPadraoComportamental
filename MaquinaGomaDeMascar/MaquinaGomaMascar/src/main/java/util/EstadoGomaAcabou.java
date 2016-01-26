/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author 20131BSI0491
 */
public class EstadoGomaAcabou implements EstadoMaquina{
    private Maquina maquina;
    
    public EstadoGomaAcabou(Maquina maquina){
        this.maquina = maquina;
    }    
    
    @Override
    public void puxarAlavanca() {
        System.out.println("Acabaram as gomas!");
    }

    @Override
    public void inserirMoeda(int valorMoeda) {
        System.out.println("Acabaram as gomas!");
        ejetarMoeda();
    }

    public void ejetarMoeda() {
        System.out.println("Aqui está sua moeda de volta.");
    }
    
    public String toString() {
        return "Sem goma.";
    } 
}
