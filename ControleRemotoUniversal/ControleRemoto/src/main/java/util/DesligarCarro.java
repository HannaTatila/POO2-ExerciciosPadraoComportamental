/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Hanna
 */
public class DesligarCarro implements Command{
    Carro carro;
    
    public DesligarCarro(Carro carro){
        this.carro = carro;
    }
    
    @Override
    public void executar() {
        carro.desligarCarro();
    }
}
