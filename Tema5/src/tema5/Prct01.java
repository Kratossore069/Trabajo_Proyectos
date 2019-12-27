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

    /* Práctica 1: Probar el código anterior y luego recorrer el array para mostrar en pantalla la
información que tiene almacenada. Toma captura de pantalla de la salida que muestra. ¿ se
ha modificado el array ?*/
    public static void main(String[] args) {

        int array[] = {7, 3, 9, 2, 8};
        for (int elemento : array) {
            elemento = 20;
            System.out.println(elemento);
        }
        //Sale por pantalla un total de 5 números 20 en columna
        //Significa que se sobreescribe la información de los niveles del array por 20
    }

}
