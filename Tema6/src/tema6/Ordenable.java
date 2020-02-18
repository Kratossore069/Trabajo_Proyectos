/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public interface Ordenable<T> {
    
    
    boolean esMayorQue(T or);
    boolean esIgualQue(T or);
    boolean esMenorQue(T or);
    
    
}
