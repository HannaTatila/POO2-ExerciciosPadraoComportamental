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
public class SensorAmbiente extends Observable {

    private int temperatura;
    private String tipo;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String tipo, int temperatura) {
        System.out.println("Capturada temperatura ambiente de " + temperatura + " graus pelo sensor " + tipo);
        this.temperatura = temperatura;
        this.tipo = tipo;
        setChanged();
        notifyObservers();
    }

    public String getTipo() {
        return tipo;
    }

}
