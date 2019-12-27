/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct02 {

    /*Práctica 2: crear un programa que lea por teclado números enteros y los guarde en una
matriz de 5 filas por 4 columnas. Se deberá buscar el número mayor y el número menor
mostrándolos así como las posiciones que ocupen. Finalmente se mostrará el array
completo (poner un ‘\n’ en los print al final de cada fila del array) recorriéndolo mediante
bucles for-each*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int doble[][] = new int[4][5];

        for (int i = 0; i < doble.length; i++) {
            for (int j = 0; j < doble.length; j++) {
                System.out.println("Número para "+i+j);
                num = sc.nextInt();sc.nextLine();
                num = doble[i][j];
            }
        }

        for (int[] a : doble) {
            for (int todo : a) {
                System.out.println(todo);
            }
        }
    }
}
