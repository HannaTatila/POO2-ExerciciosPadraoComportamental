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
import util.FaixaA;
import util.FaixaB;
import util.FaixaC;
import util.FaixaD;
import util.FaixaE;
import util.PessoaFisica;

/**
 *
 * @author dell
 */
public class TestaImpostoRenda {
    public PessoaFisica pessoa;
    
    @Test
    public void testeValorSalario(){
        PessoaFisica pessoa1  = new PessoaFisica(1000);
        Assert.assertEquals(1000, (int) pessoa1.getSalario());
    }
    
    @Test
    public void testeCalcularFaixaA(){
        pessoa = new PessoaFisica(1000);       
        Integer imposto = (int) pessoa.calcularImposto();
        Integer salariodescontado = (int) (0.0 * pessoa.getSalario());
        Assert.assertEquals(salariodescontado, imposto);
    }
    
    @Test
    public void testeCalcularFaixaB(){
        pessoa = new PessoaFisica(2500);       
        Integer imposto = (int) pessoa.calcularImposto();
        Integer salariodescontado = (int) (0.075 * pessoa.getSalario());
        Assert.assertEquals(salariodescontado, imposto);
    }
    
    @Test
    public void testeCalcularFaixaC(){
        pessoa = new PessoaFisica(2739);       
        Integer imposto = (int) pessoa.calcularImposto();
        Integer salariodescontado = (int) (0.15 * pessoa.getSalario());
        Assert.assertEquals(salariodescontado, imposto);
    }
    
    @Test
    public void testeCalcularFaixaD(){
        pessoa = new PessoaFisica(4001);       
        Integer imposto = (int) pessoa.calcularImposto();
        Integer salariodescontado = (int) (0.225 * pessoa.getSalario());
        Assert.assertEquals(salariodescontado, imposto);
    }
    
    @Test
    public void testeCalcularFaixaE(){
        pessoa = new PessoaFisica(16000);       
        Integer imposto = (int) pessoa.calcularImposto();
        Integer salariodescontado = (int) (0.275 * pessoa.getSalario());
        Assert.assertEquals(salariodescontado, imposto);
    }
    
    @Test
    public void testeConfereFaixaA(){
        pessoa = new PessoaFisica(1000);       
        Assert.assertSame(FaixaA.class, pessoa.getImposto().getClass());
        Assert.assertEquals("FaixaA", pessoa.getImposto().toString());
    }
    
    @Test
    public void testeConfereFaixaB(){
        pessoa = new PessoaFisica(2000);       
        Assert.assertSame(FaixaB.class, pessoa.getImposto().getClass());
        Assert.assertEquals("FaixaB", pessoa.getImposto().toString());
    }
    
    @Test
    public void testeConfereFaixaC(){
        pessoa = new PessoaFisica(3000);       
        Assert.assertSame(FaixaC.class, pessoa.getImposto().getClass());
        Assert.assertEquals("FaixaC", pessoa.getImposto().toString());
    }
    
    @Test
    public void testeConfereFaixaD(){
        pessoa = new PessoaFisica(4000);       
        Assert.assertSame(FaixaD.class, pessoa.getImposto().getClass());
        Assert.assertEquals("FaixaD", pessoa.getImposto().toString());
    }
    
    @Test
    public void testeConfereFaixaE(){
        pessoa = new PessoaFisica(15000);       
        Assert.assertSame(FaixaE.class, pessoa.getImposto().getClass());
        Assert.assertEquals("FaixaE", pessoa.getImposto().toString());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
