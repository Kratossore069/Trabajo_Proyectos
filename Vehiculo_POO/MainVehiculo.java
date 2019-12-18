/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;
import java.util.Scanner;
/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainVehiculo {
    /*Ejercicio 3: Construir un programa que dada una serie de vehículos 
    caracterizados por su marca, modelo y precio, imprima las propiedades 
    del vehículo más barato. Para ello, se deberán leer por teclado las 
    características de cada vehículo y crear una clase que represente 
    a cada uno de ellos.*/
    
    public static void main(String[] args) {
        
        String modelo, marca;
        float precio;
        int coches;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Número de coches?");
        coches = sc.nextInt();sc.nextLine();
        
        Vehiculo cochitos[] = new Vehiculo[coches];
        
        for (int i = 0; i < cochitos.length; i++) {
            System.out.println("Modelo del coche "+(i+1));
            modelo = sc.nextLine();
            System.out.println("Marca del coche "+(i+1));
            marca = sc.nextLine();
            System.out.println("Precio del coche "+(i+1));
            precio = sc.nextFloat();sc.nextLine();
            
            cochitos[i]= new Vehiculo(modelo, marca, precio);
        }
        
        int baratoIndice = Vehiculo.masBarato(cochitos);
        System.out.println("El coche más barato es: ");
        System.out.println(cochitos[baratoIndice].mostrar());
    }
}
