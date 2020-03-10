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
public class MainSingleton {
    public static void main(String[] args) {
        Singleton neno = Singleton.getInstance();
        
        System.out.println(neno.clave);
    }
}
