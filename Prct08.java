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
import java.util.Scanner;
public class Prct08 {
    /*Práctica 8
    :   Crear un programa que, mediante un bucle, guarde 10 números en un array
    introducidos   por   el   usuario.   Luego,   también   con   un   bucle,   muestre   cada   uno   de   esos
    números y el índice que le corresponde en el array*/
    
    public static void main(String[] args){
        
        int num[] = new int[10];
    
        Scanner sc = new Scanner (System.in);
    
        System.out.println("Introduzca números en el array");
        
        for(int i = 0; i<num.length; i++){
            System.out.println("Valor para el array "+i);
            num[i] = sc.nextInt();
        }
        
        for(int i = 0; i<num.length; i++){
            System.out.println("Array "+i+" = "+num[i]);
        }
    }
    

    
}
