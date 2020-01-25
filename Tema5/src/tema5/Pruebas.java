/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Random;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Pruebas {
    public static void main(String[] args) {
        Random rd = new Random();
        int ale = rd.nextInt(6);
        System.out.println(ale);
    }
}
