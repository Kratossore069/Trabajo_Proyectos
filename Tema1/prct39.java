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
public class prct39 {
    public static void main(String[] arg){
        /*Práctica 39
        :  Hacer un programa que recibe un número entero mayor o igual a 10 y menor
        o igual a 99 ( si el usuario introduce un número no válido se le pedirá que repita hasta que
        lo haga bien ) , y se le muestre el número con las cifras invertidas. Por ej. si 34 se mostraría
        en pantalla 43*/
        
        System.out.println("Introduzca un número de dos cifras.");
        Scanner sc = new Scanner (System.in);
        String num = sc.nextLine();
        
        int cambio = Integer.parseInt(num); //Cambio de String a int
        
        while(cambio<10 || cambio>99){
            System.out.println("Número incorrecto, vuelva a insertar.");
            cambio = sc.nextInt();
        }
        
        String vuelta = Integer.toString(cambio); // Volvemos a hacerlo un String
        char cambioSitio = vuelta.charAt(1);
        char cambioSitio2 = vuelta.charAt(0);
        
        System.out.println("El cambio es -> "+cambioSitio+cambioSitio2);
        
    }
}
