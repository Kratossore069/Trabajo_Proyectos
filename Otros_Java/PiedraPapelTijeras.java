/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class PiedraPapelTijeras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] enemigo = {"Piedra", "Papel", "Tijeras"};
        int elec;

        do {

            System.out.println("¿Piedra(1), papel(2), ó tijeras(3)?\nSalir con 4");
            elec = sc.nextInt();

            switch (elec) {
                case 1:
                    System.out.println("Tienes piedra y ha salido " + enemy(enemigo));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Tienes papel y ha salido " + enemy(enemigo));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Tienes tijeras y ha salido " + enemy(enemigo));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("No hay " + elec + " opciones.");
                    System.out.println("");
                    break;
            }

        } while (elec != 4);
    }

    public static String enemy(String[] a) {
        Random rd = new Random();
        int random = rd.nextInt(3);
        String res = a[random];
        return res;
    }

}
