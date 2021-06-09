/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena.de.responsabilidad;

import clases.*;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class CadenaDeResponsabilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comprador comprador = new Comprador();
        Gerente gerente = new Gerente();
        Director director = new Director();

        gerente.setAgregarSiguiente(director);
        comprador.setAgregarSiguiente(gerente);

        Compra compra = new Compra();
        Scanner entrada = new Scanner(System.in);
        double importe = 1;
        boolean continua;

        do {
            continua = false;
            try {
                while (importe != 0) {
                    System.out.print("Ingrese el importe de la compra o 0 para cerrar: ");
                    
                    importe = entrada.nextDouble();

                    compra.setImporte(importe);
                    comprador.Procesar(compra);
                }
            } catch (Exception e) {
                System.out.println("ERROR SOLO SE ACEPTAN NUMEROS");
                entrada.next();
                continua = true;
            }
        } while (continua);
    }

}
