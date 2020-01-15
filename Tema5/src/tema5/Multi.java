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
public class Multi {
    
    public static void mostrar(int array[]){
        for (int elemento : array) {
            System.out.print(elemento+" ");
        }
        System.out.println("");
    }
    
    
    public static void main(String[] args) {
        int almacen[][]={{5,1,3,2},{9,0,7,8},{4,6,10,2}};
       /* for (int i = 0; i < almacen.length; i++) {
            mostrar(almacen[i]);
            
        }*/
       int array[] = {1,2,3,4};
        for (int[] fila : almacen) {
            for (int i = 0; i < fila.length; i++) {
                fila[i]= 1;
                
            }
        }
       
       
        /*for (int[] fila : almacen) {
            for(int elemento : fila){
                System.out.println(elemento);
            }
        }*/
    }
}
