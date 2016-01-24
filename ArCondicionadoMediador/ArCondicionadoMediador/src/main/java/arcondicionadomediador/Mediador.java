/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcondicionadomediador;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Hanna
 */
public class Mediador {

    public static final int TEMPERATURA_IDEAL = 25;
    private ArCondicionado arCondicionado;
    private SensorPessoas sensorPessoas;
    private SensorAmbiente sensorAmbiente;
    private List<Integer> l_sensoresPessoas;
    private List<Integer> l_sensoresAmbiente;

    public Mediador() {
        this.l_sensoresPessoas = new ArrayList<Integer>();
        this.l_sensoresAmbiente = new ArrayList<Integer>();
        l_sensoresPessoas.add(0);
        l_sensoresPessoas.add(0);
        l_sensoresPessoas.add(0);
        l_sensoresAmbiente.add(0);
        l_sensoresAmbiente.add(0);
        l_sensoresAmbiente.add(0);
    }

    public void registraSensorPessoas(SensorPessoas sensor) {
        this.sensorPessoas = sensor;
    }

    public void registraSensorAmbiente(SensorAmbiente sensor) {
        this.sensorAmbiente = sensor;
    }

    public void registraArCondicionado(ArCondicionado ar) {
        this.arCondicionado = ar;
    }

    public void adicionaQtdPessoas() {
        l_sensoresPessoas.set(Integer.parseInt(sensorPessoas.getTipo()) - 1, sensorPessoas.getQtdPessoas());
    }

    public void adicionaTemperaturaAmbiente() {
        l_sensoresAmbiente.set(Integer.parseInt(sensorAmbiente.getTipo()) - 1, sensorAmbiente.getTemperatura());
    }

    public void ajustarTemperatura(Observable obs) {
        if (obs instanceof SensorPessoas) {
            adicionaQtdPessoas();
        } else {
            if (obs instanceof SensorAmbiente) {
                adicionaTemperaturaAmbiente();
            }
        }

        double temperaturaAtual = calculaMedia(l_sensoresPessoas) + calculaMedia(l_sensoresAmbiente);
        alteraTemperatura(temperaturaAtual);
    }

    public double calculaMedia(List<Integer> lista) {
        double valor = 0;
        for (Integer elemento : lista) {
            valor += elemento;
        }
        return valor / lista.size();
    }

    public void alteraTemperatura(double temperaturaAtual) {
        if (temperaturaAtual < TEMPERATURA_IDEAL) {
            arCondicionado.aumentarTemperatura();
        } else {
            if (temperaturaAtual > TEMPERATURA_IDEAL) {
                arCondicionado.diminuirTemperatura();
            } else {
                arCondicionado.manterTemperatura();
            }
        }
    }

    public List<Integer> getL_SensoresPessoas(){
        return l_sensoresPessoas;
    }
}
