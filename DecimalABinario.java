/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casiexamen;
import java.util.Scanner;
/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class DecimalABinario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número en decimal");
        String num = sc.nextLine();
        cambioABinario(num);
        System.out.println("Número en binario");
        String num2 = sc.nextLine();
        cambioBinarioDecimal(num2);

    }

    public static void cambioABinario(String num) {
        int p = Integer.parseInt(num);
        int r, c = 0, y = 0;
        while (p != 0) {
            r = (p % 2);
            y = (int) (y + r * Math.pow(10, c));
            c++;
            p = p / 2;
        }
        System.out.println("Decimal de " + num + " es " + y);
    }

    public static void cambioBinarioDecimal(String num) {
        int numero = Integer.parseInt(num);
        int exponente = 0;
        int decimal = 0;
        while (numero != 0) {
            int digito = numero % 10;
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            exponente++;
            numero = numero / 10;
        }
        System.out.println("Siendo binario "+num+" pasa a ser decimal " + decimal);
    }
}
