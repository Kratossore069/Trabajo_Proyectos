/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct01 {

    /*
    Práctica 1: Probar el código anterior y luego recorrer el array para mostrar en pantalla la
información que tiene almacenada. Toma captura de pantalla de la salida que muestra. ¿ se
ha modificado el array ?
     */
    public static void main(String[] args) {
        int array[] = {7, 3, 9, 2, 8};
        
        for (int elemento : array) {
            elemento = 20;
        }
        
        //El array de esta forma no muestra nada porque no hay un elemento
        // en el array que sea 20
    }

}
