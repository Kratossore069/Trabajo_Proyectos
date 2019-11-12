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
public class Ejerciciodeclase3 {
    public static void main(String[] args) {
        System.out.println("<--------------------------EL OTRO EJERCICIO --------------------->\nHacer un súper array con números ya dados calculando\nsu distancia.");
        int i =0;
        
        int arreglo[] = superarray(); //PERCEPCIÓN Y VISUALIZACIÓN DEL ARREGLO
        for(i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
    
    public static int[] superarray(){
        int numeros[] = {1,3,5,8,10};
        int cuentas[] = new int[20];
        
        for(int i=0;i<numeros.length;i++){
            cuentas[i] = (i+1)-i;
        }
        return cuentas;
    }
    
}
