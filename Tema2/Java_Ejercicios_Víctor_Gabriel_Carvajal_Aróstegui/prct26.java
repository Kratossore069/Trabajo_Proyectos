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
public class prct26 {
    public static void main(String[] args){
        /*Práctica 26:  Escribe un programa que pida por teclado un día de la semana 
        ( ún número entero del 1 al 5 que representa de lunes a viernes ) y que diga 
        qué asignatura toca a primerahora ese día.*/
        
        System.out.println("Introduzca el número del día de la semana del 1 al 5 -> ");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("FOL");
                break;
            case 2:
                System.out.println("LND");
                break;
            case 3:
                System.out.println("PRO");
                break;
            case 4:
                System.out.println("ETS");
                break;
            case 5:
                System.out.println("BAE");
                break;
            default:
                System.out.println("No es un día laborable.");
        }
    }
}
