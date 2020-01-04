/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct08 {

    public static void main(String[] args) {
        /*Práctica 8: Crear la clase Coche que tenga por atributos: String nombre, boolean
        encendido, boolean frenoDeManoPuesto, int posicion. Con un constructor que reciba el
        nombre: Coche(String n) y otro constructor que reciba el nombre y la posicion:
        Coche(String n, int p) Establecer los getter y los setter*/
        
        String escenario = "----------";

        Coche coche = new Coche("Víctor");
        
        /*String arrancar = coche.arrancar();
        
        System.out.println(arrancar);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Su coche se llama " + coche.getNombre());
        
        int opcion;
        String salir = "";

        do {
            System.out.print("Menu: \n1-Arrancar coche\n2-Apagar coche\n3-Quitar freno\n4-Poner freno\n5-Mover left\n6-Mover right\n7-Estado\nOpción ->");
            opcion = sc.nextInt();sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println(coche.arrancar());
                    break;
                case 2:
                    // System.out.println(coche.apagar());
                    break;
                case 3:
                    System.out.println(coche.subirFrenoDeMano());
                    break;
                case 4:
                    System.out.println(coche.bajarFrenoDeMano());
                    break;
                case 5:
                    System.out.println("¿Pasos?");
                    int pasos = sc.nextInt();sc.nextLine();
                    // System.out.println(coche.);
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println(coche.estado());
                    break;
            }
            
            int pos = coche.getPosicion();  //Con esto se mueve el coche y se ve por dónde va
            String nuevoEscenario = "";
            for (int i = 0; i < escenario.length(); i++) {
                if(pos == i){
                    nuevoEscenario += coche.getNombre().charAt(0);
                }else{
                    nuevoEscenario += "-";
                }
            }
            System.out.println(nuevoEscenario);
            
            System.out.println("¿Salir del juego?"); //Aquí se sale del juego
            salir = sc.nextLine();
        } while (!salir.equals("salir"));

    }
}
