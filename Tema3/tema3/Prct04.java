/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;

public class Prct04 {
    /*Práctica 4
    Crear un método llamado numeroValido(). El usuario debe introducir un 
    número entre 20 y 50 y ser múltiplo de 3.  El main() del programa*/
    
    static boolean numeroValido(int a){
        boolean resul = true;
        if(a<20 || a>50){
            resul=false;
        }else if(a % 3 == 0){
            resul = true;
        }else{
            resul = false;
        }
        return resul;
    }
    
    public static void main(String[] args) {
       int num;
       Scanner cin = new Scanner(System.in);
       do{
           System.out.println("Introducir un número: ");
           num = cin.nextInt();
       }while( !numeroValido(num) );
       System.out.println("El número cumple los requisitos. Se puede continuar");
    }
}
