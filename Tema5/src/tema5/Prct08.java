/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

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
    }
}
