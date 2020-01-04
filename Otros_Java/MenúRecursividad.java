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
public class MenúRecursividad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        String salir = "";

        do {
            System.out.println("Menú de ejercicios\nIntroduzca su ejercicio");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    int numero = 5689;
                    String res = ej1(numero);
                    System.out.println("El número " + numero + " dado la vuelta " + res);
                    break;
                case 2:
                    int num = 523;
                    int resultado = ej2(num);
                    System.out.println("Suma del arreglo " + resultado);
                    break;
                case 3:
                    int numerillo = 8;
                    try {
                        excepciones(numerillo);
                    } catch (Exception ex) {
                        System.out.println("No se puede dividir entre 0\nEl programa va bien");
                    }
                    break;
                default:
                    System.out.println("No hay " + opcion + " opciones.");
            }
            System.out.println("¿Salir del programa?");
            salir = sc.nextLine();
        } while (!salir.equals("salir"));
    }

    public static String ej1(int num) {
        //Dar la vuelta a un número
        String res = "";
        if (num < 10) {
            res = String.valueOf(num);
        } else {
            res = String.valueOf(num % 10) + ej1(num / 10);
        }
        return res;
    }

    public static int ej2(int a) {
        //Programe un método recursivo que calcule la suma de un arreglo de números enteros.
        int res;
        if (a < 10) {
            res = a;
        } else {
            res = (a % 10) + ej2(a / 10);
        }

        return res;
    }

    public static void excepciones(int a) throws Exception {
        //Originar, a posta, un error
        int dividir = a / 0;
        if (dividir < 0 || dividir > 0) {
            throw new Exception();
        }
    }
}
