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
import java.util.Random;
public class prct43 {
    public static void main(String[] args){
        /*Práctica 43
        :  Escribir un programa donde se genera un número secreto mayor o igual a 1 y
        menor o igual a 99 El jugador intentará acertar el número si se equivoca el programa le
        informa de si el número secreto es mayor o menor que el que él ha introducido. El
        programa finaliza cuando el jugador acierte en cuyo caso se le mostrará elnúmero de
        intentos que ha necesitado para acertar.
        Nota: se puede utilizar Random para el número aleatorio:
        Random rnd = new Random();
        rnd.nextInt(30); //genera un aleatorio desde 0 hasta 29*/
        
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int suerte = rnd.nextInt(99)+1, intentos=1;
        System.out.println("Inserte un número para probar su suerte -> ");
        int num = sc.nextInt();
        
        while(num != suerte){
            System.out.println("Pruebe otra vez. Intento número: "+intentos);
            if(num>suerte){
                System.out.println("Ha introducido un número mayor.");
            }else if(num<suerte){
                System.out.println("Ha introducido un número menor.");
            }
            num = sc.nextInt();
            intentos++;
        }
        System.out.println("Felicidades, tras "+intentos+" intentos, ha acertado el número.");
    }
}
