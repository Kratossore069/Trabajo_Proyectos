/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct08 {
    public static void main(String[] args) {
        /*Práctica 8: obtener una expresión regular que verifique si el identificador 
        introducido por elusuario se adapta al formato establecido: 
        
        Nombre-Edad-siglasdelciclo. 
        EjJuan-23-dawdonde 
        
        Nombre tiene primera letra mayúscula y resto minúscula.
       Edad: un número de 20 a 99 añossiglasdelciclo: tres letras minúsculas*/
        
        //^[A-Z][a-z]+-[2-9][0-9]-[a-z]{3}$  Ese menos siginifica que ahí hay un menos para separar. $ es final
        
        Scanner sc = new Scanner(System.in);
        
        /////////////////////////////////NOMBRE
        
        System.out.println("Introduzca nombre: ");
        
        String nombre = sc.nextLine();
        
        Pattern name = Pattern.compile("(^[A-Z][a-z]+)");
        
        Matcher nom = name.matcher(nombre);
        
        if(nom.find()){
            System.out.println("Nombre "+nombre+" bien insertado.");
        }else{
            System.out.println("Nombre mal.");
        }
        
        ///////////////////////////////////EDAD
        
        System.out.println("Introduzca edad: ");
        
        String edad = sc.nextLine();
        
        Pattern age = Pattern.compile("(^[2-9][0-9])");
        
        Matcher eda = age.matcher(edad);
        
        if(eda.find()){
            System.out.println("Edad "+edad+" bien insertada.");
        }else{
            System.out.println("Edad mal.");
        }
        
        ////////////////////////////////////////CURSO
        
        System.out.println("Introduzca curso: ");
        
        String curso = sc.nextLine();
        
        Pattern course = Pattern.compile("([a-z]{3})");
        
        Matcher curse = course.matcher(curso);
        
        if(curse.find()){
            System.out.println("Curso "+curso+" bien insertado.");
        }else{
            System.out.println("Curso mal.");
        }
    }
}
