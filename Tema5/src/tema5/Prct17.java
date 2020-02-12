/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct17 {
    /*
    Práctica 17: Tratar de introducir en la aplicación de la práctica anterior una palabra
repetida como clave con un valor distinto Mostrar en pantalla la estructura completa ¿ ha
permitido la inserción de la clave repetida ? ( tomar una captura de pantalla ) En el caso de
que no lo permitiera ¿ que valor es el que permanece ? ¿ el primero introducido o el
segundo ?
    */
    
    public static void main(String[] args) {
        
        HashMap<String, String> diccionarioCatellano = new HashMap<String, String>();
        
        diccionarioCatellano.put("Coche", "Car");
        diccionarioCatellano.put("Rojo", "Red");
        diccionarioCatellano.put("Blue", "Azul");
        diccionarioCatellano.put("Blue", "Azulito"); //Valor añadido
        
        for(String palabra : diccionarioCatellano.keySet()){
            System.out.println(palabra + " "+diccionarioCatellano.get(palabra));
        }
        System.out.println("");
        //String entrada = "Blue";
        
        TreeMap<String, String> diccionario2 = new TreeMap<String, String>(diccionarioCatellano);
        
        for(String palabra : diccionario2.keySet()){
            System.out.println(palabra + " "+diccionario2.get(palabra));
        }
        
        //A la hora de mostrar los resultados, sale por pantalla "Blue Azulito"
    }
}
