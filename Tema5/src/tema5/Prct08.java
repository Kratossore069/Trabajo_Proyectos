/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct08 {

    /*Práctica 8: obtener una expresión regular que verifique si el identificador introducido por el
usuario se adapta al formato establecido: Nombre-Edad-siglasdelciclo. Ej
Juan-23-daw
donde Nombre tiene primera letra mayúscula y resto minúscula.
Edad: un número de 20 a 99 años
siglasdelciclo: tres letras minúsculas*/
    
    public static void main(String[] args) {

        Pattern p = Pattern.compile("([A-Za-z])([0-9]{1,9})([a-z])");
        Matcher m = p.matcher("65447Juan2334 YASDc23gtdM 23457dawSDDR");

        while (m.find()) {
            System.out.println("Nombre :" + m.group(1));
            System.out.println("Edad :" + m.group(2));
            System.out.println("Siglas del ciclo: " + m.group(3));
        }

    }
}
