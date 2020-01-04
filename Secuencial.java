/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Secuencial {
    public static void main(String[] args) {
        
        int[] arreglo = {4,6,5,2,3};
        int dato;
        boolean chivato = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Número a buscar")); //Pide de manera gráfica un número y lo transforma a int
        
        int i=0;
        while(i<arreglo.length && chivato == false){
            if(arreglo[i]==dato){
                chivato = true;
            }
            i++; //Continúa el bloque un valor más del que se encontró el dato
        }
        
        if(chivato==false){
            JOptionPane.showMessageDialog(null, "El número "+dato+" no está en el arreglo.");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha encontrado el valor "+dato+" en la posición "+(i-1)); //i-1 debido a que saldrá un valor más de la posición encontrada
        }
    }
}
