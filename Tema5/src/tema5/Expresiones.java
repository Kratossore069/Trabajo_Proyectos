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
        
       /* Pattern a = Pattern.compile("([A-Z]{1}[a-z])");
        
        Pattern b = Pattern.compile("([0-9]{4})");
        
        Pattern c = Pattern.compile("([0-9]{2})");
        
        Pattern d = Pattern.compile("([MH])");
        
        
        
        Matcher m = a.matcher("Garcia1234 Lorenzo123");
        
        while(m.find()){
            System.out.println("Iniciales del primer apellido:" + m.group(1));
            System.out.println("Iniciales del segundo apellido:" + m.group(1));
        }
        
        Matcher n = b.matcher("Perro20051994");
        
        while(n.find()){
            System.out.println("Año de nacimiento:" + n.group(1));
        }
        
        Matcher o = c.matcher("Perro20051994");
        
        while(o.find()){
            System.out.println("Mes de nacimiento:" + o.group(1));
            System.out.println("Dia de nacimiento:" + o.group(1));
        }
        
        Matcher p = d.matcher("HPerro20051994");
        
        while(p.find()){
            System.out.println("Sexo:" + p.group(1));
        }*/
    }
}
