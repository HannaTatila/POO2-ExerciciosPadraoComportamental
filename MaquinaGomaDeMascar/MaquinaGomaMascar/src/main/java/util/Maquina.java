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
public class Maquina {
    private EstadoMaquina semMoeda;
    private EstadoMaquina comMoeda;
    private EstadoMaquina gomaVendida;
    private EstadoMaquina gomaAcabou;
    private EstadoMaquina estadoAtual;
    private int qtdGoma;
    private int valorMoeda;

    public Maquina(int qtdGoma) {
        this.qtdGoma = qtdGoma;
        this.semMoeda = new EstadoSemMoeda(this);
        this.comMoeda = new EstadoRecebeuMoeda(this);
        this.gomaVendida = new EstadoGomaVendida(this);
        this.gomaAcabou = new EstadoGomaAcabou(this);
        setEstadoAtual(semMoeda);
    }
    
    public int getValorMoeda() {
        return valorMoeda;
    }

    public void setValorMoeda(int valorMoeda) {
        this.valorMoeda = valorMoeda;
    }
    
    public EstadoMaquina getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoMaquina estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
  
    public void inserirMoeda(int valor){
        estadoAtual.inserirMoeda(valor);
    }
    
    public void puxarAlavanca(){
        estadoAtual.puxarAlavanca();
    }

    public EstadoMaquina getSemMoeda() {
        return semMoeda;
    }

    public void setSemMoeda(EstadoMaquina semMoeda) {
        this.semMoeda = semMoeda;
    }

      
    public EstadoMaquina getComMoeda() {
        return comMoeda;
    }

    public void setComMoeda(EstadoMaquina comMoeda) {
        this.comMoeda = comMoeda;
    }

    public EstadoMaquina getGomaVendida() {
        return gomaVendida;
    }

    public void setGomaVendida(EstadoMaquina gomaVendida) {
        this.gomaVendida = gomaVendida;
    }

    public EstadoMaquina getGomaAcabou() {
        return gomaAcabou;
    }

    public void setGomaAcabou(EstadoMaquina gomaAcabou) {
        this.gomaAcabou = gomaAcabou;
    }

    public int getQtdGoma() {
        return qtdGoma;
    }

    public void setQtdGoma(int qtdGoma) {
        this.qtdGoma = qtdGoma;
    }
}
