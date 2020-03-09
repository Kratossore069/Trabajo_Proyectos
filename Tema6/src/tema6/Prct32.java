/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.ArrayList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

/*
Práctica 32: Basándose en el código anterior Crear la clase OperacionesArray y todo lo
necesario para que el código funcione
*/
public class Prct32 {

    public static void main(String[] args) {
        Integer array[] = {2, 3, 523, 7, 1, 9, 0, 4};

        OperacionesArray<Integer> ra = new OperacionesArray<Integer>();

        System.out.println(ra.arrayToText(array));

        Convert2to1<Integer> oa = (a, b) -> a + b;
        
        System.out.println(ra.reduccion(array, oa));
        
        int resultado = ra.reduccion(array, (a, b) -> {
            int c = (int) a;
            int d = (int) b;
            return (c > d) ? c : d;
        }
        );
        System.out.println(resultado);
        
//Obtener un arraylist de los números pares
        ArrayList<Integer> pares = new ArrayList<Integer>();
        Filtrar<Integer> lambda = num -> num % 2 == 0;
        pares = ra.filtrado(array, lambda);
        
//Obtener un arraylist con los números al cuadrado
        ArrayList<Integer> cuadrados = new ArrayList<Integer>();
        ra.porCadaUno(array, a -> cuadrados.add((int) a * (int) a));
        System.out.println(cuadrados.toString());
        
    }
}
