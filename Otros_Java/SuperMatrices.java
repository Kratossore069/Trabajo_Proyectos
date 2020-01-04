/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class SuperMatrices {
    
    public static void main(String[] args) {
        
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        //De otro modo
        
        int filas,columnas;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Número de filas");
        filas = sc.nextInt();
        System.out.println("Número de columnas");
        columnas = sc.nextInt();
        
        int arreglo[][] = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor para posición ["+i+","+j+"] ");
                arreglo[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("["+i+","+j+"] = "+arreglo[i][j]);
            }
        }
    }
}
