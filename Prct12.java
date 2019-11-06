/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Víctor
 */
import java.util.Random;

public class Prct12 {

    /*Práctica 12
    :   Crear un programa que genere 20 números aleatorios enteros entre 1 y 100.
    Este array una vez se hay rellenado no se puede modificar. Crear un segundo array donde se
    almacenará una copia de los 5 números más pequeños del primer array. Mostrar en pantalla
    el contenido del array de 20 números y mostrar cuáles son los 5 números más pequeños*/
    public static int[] numerosPequenios(int a[]) {
        int peque[] = new int[5]; //AQUÍ TENGO EL PROBLEMA
        peque[0] = 100;
        peque[1] = 100;
        peque[2] = 100;
        peque[3] = 100;
        peque[4] = 100;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < a[i + 1]) {
                peque[i] = a[i];
                a[i] = a[i + 1];
                a[i + 1] = peque[i];
            }

        }
        return peque;
    }

    public static void main(String[] args) {
        int array[] = new int[20];

        Random rd = new Random();

        for (int i = 0; i < array.length; i++) { //Introducimos números aleatorios al 
            int aleatorio = rd.nextInt(100) + 1;  //primer array
            array[i] = aleatorio;
        }

        for (int i = 0; i < array.length; i++) {             //Verifico que se han puesto los números
            System.out.println("Array [" + i + "] es " + array[i]);//antes mencionados
        }

        int[] copia = new int[array.length]; //Creo una copia del array original y le asigno los valores
        for (int i = 0; i < array.length; i++) {    //del primer array que hice
            copia[i] = array[i];
        }

        /*System.out.println("La copia del array de arriba");
        for(int i=0;i<copia.length;i++){  //Verifico que he copiado satisfactoriamente
            System.out.println(copia[i]); //los valores y los muestro
        }*/
        int[] cincoNumerosBajos = numerosPequenios(copia); //Llamo a la función de arriba

        System.out.println("Los 5 números más bajos"); //Salen los 5 números más bajos de la array copiada
        for (int i = 0; i < cincoNumerosBajos.length; i++) {
            System.out.println("Posición " + i + " es " + cincoNumerosBajos[i]);
        }
    }

}
