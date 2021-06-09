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
public abstract class Aprobador {
    Aprobador siguiente;
    
    public Aprobador setAgregarSiguiente(Aprobador aprobador){
        this.siguiente = aprobador;
        return siguiente;
    }
        
    public abstract void Procesar(Compra c);
}
