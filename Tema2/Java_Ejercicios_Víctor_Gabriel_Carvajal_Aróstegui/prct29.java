/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video18;

/**
 *
 * @author Víctor
 */
public class prct29 {
    public static void main(String[] args) {
        /*Práctica 29: Hacer un programa que muestre la tabla de multiplicar del número 5 usando
        un bucle do while*/
        
        int num = 5;
        int i = 1;
        do{
            System.out.println(num+" x "+i+" = "+num*i);
            i++;
        }while(i <= 10);
    }
}