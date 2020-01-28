/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;
import javafx.util.Pair;
import java.util.ArrayList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Refrescos {

    public static void main(String[] args) {
       /* System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair<String, Float>> refrescos = new ArrayList<Pair<String, Float>>();
        String nombre="";

        do {
            System.out.println("Nombre bebeida");
            nombre = sc.nextLine();
            if (nombre.equals("fin")==false) {
                System.out.println("Peso");
                Float peso = sc.nextFloat();
                sc.nextLine();

                refrescos.add(new Pair<String, Float>(nombre, peso));
            }else{
                System.out.println("Fin");
            }

        } while (nombre.equals("fin")==false);
        
        for (Pair<String, Float> bebidas : refrescos) {
            System.out.println(bebidas);
        }*/
       
       ArrayList<Pair<String, Integer>> comidas = new ArrayList<Pair<String, Integer>>();
       
       String comida = "";
       int precio;
       Scanner sc = new Scanner(System.in);
       
       int i=0;
       do{
           System.out.println("Comida número: "+(i+1));
           comida = sc.nextLine();
           if(comida.equals("salir")){
               System.out.println("Saliendo...");
           }else{
               System.out.println("Precio: ");
               precio = sc.nextInt();sc.nextLine();
               comidas.add(new Pair<String, Integer>(comida, precio));
               i++;
           }
       }while(!comida.equals("salir"));
       
        for (Pair<String, Integer> comida1 : comidas) {
            System.out.println(comida1);
        }
    }

}
