/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class TutorialMapPair {

    public static void main(String[] args) {

        HashMap<String, Integer> cosas = new HashMap<String, Integer>();

        cosas.put("Víctor", 25);
        cosas.put("Patri", 22);
        cosas.put("Néstor", 26);
        cosas.put("Dani", 27);

        for (String datos : cosas.keySet()) {
            System.out.println("Nombre: " + datos + " => Edad: " + cosas.get(datos));
        }
        System.out.println("");

        ArrayList<Pair<String, Double>> personas = new ArrayList<Pair<String, Double>>();

        Scanner sc = new Scanner(System.in);

        String salir = "", cliente = "";
        double peso;
        int i = 1;

        do {

            System.out.println("Nombre de cliente " + i);
            cliente = sc.nextLine();
            
            if (cliente.equals("salir")) {
                
                System.out.println("Terminado...");
                
            } else {
                
                System.out.println("Peso del cliente " + i);
                
                peso = sc.nextDouble();
                
                sc.nextLine();
                
                personas.add(new Pair<String, Double>(cliente,peso));
                i++;
            }

        } while (!cliente.equals("salir"));
        
        for (Pair<String, Double> clientes : personas) {
            System.out.println(clientes);
        }
    }
}
