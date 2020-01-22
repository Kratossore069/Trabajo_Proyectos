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
public class Otra {

    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("([A-Z][a-z])([0-9]{3})");
        
        Matcher m = p.matcher("Pablo Marta 958A");
        
        while (m.find()) {
            System.out.println("Letra inicial (opcional):" + m.group(1));
            System.out.println("Número:"+ m.group(2));
           /* System.out.println("Número:" + m.group(2));
            System.out.println("Letra NIF:" + m.group(3));*/
        }
    }
}
