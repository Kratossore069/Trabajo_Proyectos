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
public class prct21 {
    public static void main(String[] args) {
        /*Práctica 21:  Hacer un programa que se le pase un número entero y  
        determine si es múltiplo de 3 y de 5. Un módelo de mensajes a mostrar 
        sería:- x es multiplo de 3 pero no es múltiplo de 5- x no es múltiplo de 3 pero sí es 
        múltiplo de 5- x no es múltiplo de 3 ni de 5- x es múltiplo de 3 y de 5*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Número -> ");
        int x = sc.nextInt();
        
        if ((x%3==0)&&(x%5==0)){
            System.out.println("Múltiplo de 3 y 5.");
        }else if((x%3!=0)&&(x%5!=0)){
            System.out.println("No es múĺtiplo de 3 ni de 5.");
        }else if(x%3 != 0){
            System.out.println("Es múltiplo de 5, pero no de 3");
        }else{
            System.out.println("Es muĺtiplo de 3, pero no de 5.");
        }
    }
}
