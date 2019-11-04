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

public class Prct09 {

    /*Práctica 9
    :  Crear un programa que guarde en un array 10 números aleatorios entre 1 y 99
    que sean pares. Luego mostrar en pantalla los 10 números, así como el máximo y el mínimo
    de esos 10 números y las respectivas posiciones que ocupan en el array*/
    
    public static int maximo(int vec[]){
        int mayor=0;
        for(int i =0; i<vec.length; i++){
            if(mayor>vec[i]){
                mayor = mayor;
            }else{
                mayor = vec[i];
            }
        }
        return mayor;
    }
    
    public static int minimo(int vec[]){
        int menor=0;
        for(int i =0; i<vec.length; i++){
            if(menor<vec[i]){
                menor = menor;
            }else{
                menor = vec[i];
            }
        }
        return menor;
    }
    
    public static void main(String[] args) {
        Random rc = new Random();
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            int aleatorio = rc.nextInt(99-1) + 1;
            if ((aleatorio % 2 == 0) && (aleatorio > 0)) { // No sé por qué sale 0
                array[i] = aleatorio;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
        
        int resul1 = maximo(array);
        int resul2 = minimo(array);
        System.out.println("El número más pequeño es "+resul2+" y el mayor es "+resul1);
        
        
    }

}
