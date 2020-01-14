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
public class HundirFlota {
    
    private int filas;
    private int columnas;
    
    /**
     * 
     * @param filas
     * @param columnas 
     * @return Constructor que recibe dos datos enteros.
     */
    public HundirFlota(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
    }
    
    //Métodos
    
    
    public void mostrar(){
        for (int[] is : oceano()) {
            System.out.print(is+" ");
        }
        System.out.println("");
    }
    
    
    public int[][] oceano(){
        int[][] tablero = new int[this.filas][this.columnas];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j]=0;
            }
        }
        return tablero;
    }
    
    //Main del programa
    public static void main(String[] args) {
        HundirFlota juego = new HundirFlota(6, 6);
        
        for (int i = 0; i < juego.oceano().length; i++) {
            juego.mostrar();
        }

        
        
    }
}
