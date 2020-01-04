/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Víctor
 */
import java.util.Random;
public class Prct16 {
    /*Práctica 16
    :  Crear un programa que genere 10 números aleatorios enteros entre 1 y 100. Se
    deben mostrar esos 10 números, la media de esos 10 números y decir cuáles de esos 10 
    números son mayores que la media calculada.*/
    
    public static int media(int a[]){
        int media = 0;
        for (int i=0; i < a.length; i++) {
             media += a[i];
        }
    
        int valorMedia = media / a.length;
        return valorMedia;
    }
    
    /*public static int[] mayores(){
        
    //NO TERMINADO
    }
    */
    
    
    public static void main(String[] args){
    
    Random rd = new Random();
    int numeros[] = new int[10];
    
    for(int i=0; i<numeros.length; i++){
        numeros[i] = rd.nextInt(100)+1;
        System.out.println(numeros[i]);
    }
    
    int medio = media(numeros);
    System.out.println("La media es "+medio);
    
    
    
    
    }
}
