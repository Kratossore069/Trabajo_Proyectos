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
public class Expresiones {
    
    //imniciales dle primer apellido y del segundo año de acnimeinto mes de animcimento dia de nacimeinto sexo

    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("([A-Z]{1}[a-z])([0-9]{4})([0-9]{2})([0-9]{2})([MH])");
        
        Matcher m = p.matcher("Garcia123 123Labrador Perro20051994 DobladoH");
        
        while (m.find()) {
            System.out.println("Iniciales del primer apellido:" + m.group(1));
            System.out.println("Iniciales del segundo apellido:" + m.group(1));
            System.out.println("Año de nacimiento:" + m.group(2));
            System.out.println("Mes de nacimiento:" + m.group(3));
            System.out.println("Día de nacimiento:" + m.group(4));
            System.out.println("Sexo:" + m.group(5));
        }
    }
}
