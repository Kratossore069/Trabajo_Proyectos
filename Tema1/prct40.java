/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video18;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;

public class prct40 {

    public static void main(String[] args) {
        /*Práctica 40
        :  Escribir un programa que reciba un número entero mayor o igual a 0 y menor
        o igual a 999 y muestre cuántas cifras tiene*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un número de 0 a 999.");
        int num = sc.nextInt();

        while (num < 0 || num > 999) {
            System.out.println("Número erróneo, vuelva a intentar.");
            num = sc.nextInt();
        }

        String cambio = Integer.toString(num);
        System.out.println("El número " + num + " tiene " + cambio.length() + " dígitos.");
    }
}
