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






public class Prct18 {

    /*
    Práctica 18: Implementar en Persona correctamente los tres métodos de Ordenable
    mediante compareTo() . Utilizar el siguiente pequeño programa para probarlo:
     */

    public static void main(String[] args) {
        ORdenable elemento1 = new Hombre("unnom", "unape", "otro", 25, 178, 75);
        ORdenable elemento2 = new Mujer("otronom", "ape1", "ape2", 20, 165, 60);
        if (elemento1.esMayorQue(elemento2)) {
            System.out.println("elemento1 es mayor que elemento2");
        } else {
            System.out.println("elemento1 no es mayor que elemento2");
        }
    }
}
