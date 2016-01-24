/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcondicionadomediador;

import java.util.Observable;

/**
 *
 * @author Hanna
 */
public class SensorPessoas extends Observable {

    private int qtdPessoas;
    private String tipo;
    private final Mediador mediador;
    
    
    public SensorPessoas(Mediador mediador) {
        qtdPessoas = 0;
        this.mediador = mediador;
        mediador.registraSensorPessoas(this);
    }

    public void setQtdPessoas(int pessoas) {
        this.qtdPessoas = pessoas;
        mediador.ajustarTemperatura(this);
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setDadosSensorPessoas(String tipo, int qtd){
        setTipo(tipo);
        setQtdPessoas(qtd);
    }

}
