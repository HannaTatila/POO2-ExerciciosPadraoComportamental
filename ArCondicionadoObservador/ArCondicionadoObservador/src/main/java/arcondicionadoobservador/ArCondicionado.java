/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcondicionadoobservador;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Hanna
 */
public class ArCondicionado implements Observer {

    public static final int TEMPERATURA_IDEAL = 25;
    private List<Integer> l_sensoresPessoas;
    private List<Integer> l_sensoresAmbiente;

    public ArCondicionado() {
        l_sensoresPessoas = new ArrayList<Integer>();
        l_sensoresAmbiente = new ArrayList<Integer>();
        l_sensoresPessoas.add(0);
        l_sensoresPessoas.add(0);
        l_sensoresPessoas.add(0);
        l_sensoresAmbiente.add(0);
        l_sensoresAmbiente.add(0);
        l_sensoresAmbiente.add(0);
    }

    public double calculaMedia(List<Integer> lista) {
        double valor = 0;
        for (Integer elemento : lista) {
            valor += elemento;
        }
        return valor / lista.size();
    }

    @Override
    public void update(Observable obs, Object obj) {
        if(obs instanceof SensorPessoas){
            SensorPessoas sensorPessoas = (SensorPessoas) obs;
            l_sensoresPessoas.set(Integer.parseInt(sensorPessoas.getTipo()) - 1, sensorPessoas.getQtd_pessoas());       
        } else{
            if(obs instanceof SensorAmbiente){
                SensorAmbiente sensorAmbiente = (SensorAmbiente) obs;
                l_sensoresAmbiente.set(Integer.parseInt(sensorAmbiente.getTipo()) - 1, sensorAmbiente.getTemperatura());
            }
        }
        
        double temperaturaAtual = calculaMedia(l_sensoresPessoas) + calculaMedia(l_sensoresAmbiente);
        alteraTemperatura(temperaturaAtual);
    
    }
    
    //esse retorno foi criado apenas para ajudar nos testes
    public String alteraTemperatura(double temperaturaAtual){
        if (temperaturaAtual < TEMPERATURA_IDEAL) {
            String mensagem = "Aumentar Ar! Temperatura atual de " + temperaturaAtual ;
            System.out.println(mensagem);
            return mensagem;
        }else{
            if (temperaturaAtual > TEMPERATURA_IDEAL) {
                String mensagem = "Diminuir Ar! Temperatura atual de " + temperaturaAtual ;
                System.out.println(mensagem);
                return mensagem;
            }else {
                String mensagem = "Manter temperatura do ar! Temperatura atual de " + temperaturaAtual;
                System.out.println(mensagem);
                return mensagem;
            }
        }
    }
    
    public List<Integer> getL_SensoresPessoas(){
        return l_sensoresPessoas;
    }
    

}
