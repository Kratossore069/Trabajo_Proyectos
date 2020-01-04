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
public class ejerciciocasero1 {
    public static void main(String[] args){
        /*1) Declara dos variables numéricas (con el valor que desees), 
        muestra por consola la suma, resta, multiplicación, división y módulo 
        (resto de la división).*/
        
        int num1 = 5;
        int num2 = 10;
        
        System.out.println("Suma, resta, división ó multiplicación.");
        Scanner sc = new Scanner(System.in);
        String elec = sc.nextLine();
        
        switch(elec){
            case "suma": 
                int suma = num1 + num2;
                System.out.println(suma);
                break;
            case "resta":
                int resta = num2 - num1;
                System.out.println(resta);
                break;
            case "division":
                int dividir = num2 / num1;
                System.out.println(dividir);
                break;
            case "multiplicar":
                int multi = num1 * num2;
                System.out.println(multi);
                break;
            default:
                System.out.println("No he entendido su petición");
        }
    }
}