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
public class AbrirPortao implements Command{
    Portao portao;
    
    public AbrirPortao(Portao portao){
        this.portao = portao;
    }
    
    @Override
    public void executar() {
        portao.abrirPortao();
    }
    
}
