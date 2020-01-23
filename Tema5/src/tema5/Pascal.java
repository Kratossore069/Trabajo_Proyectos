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
public class Pascal {
    public static void main(String[] args) {
        int columnas = 10;
        for(int i =0;i<columnas;i++) {

            int esquinas = 1;

            System.out.format("%"+(columnas-i)*2+"s",""); //Format es una opción alternativa a println.
            for(int j=0;j<=i;j++) {
                System.out.format("%4d",esquinas);
                esquinas = esquinas * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
