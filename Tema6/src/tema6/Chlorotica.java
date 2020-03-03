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
public class Chlorotica implements Bicho, Planta {

    public void decirHola() {
        Planta.super.decirHola();
        Bicho.super.decirHola();
    }
    
    public static void main(String[] args) {
        Chlorotica a = new Chlorotica();
        a.decirHola();
    }
}
