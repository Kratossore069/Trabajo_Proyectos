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

class MatrizCuadrada{
    
    private int filas;
    private int columnas;
    private int array[];
    
    public MatrizCuadrada(int filas, int columnas){
        filas = this.filas;
        columnas = this.columnas;
        array = new int[filas*columnas];
    }
    
    public MatrizCuadrada suma(MatrizCuadrada a){ //No está bien.
        array += a;
    }
    
}

public class Prct06 {
    /*Práctica 6: Emular la suma de dos matrices. Se creará una clase: MatrizCuadrada con un
constructor que reciba el tamaño en filas de la matriz, digamos: n. Entonces el constructor
establece como atributo un array de n*n
Se deberá crear un método llamado:
MatrizCuadrada suma(MatrizCuadrada) que sirve para hacer la suma de dos matrices
devolviendo la matriz suma ( la suma de dos matrices es una nueva matriz donde cada
compotenente es la suma de las componentes*/

    
}
