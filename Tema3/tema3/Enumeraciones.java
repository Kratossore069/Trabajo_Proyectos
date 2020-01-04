/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Víctor
 */
public class Enumeraciones {
    public enum Futbol {PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO}
    
    public static void main(String[] args){
        int numeroJugador = 17;
        String nombreJugador = "Paco";
        
        Futbol posicion = Futbol.PORTERO;
        System.out.println(posicion);
        posicion = Futbol.DEFENSA;
        System.out.println(nombreJugador+" con número "+numeroJugador+" Nueva posición "+posicion);
    }
}
