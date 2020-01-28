/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import javafx.util.Pair;

import java.util.ArrayList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class NewClass16 {

    public static void main(String[] args) {
        
        /*Par<String, String> mipar = new Par<String, String>("España", "Madrid");
        
        ArrayList<Par<String, String>> paises;
        
        paises = new ArrayList<Par<String, String>>();
        paises.add(mipar);
        paises.add(new Par<String, String>("Francia","París"));
        
        for (Par<String,String> paise : paises) {
            System.out.println(paise);
        }
        
       ArrayList<Par<String, Integer>> array = new ArrayList<Par<String,Integer>>(); //Longitud inicial de array.

        array.add(new Par<String,Integer>("Ana",8));
        array.add(new Par<String,Integer>("Paco",7));
        array.add(new Par<String,Integer>("Maria",9));
        /*array[0] = new ParCalificacion("Ana", 8);
        array[1] = new ParCalificacion("Paco", 7);
        array[2] = new ParCalificacion("Marta", 9);*/
        
        /*for (Par<String,Integer> elemento : array) {
            System.out.println(elemento);
        }*/
        
        
        
        Pair<Integer,String> dni = new Pair(43456563,"T");
        
        
        ArrayList<Pair<Integer,String>> listaDnis = new ArrayList< Pair<Integer,String>>();
        
        ArrayList<Pair<Integer,String>>listaDni;
        listaDni = new ArrayList<Pair<Integer,String>>();
        
        listaDni.add(dni);
        listaDni.add(new Pair<>(48459152,"T"));
        
        for (Pair<Integer, String> elemento : listaDni) {
            System.out.println(elemento);
        }
        
    }

}
