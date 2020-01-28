/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
class Cliente {

    String nombre;
    String apellidos;
    int edad;

    public Cliente(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public boolean menordeEdad() {
        return edad < 18;
    }

}

public class Prct13 {

    public static void main(String[] args) {
        /* Práctica 13: Crear un programa para la gestión de clientes
        . Al usuario se le mostrará unmenú donde pueda elegir entre agregar nuevo cliente a la cola, atender cliente
        , ver estado dela cola
        .Crear una clase Cliente con:
        nombre, apellido
        , edad y un método
        : boolean menorDeEdad
        ()que determina si el clientes es o no menor de edad.Cuando el usuario intenta agregar unnuevo cliente al final de la cola
        , si fuera menor de edad se usa el método y no se incorpora ala cola mostrando un mensaje al usuario diciendo los datos del 
                cliente que se iba a insertaren cola y que no puede agregar a menores de edad
        . Cuando el usuario elige atender cliente se toma el próximo elemento que corresponda en 
                lacola quitándolo de la cola y se muestra en pantallaCuando el usuario escoge ver estado 
                        de la cola se le muestra el tamaño actual de la cola(método size() */

        Scanner sc = new Scanner(System.in);
        String frase = "";
        int i = 1;
        boolean finalizar = false;

        LinkedList<Cliente> lk = new LinkedList<>();

        do{
           System.out.println("1)Atender cliente\n2)Agregar cliente\n3)Estado de la cola\n4)fin\n5)Mostrar la cola."); 
           switch(sc.nextInt()){
               case 1:
                   System.out.println(lk.poll());
                   break;
               case 2:
                   System.out.print("Nombre: ");
                   String nombre = sc.nextLine();
                   System.out.print("Apellido: ");
                   String apellido = sc.nextLine();
                   System.out.print("Edad: ");
                   int edad = sc.nextInt();sc.nextLine();
                   Cliente cliente = new Cliente(nombre, apellido, edad);
                   if(!cliente.menordeEdad()){
                       lk.add(cliente);
                   }else{
                       System.out.println("No se puede.");
                   }
                   break;
               case 3:
                   System.out.println("En la cola hay "+lk.size());
                   break;
               case 4:
                   finalizar = true;
                   break;
               case 5:
                  /* for (int i = 0; i < lk.size(); i++) {
                       System.out.println(lk.get(i));
                   }*/
                   break;
           }
        }while(!finalizar);
        
        
        
    }
}
