/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcondicionadoobservador;

import java.util.Observable;

/**
 *
 * @author Hanna
 */
public class SensorPessoas extends Observable {

    private int qtd_pessoas;
    private String tipo;

    public int getQtd_pessoas() {
        return qtd_pessoas;
    }

    public void setQtd_pessoas(String tipo, int qtd_pessoas) {
        System.out.println("Adicionado " + qtd_pessoas + " pessoas pelo sensor " + tipo);
        this.qtd_pessoas = qtd_pessoas;
        this.tipo = tipo;
        setChanged();
        notifyObservers();
    }

    public String getTipo() {
        return tipo;
    }

}
