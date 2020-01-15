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

    //Atributos.
    private int dimensiones;
    private int[][] array;

    //Constructores.
    /**
     *
     * @param filas
     * @param columnas
     * @return Constructor que recibe dos datos enteros.
     */
    public HundirFlota(int num) {
        this.dimensiones = num;
        array = new int[num][num];
    }

    //Métodos.
    

    /**
     * 
     * @return El tablero de juego inicializado a 0. 
     * No retorna nada, solamente inicializa a 0.
     */
    public int[][] oceano() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }
    
    /**
     * @return Muestra el tablero creado.
     */
    public void mostrarTablero(){
        //this.array = oceano();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    /**
     * 
     * @param fila
     * @param columna 
     * @return Dónde colocar el barco. Además, se visualiza 
     * el tablero con el barco puesto.
     */
    public void addBarco(int fila, int columna){
        int inicial = 1;
        this.array[fila][columna] = inicial;
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[fila][columna] = inicial;
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }*/
    }

    
}
