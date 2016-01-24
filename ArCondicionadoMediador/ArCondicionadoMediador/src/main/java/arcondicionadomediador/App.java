/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcondicionadomediador;

import java.util.Observer;

/**
 *
 * @author Hanna
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mediador mediador = new Mediador();
        ArCondicionado ar = new ArCondicionado(mediador);

        SensorPessoas sp = new SensorPessoas(mediador);
        sp.setDadosSensorPessoas("1", 3);
        sp.setDadosSensorPessoas("2", 6);
        sp.setDadosSensorPessoas("3", 6);
        sp.setDadosSensorPessoas("1", 1);

        SensorAmbiente sa = new SensorAmbiente(mediador);
        sa.setDadosSensorAmbiente("1", 40);
        sa.setDadosSensorAmbiente("2", 46);
        sa.setDadosSensorAmbiente("2", 45);

    }

}
