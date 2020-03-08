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
@FunctionalInterface
public interface Mates {
    public abstract int calc(int x);
    
    default void mostrarResultado(int x, Mates func){
        System.out.println(x+" su operación da "+func);
    }
}
