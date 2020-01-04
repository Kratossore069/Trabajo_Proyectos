/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class prct38for {
    public static void main(String[] args) {
        //Ejercicio 37 bien hecho.
        
        Scanner sc = new Scanner (System.in);
        int cantidadbillete, sum=0, dinero=0;
        String tipoMoneda = "billete";
        
        
        for(int multiplo=100; multiplo>0; multiplo /=10){
           for(int num = 5; num>0; num /=2){
               int valorbillete = num*multiplo;
               tipoMoneda = (valorbillete>=5)?"billete":"moneda";
               System.out.println("Dame "+tipoMoneda+" de: ");
               
               System.out.println(valorbillete);
               cantidadbillete = sc.nextInt();
               dinero += cantidadbillete * valorbillete;
           }
        }
        System.out.println("Dinero total -> "+dinero);
    }
}
