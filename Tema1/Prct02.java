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
public class Prct02 {
    
    static int mcd(int dividendo, int divisor){
        
        int resto, resultado = 1;
        do{
           resto = dividendo % divisor;
           if(resto != 0){
               dividendo = divisor;
               divisor = resto;
           }
        }while(resto != 0);
        
        resultado = divisor;
        
        return resultado;
    }
    
    static int mcm(int a, int b){
        int mcd = mcd(a,b);
        int res = (a*b)/mcd;
        return res;
    }

    public static void main(String[] args){
        /*Práctica 2:   Utilizando el método mcd() creado en la práctica anterior 
        crear un programaque calcule el mcm.  Recordar que: mcm(a,b) = a*b/mcd(a,b*/
        
        System.out.println("Introduzca dos números para mcm.");
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        System.out.println("Segundo número.");
        int num2 = sc.nextInt();
        
        int resultado = mcm(num1, num2);
        System.out.println("El resultado es "+resultado);
    }
}
