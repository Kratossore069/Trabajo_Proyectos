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
public class Prct16 {
    /*Práctica 16: Crear un diccionario de español/inglés. Se deberán registrar al menos 10
palabras en español y su traducción en inglés. Se deberá realizar con un HashMap y con un
TreeMap. Recorrer en ambos casos la estructura completa y mostrar en pantalla Hacer una
captura de pantalla de cada una de las ejecuciones ¿ alguno se muestra ordenado ?*/
    
    public static void main(String[] args) {
        
        
        HashMap<String, String> diccionarioCatellano = new HashMap<String, String>();
        
        diccionarioCatellano.put("Coche", "Car");
        diccionarioCatellano.put("Rojo", "Red");
        diccionarioCatellano.put("Blue", "Azul");
        
        for(String palabra : diccionarioCatellano.keySet()){
            System.out.println(palabra + " "+diccionarioCatellano.get(palabra));
        }
        System.out.println("");
        //String entrada = "Blue";
        
        TreeMap<String, String> diccionario2 = new TreeMap<String, String>(diccionarioCatellano);
        
        for(String palabra : diccionario2.keySet()){
            System.out.println(palabra + " "+diccionario2.get(palabra));
        }
        
        
        
        /*HashMap<String, String> diccionarioIngles = new HashMap<String, String>();
        
        for(Object castellano : diccionarioCatellano.keySet()){ //Conjunto de claves.
            diccionarioIngles.put(diccionarioCatellano.get(castellano), castellano);
        }
        
        System.out.println(diccionarioIngles.get("blue"));
        
        System.out.println(diccionarioCatellano.get(entrada));
        
        for(String values : diccionarioCatellano.values()){
            
        }*/
        
    }
}
