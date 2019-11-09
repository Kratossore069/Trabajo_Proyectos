/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Arrays;

/**
 *
 * @author Víctor
 */
public class Prct17 {

    /*Práctica 17
    :  Crear un programa que reproduzca el algoritmo anterior*/

    public static void main(String[] args) {

        int orden[] = {5, 2, 12, 14, 8, 9, 11};
        Arrays.sort(orden);

        for (int numero : orden) {
            System.out.println(numero); //De esta forma ordenamos los números de un array
        }
        
        System.out.println("De la forma matemática: ");
        String espacio = "";
        int orden2[] = {5, 2, 12, 14, 8, 9, 11};
        for(int i=0;i<orden2.length;i++){
            if(orden2[0]>orden2[1]){
                espacio = "" +orden2;
                System.out.println(orden2);  //NO TERMINADO
            }
        }
    }
}
