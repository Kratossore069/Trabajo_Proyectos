/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Arrays;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class ArrayDinamico {

    //Atributos
    private int array[];
    private int tamanio;

    //Constructores
    public ArrayDinamico() {
        array = new int[16];
        tamanio = 0;
    }


    //Métodos
    public boolean add(int element) {
        array[tamanio++] = element;
        return true;
    }
    
    public void mostrar(){
        Arrays.sort(array); //Ordenamos el array.
        for(int a : array){
            if(a!=0){ //Evitamos ver los 0 que se agregan.
                System.out.print(a+" ");
            }
        }
    }
    
    //Main
    public static void main(String[] args) {
        ArrayDinamico array = new ArrayDinamico();
        
        array.add(900);
        array.add(45);
        array.add(68);
        array.add(23);
        
        array.mostrar();
        System.out.println(""); // Salto de línea.
    }
}
