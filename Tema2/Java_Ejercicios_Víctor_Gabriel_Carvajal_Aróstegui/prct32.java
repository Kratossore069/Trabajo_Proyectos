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
public class prct32 {
    public static void main(String[] args) {
        /*Práctica 32
        :  Hacer un programa que reciba dos números enteros positivos del usuario y 
        muestre la suma de todos los números que hay entre esos dos números.
        Ej.  Usuario introduce: 10, 5 entonces la secuencia de números es: 
        5,6,7,8,9,10 
        y la suma de esos números es:
        45
        Hacer uso de un bucle for para este programa*/
        
        System.out.println("Introduzca dos números enteros, uno de comienzo y otro de final -> ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int i, suma=0;
        
        for(i=num1; i<=num2; i++){
            System.out.println(i);
            suma += i;
        }
        
        System.out.println("La suma de todos los números es "+suma);
    }
}
