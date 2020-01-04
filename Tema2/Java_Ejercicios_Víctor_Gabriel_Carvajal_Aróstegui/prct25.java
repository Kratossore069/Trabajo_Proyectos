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
public class prct25 {
    public static void main(String[] args){
        /*Práctica 25:  Hacer un programa que le pida al usuario que introduzca una letra y 
        por medio de una estructura switch, evitando el mayor número de sentencias break posibles , muestre en pantalla 
        el mensaje: “es una vocal” cuando el usuario haya introducido una vocal 
        ( ya sea minúscula o mayúscula ) y el mensaje: “no es una vocal”  si no lo fuera*/
        
        System.out.println("Introduzca una letra y le diré si es vocal o no -> ");
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);
        
        switch(letra){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Es vocal.");
                break;
            default:
                System.out.println("No es vocal.");
            
                
            
        }
    }
}
