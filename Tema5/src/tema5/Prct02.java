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

   /* Práctica 2: crear un programa que lea por teclado números enteros y los guarde en una
    matriz de 5 filas por 4 columnas.Se deberá buscar el número mayor y el número menor
    mostrándolos así como las posiciones que ocupen.Finalmente se mostrará el

    array
            completo(poner un
    ‘\n’ en los print al final de cada fila del array
    ) recorriéndolo mediante
    bucles for-each*/
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int matriz[][] = new int[5][4];
        
        int num;
        
        int max=0, min=999;
        
        int puntero=0;
        
        for (int i = 0; i < matriz.length; i++) { //Se colocan los números.
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Posición ["+i+","+j+"]: ");
                num = sc.nextInt();sc.nextLine();
                matriz[i][j]=num;
                if(num >= max){
                    max = num;
                    puntero = matriz[i][j];
                }else if(num <= min){
                    min = num;
                    puntero = matriz[i][j];
                }
            }
        }
        
        System.out.println("Máximo: "+max+" en "+puntero);
        System.out.println("Mínimo: "+min+" en "+puntero);
            
        for (int[] numero : matriz) {
            System.out.print(numero);
        }
        System.out.println("");
        
        
    }
}
