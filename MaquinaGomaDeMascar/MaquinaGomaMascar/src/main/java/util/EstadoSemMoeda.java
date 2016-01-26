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
public class EstadoSemMoeda implements EstadoMaquina{
    private Maquina maquina;

    public EstadoSemMoeda(Maquina maquina){
        this.maquina = maquina;
    }

    @Override
    public void puxarAlavanca() {
        System.out.println("Antes de puxar a alavanca, insira uma moeda para comprar uma goma de mascar.");
    }

    @Override
    public void inserirMoeda(int valorMoeda) {
        this.maquina.setValorMoeda(valorMoeda);
        proximoEstado();
    }
    
    public void proximoEstado() {
        maquina.setEstadoAtual(maquina.getComMoeda());
        System.out.println("No estado sem moeda, foi inserida uma moeda");
    }
    
    public String toString() {
        return "Sem moeda";
    }
}
