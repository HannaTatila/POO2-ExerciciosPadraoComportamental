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
public class FaixaB implements Imposto{

    @Override
    public double calcularImposto(double salario) {
        return salario * 0.075;
    }
    
    @Override
    public String toString(){
        return "FaixaB";
    }
    
}
