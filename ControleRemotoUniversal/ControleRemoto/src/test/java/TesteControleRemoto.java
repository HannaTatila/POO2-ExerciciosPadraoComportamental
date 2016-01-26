/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.AbrirPortao;
import util.Carro;
import util.Command;
import util.ControleUniversal;
import util.DesligarCarro;
import util.FecharPortao;
import util.LigarCarro;
import util.Portao;

/**
 *
 * @author dell
 */
public class TesteControleRemoto {
    
    private Carro carro;
    private Command ligarCarro;
    private Command desligarCarro;
    private Portao portao;
    private Command abrirPortao;
    private Command fecharPortao;
    
    public TesteControleRemoto() {
    }
    
    @Before
    public void setUp() {
        carro = new Carro();
        ligarCarro = new LigarCarro(carro);
        desligarCarro = new DesligarCarro(carro);
        portao = new Portao();
        abrirPortao = new AbrirPortao(portao);
        fecharPortao = new FecharPortao(portao);
    }
     
    @Test
    public void testaComandoCarroLigado(){    
        ControleUniversal c = new ControleUniversal();
        c.setComandos(ligarCarro, desligarCarro);
        c.executarComando();
        assertEquals("Carro ligado", carro.getMensagem());          
    }
    
    @Test
    public void testaComandoCarroDesligado(){    
        ControleUniversal c = new ControleUniversal();
        c.setComandos(ligarCarro, desligarCarro);
        c.desfazerComando();
        assertEquals("Carro desligado", carro.getMensagem());        
    }
    
    @Test
    public void testaComandoAbrirPortao(){    
        ControleUniversal c = new ControleUniversal();
        c.setComandos(abrirPortao, fecharPortao);
        c.executarComando();
        assertEquals("Portão aberto", portao.getMensagem());          
    }
    
    @Test
    public void testaComandoPortaoFechado(){    
        ControleUniversal c = new ControleUniversal();
        c.setComandos(abrirPortao, fecharPortao);
        c.desfazerComando();
        assertEquals("Portão fechado", portao.getMensagem());        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
