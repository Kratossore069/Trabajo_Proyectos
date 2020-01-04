/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author victor
 */
import java.util.Scanner;

public class Arraymenordeedad {

    public static void main(String[] args) {
        //Crea un método por el que se pasen edades en un array y se decida la edad.

        System.out.println("Número de estudiantes");
        Scanner sc = new Scanner(System.in);
        int alumnos = sc.nextInt();
        int chavales[] = new int[alumnos];

        try {
            for (int i = 0; i < chavales.length; i++) {
                System.out.println("Edad del alumno número " + (i + 1));
                chavales[i] = sc.nextInt();
            }

            menoresymayores(chavales);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Sistema de ordenación de edades diseñado por Víctor");
        }

    }

    public static void menoresymayores(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 18) {
                System.out.println("Este alumno tiene " + a[i] + " así que es menor de edad.");
            } else if (a[i] >= 50) {
                System.out.println("El alumno que tiene " + a[i] + " es demasiado mayor para estar en el colegio.");
            } else {
                System.out.println("El alumno con " + a[i] + " es mayor de edad.");
            }
        }
    }
}
