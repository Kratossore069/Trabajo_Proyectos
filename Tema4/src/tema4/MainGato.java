/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor_Gabriel_Carvajal_Aróstegui
 */
public class MainGato {
    public static void main(String[] args) {
        Gato gato = new Gato("Félix", "Egipcio", 2300);
        
        gato.mostrar();
        String verificoNombre = gato.setNombre("Baltasar");
        System.out.println(verificoNombre);
    }
}
