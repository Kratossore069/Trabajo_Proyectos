/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Personal {

    //Atributos
    private String nombre;
    private int edad;
    private String ocupacion;
    private String dni;
    private int salario;

    //Constructores
    public Personal(String nombre, int edad, String ocupacion, String dni, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.dni = dni;
        this.salario = salario;
    }
    
    public Personal(String nombre, String ocupacion, int salario){
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.salario = salario;
    }
    
    //Métodos
    public static int salarioMayor(Personal trabajadores[]){
        int indice=0;
        int salario = trabajadores[0].getSalario();
        for (int i = 1; i < trabajadores.length; i++) {
            if(trabajadores[i].getSalario() > salario){
                salario = trabajadores[i].getSalario();
                indice = i;
            }
        }
        return indice;
    }
    
    public static int salarioMenor(Personal trabajadores[]){
        int indice=0;
        int salario = trabajadores[0].getSalario();
        for (int i = 1; i < trabajadores.length; i++) {
            if(trabajadores[i].getSalario() < salario){
                salario = trabajadores[i].getSalario();
                indice = i;
            }
        }
        return indice;
    }
    
    public String mostrar(){
        return "Nombre: "+nombre+"\nOcupación: "+ocupacion+"\nSalario: "+salario;
    }

    //Getter y Setter
    public int getSalario() {
        return salario;
    }

   

}
