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
public class variables {
    public static void main(String[] args){
        //Práctica 15:  
        //Hacer un programa que lea una línea de texto entrada por teclado y la muestreen pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una línea de texto ---> ");
        String linea = sc.nextLine();
        System.out.println("Su línea de texto es ---> "+linea);
    }
}
