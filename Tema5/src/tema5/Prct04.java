/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct04 {
    /*Práctica 4: Utilizando bucles crear un array de dos dimensiones donde la primera fila haya
un elemento, en la segunda fila 2 elementos, en la tercera fila 3 elementos ... Llegar así
hasta 20.*/
    
    public static void main(String[] args) {
        
        int[][] nueva = new int[1][20];
        int contador = 0;
        
        
        for (int i = 0; i < nueva.length; i++) {
            for (int j = 0; j < nueva[0].length; j++) {
                nueva[i][j]=contador++;
                System.out.println("["+i+","+j+"] = "+nueva[i][j]);
            }
        }
        
    }
}
