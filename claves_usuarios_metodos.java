/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video18;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class equals {
    public static void main(String[] args){
        // Verificar nombres iguales.
        
        System.out.println("Introduzca el primer nombre.");
        Scanner sc = new Scanner(System.in);
        String nom1 = sc.nextLine();
        System.out.println("Introduzca el segundo nombre.");
        String nom2 = sc.nextLine();
        
        if(nom1.equals(nom2)==true){
            System.out.println("Los dos nombres son iguales");
        }else{
            System.out.println(nom1+" y "+nom2+" no son iguales.");
        }
        
        //Realizar un inicio de sesión.
        
        System.out.println("Introduzca el usuario: ");
        String usuario = "Víctor";
        String user = sc.nextLine();
        System.out.println("Introduza la contraseña: ");
        String contrasena = "123123";
        String pass = sc.nextLine();
        
        while(pass.equals(contrasena)==false && user.equals(usuario)==false){
            System.out.println("Inicio incorrecto");
            System.out.println("Usuario");
            user = sc.nextLine();
            System.out.println("Clave");
            pass = sc.nextLine();
        }
        
        System.out.println("Inicio de sesión correcto.");
        
        // Ejercicio de cadenas
        
        System.out.println("Inserte una palabra.");
        String palabra = sc.nextLine();
        System.out.println("Su palabra "+palabra+" tiene "+palabra.length()+" caracteres.");
        System.out.println("¿Qué parte de la palabra desea obtener?");
        int numero = sc.nextInt();
        System.out.println("Usted ha elegido "+palabra.substring(numero));
    }
}
