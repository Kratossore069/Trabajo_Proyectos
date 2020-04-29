/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoflota.programa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class HundirLaFlotaClases {

    private int[][] array;
    private int puntosJugador;
    private int puntosMaquina;

    public HundirLaFlotaClases() {
        array = new int[4][4];
        puntosJugador=0;
        puntosMaquina=0;
    }

    public void mostrarTablero() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" "+array[i][j] + " ");

            }
            System.out.println("");
        }
    }

    public void addBarcos() {
        System.out.println("Se colocará un 1, 2 ó 3 como barco insertado según sus dimensiones.");
        System.out.println("¿Cómo de grande es el barco? De 1 a 3.");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();sc.nextLine();
        int x, y,i;
        switch(opcion){
            case 1:
                System.out.println("Punto X: ");
                x = sc.nextInt();
                System.out.println("Punto Y: ");
                y = sc.nextInt();
                this.array[x][y]=1;
                break;
            case 2:
                i = 0;
                do{
                System.out.println("Punto X: ");
                x = sc.nextInt();
                System.out.println("Punto Y: ");
                y = sc.nextInt();
                this.array[x][y]=2;
                i++;
                }while(i<2);
                break;
            case 3:
                i = 0;
                do{
                System.out.println("Punto X: ");
                x = sc.nextInt();
                System.out.println("Punto Y: ");
                y = sc.nextInt();
                this.array[x][y]=3;
                i++;
                }while(i<3);
                break;
            default:
                System.out.println("No hay "+opcion+" opciones.");
                break;
        }
        

    }

    public void ordenadorAddBarco() {
        System.out.println("Se ha posicionado un barco enemigo.");
        Random rd = new Random();
        this.array[rd.nextInt(10)][rd.nextInt(10)] = 7;

    }
    
    public void disparar(){
        System.out.println("El número 8 representa tu disparo.");
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("En X: ");
        x = sc.nextInt();
        sc.nextLine();
        System.out.println("En Y: ");
        y = sc.nextInt();
        sc.nextLine();
        if(this.array[x][y]==7){
            this.puntosJugador++;
            System.out.println("Jugador suma un punto porque ha dado a un barco enemigo.");
            this.array[x][y]=8;
        }else{
            this.array[x][y]=8;
        }
        
    }
    
    public void ordenadorDisparo() {
        System.out.println("El enemigo ha disparado. Saldrá con un 9.");
        Random rd = new Random();
        int tiro1, tiro2;
        tiro1 = rd.nextInt(10);
        tiro2 = rd.nextInt(10);
        if((this.array[tiro1][tiro2]==1)||(this.array[tiro1][tiro2]==2)||(this.array[tiro1][tiro2]==3)){
            this.puntosMaquina++;
            System.out.println("IA suma un punto porque ha dado a un barco del jugador.");
            this.array[tiro1][tiro2]=9;
        }else{
            this.array[tiro1][tiro2]=9;
        }
        

    }
    
    public void puntos(){
        System.out.println("Puntos del jugador: "+this.puntosJugador);
        System.out.println("Puntos de la máquina: "+this.puntosMaquina);
        
    }
    
    public void ganador(){
        
        if(this.puntosJugador==3){
            System.out.println("==================================================");
            System.out.println("GANA JUGADOR");
            System.out.println("==================================================");
        }else if(this.puntosMaquina==3){
            System.out.println("==================================================");
            System.out.println("GANA MÁQUINA");
            System.out.println("==================================================");
        }
        
    }

}
