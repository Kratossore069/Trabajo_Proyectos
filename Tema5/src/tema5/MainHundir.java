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
        
        System.out.println("\tINSTRUCCIONES\n0 es agua\n1 es un barco\n9 es un disparo\n");
        
        System.out.println("\tPOSICIONAMIENTO DE BARCOS\n");
        //Añadir barcos.
        juego.addBarco(5, 2);
        juego.addBarco(4, 4);
        juego.addBarco(5, 2);
        
        //Eliminar barcos.
        
        System.out.println("\n\tDISPAROS EFECTUADOS\n"); 
        //Disparos.
        juego.disparo(4, 4);
        juego.disparo(5, 1);
        
        System.out.println("\n\tTABLERO\n");
        //Mostrar el tablero.
        juego.mostrarTablero();
        
    }
}
