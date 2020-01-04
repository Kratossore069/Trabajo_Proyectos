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
public class prct22 {
    public static void main(String[] args) {
        /*Práctica 22:  Hacer un programa que haga uso de estructuras 
        if else if para que dado un número entero x muestre en pantalla:
        - x es menor de 0
        - x es igual a 0
        - x es mayor que 0 y menor que 10
        - x es igual a 10
        - x es mayor que 10 y menor que 20
        - x es mayor o igual a 20*/
        
        System.out.println("Número -> ");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        
        if(x<0){
            System.out.println(x+" Menor que 0.");
        }else if(x==0){
            System.out.println(x+" El número es 0.");
        }else if((x>0)&&(x<10)){
            System.out.println(x+" Mayor que 0 y enor que 10.");
        }else if(x==10){
            System.out.println(x+" Igual que 10.");
        }else if((x>10)&&(x<20)){
            System.out.println(x+" Mayor que 10 y menor que 20.");
        }else{
            System.out.println(x+" El número es mayor o igual a 20");
        }
    }
}
