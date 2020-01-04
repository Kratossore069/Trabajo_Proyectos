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
public class Prct17 {
     /*Práctica 17
    :  Crear un programa que reproduzca el algoritmo anterior*/

    public static void main(String[] args) {
       
        int orden[] = {5,2,12,14,8,9,11};
        /*
        int orden[] = {5, 2, 12, 14, 8, 9, 11};
        Arrays.sort(orden);
        for (int numero : orden) {
            System.out.println(numero); //De esta forma ordenamos los números de un array
        }
        */
        
        System.out.println("DE LA FORMA MATEMÁTICA A LA HORA DE ORDENARLOS: ");
        int aux=0;
        for(int j=0;j<orden.length;j++){ //Usando un método parecido a cambiar las variables
            for(int i =0;i<orden.length-1;i++){
                if(orden[i]>orden[i+1]){
                    aux=orden[i];
                    orden[i]=orden[i+1];
                    orden[i+1]=aux;
                }
                
            }
        }
        
        for(int i=0;i<orden.length;i++){ //Salen ordenados los números
            System.out.println(orden[i]);
        }
    }
}
