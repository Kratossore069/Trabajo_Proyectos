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
public class Prct01 {
       /* Práctica 1
        :   Crear un programa para calcular el máximo común divisor ( mcd ) de dos
        números enteros recibidos por teclado. Se deberá crear un método llamado mcd que recibe
        los dos números y devuelve el máximo común divisor. El método main del programa es:*/
    
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
    
    
   public static void main(String[] args) {
      Scanner cin = new Scanner(System.in);
      System.out.println("Cálculo de MCD para dos números");
      System.out.print("Número 1: ");
      int num1 = cin.nextInt();
      System.out.print("Número 2: ");
      int num2 = cin.nextInt();
      String solucion = "MCD: " + mcd(num1,num2);
      System.out.println(solucion);
   }
    
}
