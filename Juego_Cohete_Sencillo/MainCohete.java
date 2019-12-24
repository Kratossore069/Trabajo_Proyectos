/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainCohete {
    public static void main(String[] args) {
        Cohete lanzadera = new Cohete("El Víctor");
        
        lanzadera.ponerFuselaje(false);
        lanzadera.verCohetes(1);
        lanzadera.verTripulantes(3);
        System.out.println("");
        
        lanzadera.despegar();
    }
}
