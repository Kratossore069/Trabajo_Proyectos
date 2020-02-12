/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.ArrayList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct18 {

    /*
    Práctica 18: Práctica de autoaprendizaje: Buscar información sobre las 3 estructuras que
acabamos de nombrar. Mostrar algún ejemplo respecto a los métodos: addAll(),
removeAll(), retainAll() y práctica 19 es igual
     */
    public static void main(String[] args) {

        System.out.println("HashSet, LinkedSHashSet, TreeSet");

        System.out.println("PRUEBA CON addAll()\n");

        // Creamos un array vacío de enteros de capacidad 5. 
        ArrayList<Integer> arrlist1
                = new ArrayList<Integer>(5);

        // Añadimos elementos a la lista 
        arrlist1.add(12);
        arrlist1.add(20);
        arrlist1.add(45);

        // Mostramos los resultados 
        System.out.println("Printing list1:");
        for (Integer number : arrlist1) {
            System.out.println("Number = " + number);
        }

        // Creamos un segundo array igual que el otro 
        ArrayList<Integer> arrlist2
                = new ArrayList<Integer>(5);

        // Volvemos a insertar números 
        arrlist2.add(25);
        arrlist2.add(30);
        arrlist2.add(31);
        arrlist2.add(35);

        // Volvemos a mostrar los resultados 
        System.out.println("Printing list2:");
        for (Integer number : arrlist2) {
            System.out.println("Number = " + number);
        }

        // Insertamos todos los números para que se muestre el array2 después del primero 
        arrlist1.addAll(arrlist2);

        System.out.println("Printing all the elements");
        // Resultado
        for (Integer number : arrlist1) {
            System.out.println("Number = " + number);
        }

        System.out.println("");

        System.out.println("PRUEBA CON removeAll()\n");

        //Ahora eliminamos todos los números del array1
        arrlist1.removeAll(arrlist2);

        //Lo mostramos
        for (Integer numeros : arrlist1) {
            System.out.println("Number = " + numeros);
        }

        System.out.println("");

        System.out.println("PRUEBA CON retainAll()\n");
        
        //retainAll() compara dos series por referencia si no los encuentra
        arrlist1.retainAll(arrlist2);
        
        //Observamos
        for (Integer lista : arrlist1) {
            System.out.println("Number = " + lista);
        }
    }
}
