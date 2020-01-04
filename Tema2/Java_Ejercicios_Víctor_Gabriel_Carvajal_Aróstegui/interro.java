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
public class interro {
    public static void main(String[] args){
        System.out.println("Introduzca una edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        String edadAdulta = (edad>=18)?"Mayor":"Menor";
        System.out.println("Usted es "+edadAdulta);
                
    }
}

