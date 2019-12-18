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

/*Ejercicio 3: Construir un programa que dada una serie de vehículos 
caracterizados por su marca, modelo y precio, imprima las propiedades 
del vehículo más barato. Para ello, se deberán leer por teclado las 
características de cada vehículo y crear una clase que represente 
a cada uno de ellos.*/

public class Vehiculo {

    
    
    //Atributos
    private float precio;
    private String modelo;
    private String marca;
    
    //Constructores
    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //Métodos
    public static int masBarato(Vehiculo cochitos[]){
        float precio;
        int indice=0;
        precio = cochitos[0].getPrecio();
        for (int i = 1; i < cochitos.length; i++) {
            if(cochitos[i].getPrecio()<precio){
                precio = cochitos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    public String mostrar(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio;
    }
    
    //Getter Y Setter
    public float getPrecio() {
        return precio;
    }
    
    
    
}
