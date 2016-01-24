package util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20131BSI0491
 */
public class PessoaFisica {
    private double salario;
    private Imposto imposto;

    public PessoaFisica(double salario){
        this.salario = salario;
        if (salario < 1710.78) {
            imposto = new FaixaA();
        } else if (salario < 2563.91) {
            imposto = new FaixaB();
        } else if (salario < 3418.59) {
            imposto = new FaixaC();
        } else if (salario < 4271.59) {
            imposto = new FaixaD();
        } else {
            imposto = new FaixaE();
        }
    }

    public PessoaFisica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getSalario() {
        return salario;
    }

    public Imposto getImposto() {
        return imposto;
    }
    
    public double calcularImposto(){
        return this.imposto.calcularImposto(salario);
    }
    
}
