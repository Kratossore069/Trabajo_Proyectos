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
public class prct44 {
    public static void main(String[] args){
        /*Práctica 44
        :  Programa generador de potencias. El usuario introduce un número entero de 1
        a 20. Se le mostrará en pantalla las 5 primeras potencias de ese número. 
        Ej. número introducido 2
        2^1 = 2
        2^2 = 4
        2^3 = 8
        2^4 = 16
        2^5 = 32*/
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca un número entra 1 y 20.");
        int num = sc.nextInt();
        
        for(int i = 1; i<=5; i++){
            System.out.println(num+"^"+i+" = "+(int)Math.pow(num, i));
        }
    }
}
