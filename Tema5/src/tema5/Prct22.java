/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

class Partido{
    
    private int votos;
    private String nombre;
    private ArrayList<TreeMap<String, Integer>> politicos;
    
    public Partido(){
        politicos = new ArrayList<TreeMap<String, Integer>>();
    }
    
    public void insertarNombre(String a, int b){
        politicos.add(a,b);
    }

    @Override
    public String toString() {
        String res="";
        for (Object gente : politicos) {
            System.out.println(gente);
        }
        return "";
    }
    
    //Elijo el TreeMap debido a que es ordenador aunque vaya más lento que el HashMap
    
    
    
    
}


public class Prct22 {
    /*
    Práctica 22: El usuario debe ir introduciendo el nombre de cada partido político y el
número de votos que ha tenido. Después se le mostrará un menú donde puede elegir
introducir el nombre de un partido y que le muestre los votos que ha tenido. Así como
introducir un límite inferior de votos y uno superior para que se le muestren los partidos y
los votos que han tenido que estén dentro de los límites. Utilizar la estructura dinámica más
apropiada para este caso. Justificar su elección entre comentarios
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Partido partido = new Partido();
        int opcion;
        
        do{
        
        System.out.println("Nombre del partido");
        String nombre = sc.nextLine();
        
        System.out.println("Votos de ese partido");
        int votos = sc.nextInt();sc.nextLine();
        
        partido.insertarNombre(nombre,votos);
        
        System.out.println("¿Salir con un 4?");
        opcion = sc.nextInt();sc.nextLine();
        
        }while(opcion!=4);
        
        partido.toString();
    }
}
