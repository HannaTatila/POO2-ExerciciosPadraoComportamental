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
public class EstadoRecebeuMoeda implements EstadoMaquina{
    private Maquina maquina;

    public EstadoRecebeuMoeda(Maquina maquina){
        this.maquina = maquina;
    }

    @Override
    public void puxarAlavanca() {
        if (maquina.getValorMoeda() == 1){
            proximoEstado();
        }else{
            ejetarMoeda();
        }
    }

    @Override
    public void inserirMoeda(int valorMoeda) {
        System.out.println("Só é permitido uma moeda por vez. Espere!");
    }
    
    public void ejetarMoeda() {
        System.out.println("A máquina aceita apenas moedas de 1 real!");
        maquina.setValorMoeda(0);
        maquina.setEstadoAtual(maquina.getSemMoeda());
    }
    
    public void proximoEstado() {
        maquina.setEstadoAtual(maquina.getGomaVendida());
        maquina.getEstadoAtual().puxarAlavanca();
    }
    
    public String toString(){
        return "Com moeda.";
    }
}
