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
public class masbucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        for(int teclado = 0; teclado != 100; teclado = sc.nextInt()){
            System.out.println("Ha introducido "+teclado);
            System.out.println("Intro un número: ");
        }
    }
}
