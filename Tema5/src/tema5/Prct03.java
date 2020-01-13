/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct03 {

    /*Práctica 3: Se introducirá por teclado las dimensiones de una matriz ( la cantidad de filas y
la de columnas ) esa matriz se rellenará con números aleatorios enteros desde 1 a 99
inclusives. Calcular el valor medio de cada fila de la matriz y mostrarlo en pantalla
especificando a que fila corresponde cada media*/

    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int medio = 0;

        System.out.println("¿Filas?");
        int filas = sc.nextInt();
        System.out.println("¿Columnas?");
        int columnas = sc.nextInt();

        int ale[][] = new int[filas][columnas];

        for (int i = 0; i < ale.length; i++) {
            for (int j = 0; j < ale[0].length; j++) {
                ale[i][j] = rd.nextInt(99) + 1;

                if (i <= filas) {
                    medio += ale[i][j];
                }
                medio /= 2;

                System.out.print("Posición [" + i + "," + j + "] " + ale[i][j] + " ");
                System.out.println("Media de la fila [" + i + "] es " + medio);
            }
            System.out.println("");
        }

    }
}
