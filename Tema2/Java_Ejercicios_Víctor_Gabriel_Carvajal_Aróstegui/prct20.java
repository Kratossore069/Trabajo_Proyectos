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
import java.util.Scanner;
public class prct20 {
    public static void main(String[] args){
        /*Práctica 20:  Hacer un programa que se le pase un número entero 
        y que devuelva los siguientes mensajes: 
        - Si es impar: “El número: x es impar”- Si es par: 
        “El número x es par”Donde x es el número introducido por el usuario*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número ->");
        int num = sc.nextInt();
        int operacion = num % 2;
        
        if(operacion == 1){
            System.out.println("El número "+num+" es impar.");
        }else{
            System.out.println("El número "+num+" es par.");
        }
    }
}
