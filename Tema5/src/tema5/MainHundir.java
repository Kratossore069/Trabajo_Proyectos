/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainHundir {
     //Main del programa
    public static void main(String[] args) {
        
        HundirFlota juego = new HundirFlota(6);
        
        juego.addBarco(5, 2);
        juego.addBarco(4, 4);
        
        juego.disparo(4, 4);
        juego.disparo(5, 1);
        juego.mostrarTablero();
        
    }
}
