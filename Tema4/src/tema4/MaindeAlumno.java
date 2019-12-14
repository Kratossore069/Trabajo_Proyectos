/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor_Gabriel_Carvajal_Aróstegui
 */
public class MaindeAlumno {
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno();
        
        alu1.nombre = "Ana";
        alu2.nombre = "Juan";
        
        alu1.mostrar();
        alu2.mostrar();
        
        alu2.aprobar();
    }
}
