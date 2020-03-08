/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslambdasstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author carlos
 */
class Pablo {

    public static void metodo(Object elemento) {
        System.out.println("Pablo " + elemento);
    }
}

public class EjerciciosLambdasStream {

    /**
     * @param args the command line arguments
     */
    static double contador = 0;

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Hombre("Carlo", "Fernández", 23, 210, 75));
        personas.add(new Mujer("Marta", "Díaz", 25, 205, 55));
        personas.add(new Hombre("Luis", "Fernández", 20, 210, 70));
        personas.add(new Mujer("Ana", "Díaz", 23, 170, 65));
        personas.add(new Hombre("Armando", "San Miguel", 29, 175, 77));
        personas.add(new Hombre("Ramiro", "Sánchez", 32, 200, 72));
        personas.add(new Mujer("Alba", "Álvarez", 25, 62, 55));
        personas.add(new Hombre("Marco", "Polo", 28, 174, 73));
        personas.add(new Mujer("Mar", "Pérez", 23, 161, 58));
        personas.add(new Hombre("Silva", "San Miguel", 21, 169, 68));

        //Obtener los nombres de las personas con nombres de 7 caracteres ordenado por edad.
        ArrayList<String> resultados;
        resultados = (ArrayList) personas.stream().filter(x -> x.getNombre().length() < 5)
                .sorted((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()))
                .map(p -> p.getNombre())
                .collect(Collectors.toList());

        System.out.println(resultados);

        personas.stream()
                //.map(p->p.getNombre())
                .forEach(Pablo::metodo);

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> lista = numeros.stream()
                .filter(n -> {
                    System.out.println("filtrando " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("mapping " + n);
                    return n * n;
                })
                .limit(2)
                .findFirst();
                //.collect(toList());
                
                System.out.println(lista.get());
        /*

Práctica 40: Mostrar las 3 personas de más edad
Práctica 41: Mostrar las personas que tienen menos peso que el que le corresponde
Práctica 42: Mostrar una persona de 27 años si hay alguna
Práctica 43: Crear un arraylist de hombres con un elemento hombre por cada persona del
array original
Práctica 44: Calcular el peso medio de las mujeres del arraylist
Práctica 45: Mostrar las personas que tienen más edad que la media
Práctica 46: Mostrar por cada persona cuántas personas tienen su misma edad
Práctica 47: Obtener el imc mínimo ( el número ) y mostrar por cada persona su imc
Práctica 48: Crear un arraylist con las mujeres, y obtener la edad media de los hombres
        
Práctica 49: Crear un arraylist con textos que indiquen por cada persona su nombre, sexo
y edad: "Ana, mujer: 23años" . Este array quedará ordenado por peso
Práctica 50: Mostrar la persona adulta más joven ( se entiende por adulto >= 18años)
Práctica 51: obtener la persona que se aleja más de su peso ideal ( observar que esto puede
ser tanto por mucho peso como por poco peso )
Práctica 52: Crear un arraylist con los hombres ordenados de menor a mayor peso al
principio del array y luego las mujeres con el mismo criterio
Práctica 53: Mostrar las mujeres que son más altas que los hombres        

Práctica 54: Obtener un arraylist de String donde cada letra de los diferentes nombres de
las personas sea un elemento del arraylist. Para esto usaremos flatMap() y la instrucción:
Arrays.stream(p.nombre.split(""))
observar que mediante String.split(“”) obtenemos un array de String con todos los
caracteres separados. Mediante Arrays.stream() convertimos un array en un stream    

         */
    }

}
