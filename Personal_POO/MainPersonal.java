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
public class MainPersonal {
    
    public static void main(String[] args) {
        
        String nombre="", ocupacion="";
        int salario;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted es el director general de una sucursal\n¿Cuántos empleados tiene?");
        int empleados = sc.nextInt();sc.nextLine();
        
        Personal trabajadores[] = new Personal[empleados];
        
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println("Nombre del trabajador "+(i+1));
            nombre = sc.nextLine();
            System.out.println("Ocupación del trabajador "+(i+1));
            ocupacion = sc.nextLine();
            System.out.println("Salario del trabajador "+(i+1));
            salario = sc.nextInt();sc.nextLine();
            
            trabajadores[i] = new Personal(nombre, ocupacion, salario);
        }
        System.out.println("");
        
        int menor = Personal.salarioMenor(trabajadores);
        int mayor = Personal.salarioMayor(trabajadores);
        
        System.out.println("El trabajador con menos salario es: ");
        System.out.println(trabajadores[menor].mostrar());
        System.out.println("");
        System.out.println("El trabajador con más salario es: ");
        System.out.println(trabajadores[mayor].mostrar());
    }
    
    
}
