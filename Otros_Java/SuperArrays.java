/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;
//import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class SuperArrays {

    public static void main(String[] args) {

        long ini = System.currentTimeMillis();

        Pattern p = Pattern.compile("([XY]?)([0-9]{1,9})([A-Za-z])");
        Matcher m = p.matcher("X123456789Z Y00110011M 999999T");
        while (m.find()) {
            System.out.println("Letra inicial (opcional):" + m.group(1));
            System.out.println("Número:" + m.group(2));
            System.out.println("Letra NIF:" + m.group(3));
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo de compilación: " + (fin - ini)); //Tiempo de compilación

        /* int[][] bidi = new int[2][2];

        bidi[0][0] = 5;
        bidi[0][1] = 2;
        bidi[1][0] = 2;
        bidi[1][1] = 5;

        System.out.print("[" + bidi[0][0] + "]");
        System.out.println("[" + bidi[0][1] + "]");
        System.out.print("[" + bidi[1][0] + "]");
        System.out.println("[" + bidi[1][1] + "]");

        int array[][] = new int[3][];
        char cadena[] = new char[50];
        cadena[0] = 'H';
        cadena[1] = 'o';
        cadena[2] = 'l';
        cadena[3] = 'a';
        String texto = new String(cadena);
        System.out.println(texto);
        System.out.println(texto.length());
        char cadena1[] = texto.toCharArray();
        System.out.println(cadena1);
         */
    }
}
