/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jose
 */
public class Comprador extends Aprobador {

    public void Procesar(Compra i) {
        if (i.getImporte() <= 100) {
            System.out.println("Compra aprobada por el comprador ");
        } else {
           siguiente.Procesar(i);
        }
    }

}
