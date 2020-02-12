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
public class Prct07 {
    /*Práctica 7: Tarea de autoaprendizaje: Investiga un poco sobre StringBuilder toma una
cadena de texto y haz uso de los métodos: delete(), append(), insert(), replace() debes
mostrar casos en los que es útil el uso de esos métodos y como usarlos.*/
    
    public static void main(String[] args) {
        
        String palindrome = "Dot saw I was Tod";
         
        StringBuilder sb = new StringBuilder(palindrome);
        
        //Delete
        
        sb.delete(10,20); //Elimina la cadena desde la pos 10 hsata el final
        
        System.out.println(sb);
        
        //Append
        
    }
}
