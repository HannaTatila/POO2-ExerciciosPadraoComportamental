/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.Maquina;

/**
 *
 * @author dell
 */
public class TesteMaquinaGomaMascar {
    
    public TesteMaquinaGomaMascar() {
    }
    
    @Test
    public void testaQtdGoma(){
        Maquina maquina = new Maquina(10);
        Assert.assertEquals(10, maquina.getQtdGoma());
    }

    @Test
    public void testaValorMoeda(){
        Maquina maquina = new Maquina(10);
        maquina.inserirMoeda(1);
        Assert.assertEquals(1, maquina.getValorMoeda());
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
