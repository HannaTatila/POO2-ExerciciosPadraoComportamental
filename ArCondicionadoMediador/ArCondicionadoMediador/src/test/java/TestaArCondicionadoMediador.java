/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import arcondicionadomediador.ArCondicionado;
import arcondicionadomediador.Mediador;
import arcondicionadomediador.SensorAmbiente;
import arcondicionadomediador.SensorPessoas;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dell
 */
public class TestaArCondicionadoMediador {
    private Mediador mediador;
    private ArCondicionado ar;
    private SensorPessoas sP;
    private SensorAmbiente sA;
    
    @Before
    public void setUp() {
        mediador = new Mediador();
        ar = new ArCondicionado(mediador);
        sP = new SensorPessoas(mediador);
        sA = new SensorAmbiente(mediador);
    }
    
    @Test
    public void testeSetDadosSensorPessoas(){
        sP.setDadosSensorPessoas("1", 3);
        assertEquals(3, sP.getQtdPessoas());
        assertEquals("1", sP.getTipo());
    }
    
    @Test
    public void testeSetDadosSensorAmbiente(){
        sA.setDadosSensorAmbiente("1", 40);
        assertEquals(40, sA.getTemperatura());
        assertEquals("1", sA.getTipo());
    }
    
    @Test
    public void testeCalculaMedia(){
        sP.setDadosSensorPessoas("1", 3);
        sP.setDadosSensorPessoas("2", 6);
        sP.setDadosSensorPessoas("3", 6);
        sP.setDadosSensorPessoas("1", 1);        
        List<Integer> lista = mediador.getL_SensoresPessoas();
        Integer temperaturaMedia = (int) mediador.calculaMedia(lista);
        System.out.println(temperaturaMedia);
        assertEquals(4, (int) temperaturaMedia);
    }
            
        
            
        
    /*
        SensorPessoas sp = new SensorPessoas(mediador);
        sp.setDadosSensorPessoas("1", 3);
        sp.setDadosSensorPessoas("2", 6);
        sp.setDadosSensorPessoas("3", 6);
        sp.setDadosSensorPessoas("1", 1); */

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
