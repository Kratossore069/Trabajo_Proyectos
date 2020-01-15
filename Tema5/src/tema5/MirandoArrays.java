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
public class MirandoArrays {

    public static void main(String[] args) {

        int array[][] = new int[3][];

        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];

        for (int i = 0; i < array.length; i++) {
            int[] fila = array[i];
            for (int j = 0; j < fila.length; j++) {
                System.out.println("pos " + i + "," + j + " = " + fila[j]);

            }
            System.out.println("");

        }
    }
}
