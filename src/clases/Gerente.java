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
public class Gerente extends Aprobador{
        public void Procesar(Compra i) {
        if (i.getImporte() <= 1000) {
            System.out.println("Compra aprobada por el Gerente ");
        } else {
             siguiente.Procesar(i);
        }
    }
}
