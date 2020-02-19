/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Animal extends SerVivo{

    @Override
    void alimentarse() {
        System.out.println("Carnívoro ó herbívoro");
    }
    
}
