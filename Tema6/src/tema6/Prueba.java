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
interface Funcion2{
    void hola();
    
    static void mostrarTexto2(){
        System.out.println("Interfaz distinta");
    }
}


@FunctionalInterface
public interface Prueba {
    int miprueba(); //Método abstracto SOLO UNO
    
    static void mostrarTexto(){
        
    }
}

class Main{
    public static void main(String[] args) {
        Prueba.mostrarTexto();
        
        
        Funcion2.mostrarTexto2();
    }
}
