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

public class Trycatch {

    public static void main(String[] args) {
        boolean chivato = false;
        do {
            try {
                System.out.println("Introduce un número");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println("Has puesto el " + num);
                chivato = false;
            } catch (java.util.InputMismatchException ex) {
                //ex.printStackTrace();
                chivato = true;
                System.out.println("Debes introducir un número");
            } finally {
                System.out.println("Programa diseñado por Víctor");
            }
        } while (chivato);
    }
}
