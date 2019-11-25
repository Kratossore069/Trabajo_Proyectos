/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author victor
 */
public class Ejercicioadicinal8 {

    public static void main(String[] args) {
        //Ordenar un array dividiéndolo

        //array a ordenar
        int array[] = {950, 45, 25, 11000, 650};

        //llamada a la funcion
        ordenando(array, 0, array.length - 1); //Array, principio, final

        //mostramos el contenido
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void ordenando(int array[], int principio, int fin) {
        int i = principio;
        int j = fin;
        int pivote = array[(i + j) / 2]; //determinamos el pivote -> pivote = array[2]
        do {
            while (array[i] < pivote) { //i<2
                i++;
            }
            while (array[j] > pivote) { //4>2
                j--;
            }
            if (i <= j) {
                //intercambio
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        //llamada de funciones (recursivo)
        if (principio < j) {
            ordenando(array, principio, j);
        }
        if (i < fin) {
            ordenando(array, i, fin);
        }
    }
}
