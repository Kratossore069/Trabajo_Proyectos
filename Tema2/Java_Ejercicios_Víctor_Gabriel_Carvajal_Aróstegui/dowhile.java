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
public class dowhile {
    public static void main(String[] args) {
        /*Práctica 30:  Hacer un programa que vaya mostrando un número aleatorio 
        mayor o igual a 10 y menor a 20. Una vez mostrado el número se le pide 
        al usuario si quiere o no continuar. Si el programa introduce una “c” o 
        una “C” vuelve a mostrar un nuevo número aleatorio. Elprograma finaliza 
        cuando usuario introduzca algo diferente. El bucle se deberá realizar 
        mediante do whilePara el número aleatorio hay varias opciones:(int)
        (Math.random()*10);Math.random() devuelve un double mayor o igual a  0 
        y  menor que 1 si multiplicas por 10 tienes entonces mayor igual a 0 y 
        menor que 10. Si hacemos cast a int: (int) truncamos el número y tenemos 
        un número entero de 0 a 9 ( ambos inclusive */
        Scanner sc = new Scanner(System.in);
        int a;
        char letra;
        do{
            a = (int)(Math.random()*10+10); //Por 10 para los números entre 0 y 9, y +10 para sumarle 10. Es decr: 9+10 = 19
            System.out.println("El número es "+a+"\n¿Mostrar otro?");
            letra = sc.nextLine().charAt(0);
        }while(letra == 'c' || letra == 'C');
    }
}
 // Math.random()*(b - a) + a