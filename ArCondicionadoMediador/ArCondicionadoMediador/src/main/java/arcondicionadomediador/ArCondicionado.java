/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcondicionadomediador;


/**
 *
 * @author Hanna
 */
public class ArCondicionado {

    private final Mediador mediador;

    public ArCondicionado(Mediador mediador) {
        this.mediador = mediador;
        mediador.registraArCondicionado(this);
    }

    public void aumentarTemperatura() {
        System.out.println("Aumentar temperatura");
    }

    public void diminuirTemperatura() {
        System.out.println("Diminuir temperatura");
    }

    public void manterTemperatura() {
        System.out.println("Manter temperatura");
    }

}
