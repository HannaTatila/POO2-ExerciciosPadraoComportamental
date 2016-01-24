/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import util.FaixaA;
import util.FaixaB;
import util.FaixaC;
import util.FaixaD;
import util.FaixaE;
import util.PessoaFisica;

/**
 *
 * @author 20131BSI0491
 */
public class ImpostoEstrategia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica pessoa1  = new PessoaFisica(1000);
        System.out.println("Salario " + pessoa1.getSalario() + " possui " + pessoa1.calcularImposto() + " de imposto");
        
        PessoaFisica pessoa2  = new PessoaFisica(2500);
        System.out.println("Salario " + pessoa2.getSalario() + " possui " + pessoa2.calcularImposto() + " de imposto");
        
        PessoaFisica pessoa3  = new PessoaFisica(2739);
        System.out.println("Salario " + pessoa3.getSalario() + " possui " + pessoa3.calcularImposto() + " de imposto");
        
        PessoaFisica pessoa4  = new PessoaFisica(4002);
        System.out.println("Salario " + pessoa4.getSalario() + " possui " + pessoa4.calcularImposto() + " de imposto");
        
        PessoaFisica pessoa5  = new PessoaFisica(16000);
        System.out.println("Salario " + pessoa5.getSalario() + " possui " + pessoa5.calcularImposto() + " de imposto");
    }
    
}
