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
public class Prct21 {
    /*Práctica 21
    :  Crear un programa que reciba dos números del usuario. Si el primer número 
    no es un entero entre 1 y 100 lanzará una excepción que mostrará en pantalla “El número 
    debe ser un entero entre 1 y 100”   */
    
    public static boolean correccion(int a){
        boolean chivato = false;
        if(a<1 || a>100){
            chivato = true;
        }
        return chivato;
    }
    
    public static void main(String[] args){
        System.out.println("Introduzca el primer número -> ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        boolean verificar = correccion(num1);
        if(verificar = true){
            System.out.println("El número debe ser un entero entre 1 y 100");
        }
    }
}
