/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class mejorara45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int divisor = 2, num = sc.nextInt(); 
        String mensaje = "", strdivisor="";
        
        while(num > 1){
            int potencia = 0;
            while(num % divisor == 0){
                potencia++;
                num /= divisor;
                strdivisor = ""+divisor;
                System.out.println(num);
            }
            mensaje += strdivisor +"^"+potencia+"*";
            divisor++;
        }
        mensaje += "1";
        System.out.println(mensaje);
        
    }
}
