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
   /* Práctica 7: Tarea de autoaprendizaje: Investiga un poco sobre StringBuilder toma una
cadena de texto y haz uso de los métodos: delete(), append(), insert(), replace() debes
mostrar casos en los que es útil el uso de esos métodos y como usarlos.*/
    
    public static void main(String[] args) {
        
        System.out.println("Tiempo con Builder");
        
        long tiempoInicio = System.nanoTime();
        
        StringBuilder texto2 = new StringBuilder();
        StringBuilder texto3 = new StringBuilder("Buenas tardes");
        StringBuilder texto4 = new StringBuilder("Hola ");
        StringBuilder texto5 = new StringBuilder("Bienvenidos a esta práctica");
        
        texto2.append("Hola ").append(" soy ").append(" Víctor."); //Añade más líneas
        texto3.delete(2, 6); //Elimina caracteres
        texto4.insert(4, "amigos míos"); //Inserta a partir de cierto carácter la frase
        texto5.replace(0, 4, "Reemplazado"); //Reemplaza una cadena de texto en ciertos caractéres
        
        System.out.println(texto2.toString());
        System.out.println(texto3);
        System.out.println(texto4);
        System.out.println(texto5);
        
        long tiempoFinal = System.nanoTime();
        
        long tiempoBuilder = (tiempoFinal - tiempoInicio);
        System.out.println("Tiempo: "+(int)tiempoBuilder);
        
        
    }
    
    
}
