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
public class SensorAmbiente extends Observable {

    private int temperatura;
    private String tipo;
    private final Mediador mediador;

    public SensorAmbiente(Mediador mediador) {
        temperatura = 0;
        this.mediador = mediador;
        mediador.registraSensorAmbiente(this);
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        mediador.ajustarTemperatura(this);
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDadosSensorAmbiente(String tipo, int temperatura) {
        setTipo(tipo);
        setTemperatura(temperatura);
    }

}
