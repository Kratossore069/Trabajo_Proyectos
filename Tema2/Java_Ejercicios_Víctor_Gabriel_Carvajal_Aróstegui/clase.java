/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author daw
 */
import java.util.Scanner;
public class clase {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);        
        System.out.println("Introduzca un número: ");        
        String numero = cin.nextLine();
        
        System.out.println("Introduzca un segundo número: ");        
        String numero2 = cin.nextLine();
        
        System.out.println("La suma de estos dos números es "+(numero+numero2));
    }
}
