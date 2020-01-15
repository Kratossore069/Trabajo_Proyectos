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
    public static void main(String[] args) {
        /*Práctica 4:  Utilizando bucles crear un array de dos 
                dimensiones donde la primera fila hayaun elemento,
                        en la segunda fila 2 elementos, en la tercera 
                                fila 3 elementos ...  Llegar así hasta 20.*/
        
        
        int array[][] = new int[20][];

        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        array[4] = new int[5];
        array[5] = new int[6];
        
        int k=0;
        array[0]=new int[1];
        array[0][0]=0;
        
        for (int i = 0; i < array.length; i++) {
            
            array[i] = new int[i+1];
            array[i][0]=array[i-1][array[i-1].length-1]+1;
            
            for (int j = 0; j < array.length; j++) {
                
                array[i][j]=array[i][j-1]+1;
                
            }
        }
        
        for (int[] fila : array) {
            for (int i : fila) {
                
            }
        }
        
    }
}
