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
        System.out.println("Welcome");
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
        }
    }

}
