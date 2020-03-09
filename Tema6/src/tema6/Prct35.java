/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct35 {
    /*
    Práctica 35: Utiliza findFirst() y Optional.ifPresent() para mostrar a un Hombre llamado:
    “Luis” que debes primero agregar al arraylist personas.
    */
    
    public static void main(String[] args) {
        
        ArrayList<String> personas = new ArrayList<>();
        
        
        personas.add("Luis");
        personas.add("Pablo");
        personas.add("Topacio");
        
        
        Optional<String> answer = personas.stream().findFirst(); 
  
        if (answer.isPresent()) { 
            System.out.println(answer.get()); 
        } 
        else { 
            System.out.println("no value"); 
        } 
        
        
    }
}
