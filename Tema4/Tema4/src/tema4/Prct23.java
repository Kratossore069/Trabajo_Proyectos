/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct23 {
   /* Práctica 23: Probar en el IDE las siguientes comparaciones. Obtener una salida en pantalla
    del valor booleano correspondiente y explicar por qué motivo la comparación nos sale true
    o false:
    new String("test").equals("test")
    new String("test") == "test"
    new String("test") == new String("test")
    "test" == "test"*/
    
    public static void main(String[] args) {
        
        System.out.println(new String("test").equals("test"));
        System.out.println(new String("test") == "test");
        System.out.println(new String("test") == new String("test"));
        System.out.println("test" == "test");
        
    }
    
    /*OUTPUT    
    true
    false
    false
    true
    */
}
