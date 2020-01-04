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
public class prct13 {
    public static void main(String[] args){
        //Práctica 13:  Sea el siguiente programa:
        Scanner cin = new Scanner(System.in);        
        System.out.println("Introduzca un número mayor que 5 ");        
        int numero = cin.nextInt();        
        boolean comparaCon5;        
        comparaCon5 = numero > 5;        
        System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5");    
        //Ejecutarlo e introducir un número mayor que 5 ¿ qué mensaje muestra ? 
        
        /*Es true que el número sea mayor que 5*/
        
        //Ahora introduce unnúmero menor que 5 ¿ qué mensaje muestra ahora 
    }
}       /*Es false que el número sea mayor que 5*/
