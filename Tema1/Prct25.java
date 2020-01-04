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
public class Prct25 {

    public static int sumatorio(int a[]){
        int resultado = 0;
        for(int i = 0; i<a.length; i++){
            resultado += a[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        /*Práctica 25
        : Sumar todos los elementos de un array mediante recursión*/
        
        int suma[] = new int[5];
        suma[0] = 20;
        suma[1] = 30;
        suma[2] = 40;
        suma[3] = 50;
        suma[4] = 60;
        
        int resul = sumatorio(suma);
        System.out.println("Resultado -> "+resul);
    }
}
