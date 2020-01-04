/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class Prct19 {
    /*Práctica 19:  Crear un programa que incluya el código 
    anterior e introducir texto en lugar de un número cuando el 
    programa lo solicite ¿ qué ocurre, hay un error ? 
    Si es así ¿ cuál es el tipo de error/excepción que se 
    desencandena ? ( tomar captura de pantalla del error 
    y escribir el tipo de la excepción que se pudiera 
    generar de haberla*/
    
    public static void main(String[] args){
        System.out.println("Dame un num");
        Scanner sc = new Scanner (System.in);
        String text = sc.nextLine();
    }
    
    public static int Stringtoint(String texto){
        return 1;
    }
}
