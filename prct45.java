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
public class prct45 {
    public static void main(String[] args) {
       /* Práctica 45
        :  Crear un programa que reciba un número entero y que muestre su 
        descomposición en números primos:
        300 = 2*2*3*5*5*/
       
        System.out.println("Número a insertar.");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        
        if(num>0){
            for(int i = 1; i<=num; i++){
                if(num % i == 0){
                    System.out.println(num+" -> "+i);
                }
            }
        }else{
            System.out.println(num+" : no válido");
        }
    }
}
