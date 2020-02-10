/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainCuenta {
    
    
    public static void main(String[] args) {
        Movimiento move = new Movimiento();
        Scanner sc = new Scanner(System.in);
        Date fecha;
    
        System.out.println("Bienvenido a su banco, ¿qué desea hacer?");
        int opcion, dinero;
        String asunto="";
        
        do{
            System.out.println("1)Ingresar dinero\n2)Retirar dinero\n3)Consultar movimientos\n4)Salir");
            System.out.println("");
            opcion=sc.nextInt();sc.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Dinero a ingresar: ");
                    dinero = sc.nextInt();sc.nextLine();
                    System.out.println("Asunto del ingreso");
                    asunto = sc.nextLine();
                    move.ingresarDinero(dinero);
                    move.asunto(asunto);
                    move.fecha(new Date());
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("Dinero a retirar: ");
                    dinero = sc.nextInt();sc.nextLine();
                    System.out.println("Asunto del retiro");
                    asunto = sc.nextLine();
                    move.sacarDinero(dinero);
                    move.asunto(asunto);
                    move.fecha(new Date());
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.println("MOVIMIENTOS");
                    move.mostrar();
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("Saliendo de tu banco...");
                    break;
                    
                default:
                    System.out.println("No hay "+opcion+" opciones.");
                    break;
            }
            
        }while(opcion!=4);
    }
}
