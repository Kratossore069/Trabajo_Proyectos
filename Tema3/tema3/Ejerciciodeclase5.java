/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Víctor
 */
public class Ejerciciodeclase5 {

    public static void main(String[] args) {
        /*Trata de cambiar los números de sitio y hacer unas 24 combinaciones*/
        int numeros[] = {1, 2, 3, 4};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("");
        }
    }

    public static void permutaciones(int[] array, int posicion) {
        if (posicion < array.length - 1) {
            for (int i = 0; i < array.length; i++) {
                int temp = array[posicion];
                array[posicion] = array[i];
                array[i] = temp;
                permutaciones(array, posicion + 1);
                temp = array[posicion];
                array[posicion] = array[i];
                array[i] = temp;
            }
        } else {
            mostrar(array);
        }
    }
    static int contador = 0;

    public static void mostrar(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.println("" + array[i]);
        }
        System.out.println("]");
        contador++;
    }
}
