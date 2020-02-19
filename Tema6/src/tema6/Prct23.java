/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct23 {

    /*
    Práctica 23: Crear un ArrayList con objetos Jugador (práctica 16) y ordenarlos utilizando
    una clase anónima que implemente Comparator<Jugador> la comparación será mediante el
    atributo partidosJugados
     */

    public static void main(String[] args) {

        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        
        jugadores.add(new Jugador("Pep","Guardiola",30,30,30));
        jugadores.add(new Jugador("Pep","Guardio",30,40,30));
        jugadores.add(new Jugador("Pep","Guar",30,50,30));
        jugadores.add(new Jugador("Pep","Guardi",30,60,30));
        
            Comparator<Jugador> cm = new Comparator<Jugador>() {
                @Override
                public int compare(Jugador o1, Jugador o2) {
                    return Integer.compare(o1.partidosJugados, o2.partidosJugados);
                }
            };

        Collections.sort(jugadores, cm);
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore.partidosJugados);
        }
        
        System.out.println(jugadores);
        
    }
}
