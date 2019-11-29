/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Repaso1 {
    public static void main(String[] args){
    
    /*Devolver el mayor de los números enteros de un array. HECHO

    Devolver la media de los elementos de un array. HECHO

    Mostrar los elementos pares de un array. HECHO

    Mostrar el sumatorio de los elementos de un array.*/
    
    int array[] = {1,89,400,52,45,3,67};
    
    int mayorDeTodos = mayorArray(array);
    System.out.println("El mayor número del array es "+mayorDeTodos);
    
    int media = media(array);
    System.out.println("La media del array es "+media);
    
    elementosPares(array);
    
    int sumatorio = sumatorio(array);
    System.out.println("La suma total de todos los elementos del array es "+sumatorio);
    }
    
    public static int mayorArray(int a[]){
        int resultado=0;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]>resultado){
                resultado = a[i];
            }
        }
        
        return resultado;
    }
    
    public static int media(int a[]){
        int resultado=0, media;
        
        for (int i = 0; i < a.length; i++) {
            resultado += a[i];
        }
        
        media = resultado/(a.length);
        
        return media;
    }
    
    public static void elementosPares(int a[]){
        System.out.println("Solamente se muestran elementos pares del array.");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
    }
    
    public static int sumatorio(int a[]){
        int resultado =0;
        for (int i = 0; i < a.length; i++) {
            resultado += a[i];
        }
        return resultado;
    }
}
