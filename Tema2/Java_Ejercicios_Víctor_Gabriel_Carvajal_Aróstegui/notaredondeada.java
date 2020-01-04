/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author Víctor
 */
public class notaredondeada {
    public static void main(String[] args) {
        double nota = 7.5;
        
        int calificacion = (nota>5)?(int)Math.round(nota):5; //Round es redondear
        
        System.out.println("Su nota es "+calificacion);
        
        if(calificacion>=5){
            System.out.println("Está aprobado");
        }else{
            System.out.println("Está suspendido, pero no puede suspender.");
        }
    }
}
