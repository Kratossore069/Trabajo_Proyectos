/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author Víctor
 */

public class bucles {
    public static void main(String[] args) {
        /*Práctica 27:  Hacer un programa que muestre la 
        tabla de multiplicar del número 5 usando un bucle while*/
        int valorTabla = 5;
        System.out.println("TABLA DEL "+valorTabla);
        int i = 0;
        while(i<10){
            i++;
            System.out.println(valorTabla+" x "+i+" = "+i*valorTabla);
            
        }
    }
}
