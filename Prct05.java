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
public class Prct05 {
    /*Práctica 5
    :   Crear un método llamado factorial() que obtenga el factorial de un número.
    Hacer uso de él en un programa que el usuario introduzca por teclado un número y se le
    muestre el factorial de ese número*/
    
    static int factorial(int a){
        int factor = 1;
        do{
            factor *= a;
            a--;
        }while(a>0);
        return factor;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca un número para factorizar.");
        int num = sc.nextInt();
        int resultado = factorial(num);
        System.out.println("El factorial de "+num+" es "+resultado);
    }
}
