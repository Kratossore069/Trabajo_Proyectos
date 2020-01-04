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
public class Clonarelarray {
    
    public static int[] clonar(int array[]){
        int copia[] = new int[array.length];
        for(int i = 0; i<array.length; i++){
            copia[i] = array[i];
        }
        return copia;
    }
    
    public static void main(String[] args) {
        int array[] = new int[5];
        
        int copia[] = clonar(array);
    }
}
