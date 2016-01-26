/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author deHannall
 */
public class LigarCarro implements Command{
    Carro carro;
    
    public LigarCarro(Carro carro){
        this.carro = carro;
    }
    
    @Override
    public void executar() {
        carro.ligarCarro();
    }
    
}
