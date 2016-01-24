/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import arcondicionadoobservador.ArCondicionado;
import arcondicionadoobservador.SensorAmbiente;
import arcondicionadoobservador.SensorPessoas;
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
public class TestaArCondiocionadoObservador {
    
    private ArCondicionado temp;
    private SensorPessoas sP;
    private SensorAmbiente sA;
    
    @Before
    public void setUp() {
        temp = new ArCondicionado();
        sP = new SensorPessoas();
        sA = new SensorAmbiente();
    }
    
    @Test
    public void testeSetQtdPessoasSensorPessoas(){
        sP.addObserver(temp);
        sP.setQtd_pessoas("1", 3);
        assertEquals(3, sP.getQtd_pessoas());
        assertEquals("1", sP.getTipo());
    }
    
    @Test
    public void testeSetQtdPessoasSensorAmbiente(){
        sA.addObserver(temp);
        sA.setTemperatura("1", 27);
        assertEquals(27, sA.getTemperatura());
        assertEquals("1", sA.getTipo());
    }
    
    @Test
    public void testeCalculaMediaEAlteraTemperatura(){
        sP.addObserver(temp);
        sP.setQtd_pessoas("1", 3);
        sP.setQtd_pessoas("2", 6);
        sP.setQtd_pessoas("3", 6);
        sP.setQtd_pessoas("1", 1);
        List<Integer> lista = temp.getL_SensoresPessoas();
        Integer temperatura = (int) temp.calculaMedia(lista);
        System.out.println(temperatura);
        assertEquals(4, (int)temperatura);
        Assert.assertEquals("Aumentar Ar! Temperatura atual de 4.0", temp.alteraTemperatura(temperatura));
    }
            



    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
