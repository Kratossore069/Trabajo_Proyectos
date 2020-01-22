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
public class Prct05 {

    /*Práctica 5: Observa la siguiente salida de programa:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
    
Siempre el primer y el último elemento de cada fila es 1. Fijémonos ahora en la fila:
1 4 6 4 1
el 4 se obtiene sumando 1 3 que tiene encima.
el 6 se obtiene sumando 3 3 que tiene encima.
Si nos fijamos todos los elementos intermedios se generan así:
array[i][j] = array[i-1][j-1] + array[i-1][j]
Utiliza el array que creaste en la práctica anterior para rellenarlo y posteriormente mostrarlo
en pantalla de la forma que acabamos de describir*/
    public static void main(String[] args) {

        /*int array[][] = new int[7][];

        for (int i = 0; i < array.length; i++) {
            
            array[i] = new int[i+1]; //No lo entiendo.
            int elementos[] = array[i];

            for (int j = 0; j < elementos.length; j++) {

                if(j==0 || j==elementos.length -1){
                    elementos[j]=1;
                }else{
                    elementos[j] = array[i - 1][j - 1] + array[i - 1][j];
                }
                System.out.print(elementos[j]+" ");
            }
            System.out.println("");
        }*/
        
        int size=7;
        int array[][] = new int[size][];
        
       /* int i = 1;
        for (int[] a : array) {
            a = new int[i];
            array[i-1] = a;
            for (int j = 0; j < a.length; j++) {
                a[j] = ++n;
                
            
            }
            i++;
        }*/
        
        for (int j=0; j<array.length;j++){
            int m = array.length -j;
            for (int k = 0; k<m ; k++){
                System.out.print("\t");
            }
            for (int k = 0; k < array[j].length; k++) {
                System.out.print("\t"+array[j][k]+"\t");
            }
            System.out.println("");
        }
        
        
        


    }
}
