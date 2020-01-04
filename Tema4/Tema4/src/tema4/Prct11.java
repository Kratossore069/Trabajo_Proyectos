/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

class Cliente{
    int id, habitacion, noches;
    String nombre, apellido;
    double debe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }
    
    //CONSTRUCTOR
    
    public Cliente(String n, String a, int i, int h, double d, int no){
        nombre = n;
        apellido = a;
        id = i;
        habitacion = h;
        debe = d;
        noches = no;
    }
    
    //MÉTODOS
    
    public double gastar(double d){
        double res=0;
        
        return res;
    }
    
    public double pagar(double d){
        double res=0;
        
        return res;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+"\nId: "+id+"\nHabitación número: "+habitacion+"\nDebe: "+debe+"\nNoches: "+noches);
    }
}

public class Prct11 {
    public static void main(String[] args) {
        /*Práctica 11: Crear una clase llamada Cliente que emulará los gastos de un cliente de un
        hotel. Como atributos tendrá como mínimo: int id, String nombre, String apellido, int
        habitacion, double debe, int noches 
        
        Como métodos como mínimo gastar(double) y
        pagar(double) que reflejan cuando el cliente consume y aumenta su deuda así como pagar
        parte de su cuenta. 
        
        Tener en cuenta que como mínimo en el debe del cliente estará la cuantía
        de alquilar la habitación por el número de noches que esté. 
        
        Cuando se establezca el número
        de la habitación también se deberá establecer el precio/noche de la habitación*/
        
        Cliente cliente = new Cliente("Paco", "Collado", 123, 15, 25, 3);
        
        cliente.mostrar();
    }
}
