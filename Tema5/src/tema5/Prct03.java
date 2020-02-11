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

    /*Práctica 3: Se introducirá por teclado las dimensiones de una

    matriz(la cantidad

    de filas y
la de columnas ) esa matriz se rellenará con números aleatorios enteros desde 1 a 99
inclusives. Calcular el valor medio de cada fila de la matriz y mostrarlo en pantalla
especificando a que fila corresponde cada media*/
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int matriz[][];
        
        System.out.println("Filas: ");
        int filas = sc.nextInt();sc.nextLine();
        
        System.out.println("Columnas: ");
        int columnas = sc.nextInt();sc.nextLine();
        
        matriz = new int[filas][columnas]; //Filas y columnas insertadas.
        int sumaTotal=0;
        
        for (int i = 0; i < matriz.length; i++) { //Se rellena la matriz aleatoriamente.
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=rd.nextInt(99)+1;
                sumaTotal += matriz[i][j]; //Sumatorio.
            }
        }
        
        double media = sumaTotal/filas;
        
        System.out.println("La media es "+media);
        
        
    }
}
