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
public class EstadoGomaVendida implements EstadoMaquina{
        private Maquina maquina;

    public EstadoGomaVendida(Maquina maquina){
        this.maquina = maquina;
    }

    @Override
    public void puxarAlavanca(){
        proximoEstado();
    }

    @Override
    public void inserirMoeda(int valorMoeda){
        System.out.println("Pegue a sua goma primeiro!");
    }

    
    public void proximoEstado() {
        if(maquina.getQtdGoma() > 0){
            System.out.println("Aqui está sua goma!");
            maquina.setQtdGoma(maquina.getQtdGoma()-1);
            maquina.setValorMoeda(0);
            maquina.setEstadoAtual(maquina.getSemMoeda());
        }else{
            System.out.println("Goma acabou");
            maquina.setEstadoAtual(maquina.getGomaAcabou());
        }
    }

    
    public String toString(){
        return "Goma Vendida";
    }
}
