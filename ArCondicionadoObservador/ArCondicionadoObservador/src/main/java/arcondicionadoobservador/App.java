/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcondicionadoobservador;

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
        ArCondicionado temp = new ArCondicionado();
        
        SensorPessoas s = new SensorPessoas();
        s.addObserver(temp);
        s.setQtd_pessoas("1", 3);
        s.setQtd_pessoas("2", 6);
        s.setQtd_pessoas("3", 6);
        s.setQtd_pessoas("1", 1);
        
        SensorAmbiente s2 = new SensorAmbiente();
        s2.addObserver(temp);
        s2.setTemperatura("1", 27);
        s2.setTemperatura("2", 26);
        s2.setTemperatura("2", 27);
        
    }
    
}
