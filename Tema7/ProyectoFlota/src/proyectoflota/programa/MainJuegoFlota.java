/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoflota.programa;

import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainJuegoFlota {

    public static void main(String[] args) {

        HundirLaFlotaClases juego = new HundirLaFlotaClases();

        int eleccion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("GANA EL PRIMERO QUE CONSIGA 3 PUNTOS A SU FAVOR.");
            System.out.println("0)Instrucciones\n1) Colocar barcos\n2) Disparar\n3) Ver tablero y puntos\n4) Salir del juego.");
            eleccion = sc.nextInt();
            sc.nextLine();
            switch (eleccion) {
                case 0:
                    System.out.println("0 es agua\n1,2 ó 3 es un barco\n7 es un barco enemigo\n8 es un disparo del jugador\n9 es un disparo de la máquina");
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("Debe colocar mínimo 3 barcos antes de empezar a disparar.");
                    int i = 0;
                    while (i < 3) {
                        juego.addBarcos();
                        System.out.println("");
                        juego.ordenadorAddBarco();
                        System.out.println("");
                        i++;
                    }
                    break;
                case 2:
                    juego.disparar();
                    System.out.println("");
                    juego.ordenadorDisparo();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("El tablero es de 10 y está así; ");
                    juego.mostrarTablero();
                    System.out.println("");
                    juego.puntos();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("No hay " + eleccion + " elecciones.");
                    System.out.println("");
                    break;
            }
            
            juego.ganador();

        } while (eleccion != 4);
    }
}
