/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct09 {
    public static void main(String[] args) {
        
        /*Práctica 9:  Hacer un programa que el usuario introduzca un texto por 
        teclado y mediante expresiones regulares se determine si es un número válido.
        Observa que esto significa quedebe empezar por una cifra o por los símbolos +-    
        Que después aparezcan cifras y sólocifras salvo la coma: “,”  la cuál  nos serviría para delimitar los decimales. 
        Hacer dos versiones, en la primera debe haber una coincidencia completa en el String que elusuario nos pase, 
        en la segunda basta con que lo primero que muestre la cadena sea unnúmero válido aunque después aparezca más texto.*/
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el numero: ");
        
        String numerosolo = sc.nextLine();
        
        Pattern numero = Pattern.compile("(^[-+]?[0-9]+,?[0-9]+)");
        
        Matcher num = numero.matcher(numerosolo);
        
        if(num.find()){
            System.out.println("Sale "+numerosolo);
        }else{
            System.out.println("Error");
        }
        
        //////////////////////////////////
        
        System.out.println("Introduzca un número con letras: ");
        
        String numerocompania = sc.nextLine();
        
        Pattern numerillo = Pattern.compile("(^[0-9]+[A-Za-z]*$)");
        
        Matcher numer = numerillo.matcher(numerocompania);
        
        if(numer.find()){
            System.out.println("Sale "+numerocompania);
        }else{
            System.out.println("Error");
        }
        
    }
}
