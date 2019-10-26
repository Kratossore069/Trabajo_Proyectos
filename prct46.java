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
public class prct46 {
    public static void main(String[] args) {
        /*Práctica 46
        :  Convertir un número a binario. El usuario introduce un número entero 
        decimal y el programa muestra en pantalla como es su forma en binario*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número en decimal para pasarlo a binario");
        int numero = sc.nextInt();

        String binario = "";

        if (numero > 0) {

            while (numero > 0) {

                if (numero % 2 == 0) {

                    binario = "0" + binario;

                } else {

                    binario = "1" + binario;

                }

                numero = (int) numero / 2;

            }

        } else if (numero == 0) {

            binario = "0";

        }

        System.out.println("El número"+numero+" convertido a binario es: " + binario);
    }
}
