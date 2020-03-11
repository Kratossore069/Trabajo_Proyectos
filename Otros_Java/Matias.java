/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Matias {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        Random rd = new Random();
        
        for (int i = 0; i < 5; i++) {
            numeros.add(rd.nextInt(100));
        }
        
        Collections.sort(numeros);
        
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        
        //////////////////////////////////////
        
        Pattern p = Pattern.compile("[A-Z]");
        
        Matcher m = p.matcher("Hola5");
        
        while(m.find()){
            System.out.println(m.group());
        }
        
        ////////////////////////////////////////
        
        numeros.stream().filter(o->o%2==0).forEach(System.out::println);
        
        ////////////////////////////////////////
        
        int array[][] = new int[5][5];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j]=rd.nextInt(100);
            }
        }
        
    }
    
}
