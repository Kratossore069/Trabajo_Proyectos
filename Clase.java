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
public class Clase {

    public static class Persona {

        private String nombre;
        private String apellido;
        private int edad;

        public String getNombreCompleto() {
            return nombre + " " + apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setNombre(String txt) {
            nombre = txt;
        }

        public void setApellido(String txt) {
            apellido = txt;
        }

        public void setEdad(int n) {
            edad = n;
        }
    }
    
    public static class Coche{
    
        private String nombre, matricula;
        
        public String getNombre(){
            return nombre;
        }
        
        public String getMatricula(){
            return matricula;
        }
        
        public void setNombre(String nom){
            nombre = nom;
        }
        
        public void setMatricula(String mat){
            matricula = mat;
        }
        
    }

    public static void main(String[] args) {
        
        Persona administrador = new Persona();
        Coche carro = new Coche();
        
        administrador.setEdad(25);
        administrador.setNombre("Víctor");
        administrador.setApellido("Carvajal");
        
        carro.setNombre("Ford");
        carro.setMatricula("1234A");
        
        System.out.println("Se trata de "+administrador.getNombreCompleto()+" y tiene "+administrador.getEdad()+" años.");
        System.out.println("Su coche es un "+carro.getNombre()+" con matrícula "+carro.getMatricula());
    }
}
