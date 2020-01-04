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
public class prct33 {
    public static void main(String[] args){
        /*Práctica 33
        :  Se pretende imitar el comportamiento de un sistema de control por pin. El 
        usuario tiene 3 intentos para acertar con el pin, cada vez de esos tres intentos que falle se le 
        informa y se le dice el número de intentos que le queda. Si acierta se le muestra un mensaje 
        que diga: “El código es correcto. Bienvenido” Si no acierta en los tres intentos el programa 
        termina
        Hacer 3 versiones de este código una con while, otra con do while y finalmente for*/
        
        System.out.println("INSERTE EL PIN CORRESPONDIENTE DE TRES NÚMEROS.\nHecho con while");
        int pin = 777, intentos = 1;
        Scanner sc = new Scanner (System.in);
        
        while(intentos<=3){
            System.out.println("Intento número "+intentos);
            pin = sc.nextInt();
            if(pin==777){
                System.out.println("El código es correcto. Bienvenido.");
                break;
            }
            intentos += 1;
        }
        if(intentos == 4){
            System.out.println("Lo siento, se acabaron los intentos.");
        }
        intentos = 1;
        
        System.out.println("HECHO CON DO WHILE");
        
        do{
            System.out.println("Intento número "+intentos);
            pin = sc.nextInt();
            if(pin==777){
                System.out.println("El código es correcto. Bienvenido.");
                break;
            }
            intentos++;
        }while(intentos <= 3);
        if(intentos == 4){
            System.out.println("Lo siento, se acabaron los intentos.");
        }
        intentos = 1;
        
        System.out.println("HECHO CON BUCLE FOR");
        int i;
        
        for(i = intentos; i<=3; i++){
            System.out.println("Intento número "+i);
            pin = sc.nextInt();
            if(pin==777){
                System.out.println("El código es correcto. Bienvenido.");
                break;
            }
        }
        if(i == 4){
            System.out.println("Lo siento, se acabaron los intentos.");
        }
        
    }
}
