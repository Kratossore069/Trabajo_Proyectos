/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct34 {
    boolean adultos = personas.stream()
                //.anyMatch(p->p instanceof Mujer)
                .noneMatch(p -> p.pesoEnKg < 50);
        
        System.out.println(adultos);
}
