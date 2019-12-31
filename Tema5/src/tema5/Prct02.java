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
        int doble[][] = new int[5][4];
        int mayor = 1, menor = 999;

        for (int i = 0; i < doble.length; i++) {
            for (int j = 0; j < doble[0].length; j++) { //Importante ese [0]

                System.out.println("Posición [" + i + "," + j + "] ");
                doble[i][j] = sc.nextInt(); //Insertamos números

                if (mayor > doble[i][j]) {
                    mayor = mayor;
                } else {
                    mayor = doble[i][j];
                }

                if (menor > doble[i][j]) {
                    menor = doble[i][j];
                }
            }
        }

        System.out.println("Mayor es " + mayor);
        System.out.println("Menor es " + menor);

        for (int i = 0; i < doble.length; i++) {
            for (int j = 0; j < doble[0].length; j++) {
                System.out.print("Posición [" + i + "," + j + "] " + doble[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
