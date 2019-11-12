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
public class Ejerciciodeclase3 {

    public static void main(String[] args) {
        try { //Intenta hacer lo siguiente
            System.out.println("Hacer un súper array con números ya dados calculando\nsu distancia.");
            int i = 0;

            int arreglo[] = generarAleatorio(); //PERCEPCIÓN Y VISUALIZACIÓN DEL ARREGLO
            for (i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }
            
            int minimo = minimo(arreglo);
            System.out.println("El más pequeño del array es "+minimo);
            
            int maximo = maximo(arreglo);
            System.out.println("El más grande del array es "+maximo);
            
        } catch (Exception ex) {
            ex.printStackTrace(); //Medida para ver el error, si es que hay
        } finally {
            System.out.println("*Hecho por Víctor*"); //Firma
        }

    }

    /*public static int[] superarray() {
        int numeros[] = {5, 10, 2, 15, 13, 8};
        int cuentas[] = new int[2 * (numeros.length)];
        int num1 = 0, k = 0;

        for (int i = 0; i < numeros.length; i++) {
            num1 = numeros[i];
            for (int j = 0; j < numeros.length; j++) {
                cuentas[k] = numeros[i] - numeros[j];
                k++;
            }
        }
        return cuentas;
    }*/
    
    public static int[] generarAleatorio(){
        Random rd = new Random();
        int hijo[] = new int[6];
        int numAleatorio;
        for(int i=0;i<hijo.length;i++){
            numAleatorio = rd.nextInt(100)+1;
            hijo[i] = numAleatorio;
        }
        return hijo;
    }
    
    public static int minimo(int[] a){
        int min=999;
        for(int i =0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }else{
                min=min;
            }
        }
        return min;
    }
    
    public static int maximo(int[] b){
        int max=0;
        for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }else{
                max=max;
            }
        }
        return max;
    }
    

}
