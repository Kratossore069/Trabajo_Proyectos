/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.LinkedList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

abstract class ProfesionalBaloncesto{
    
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected double ingresosAnuales;
    protected int numeroFederado;

    public ProfesionalBaloncesto(String nombre, String apellidos, int edad, double ingresosAnuales, int numeroFederado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.ingresosAnuales = ingresosAnuales;
        this.numeroFederado = numeroFederado;
    }

    @Override
    public String toString() {
        return "ProfesionalBaloncesto{" + "nombre=" + nombre + 
                ", apellidos=" + apellidos + 
                ", edad=" + edad + 
                ", ingresosAnuales=" + ingresosAnuales + 
                ", numeroFederado=" + numeroFederado + '}';
    }
    
    
    
}

class Jugador extends ProfesionalBaloncesto{

    public Jugador(String nombre, String apellidos, int edad, double ingresosAnuales, int numeroFederado) {
        super(nombre, apellidos, edad, ingresosAnuales, numeroFederado);
    }
    
    protected enum Posiciones{BASE, PIVOT, ESCOLTA, ALERO, ALAPIVOT}
    
    Posiciones posicion;
    int partidosJugados;
    String equipo;
    String nombre;

    @Override
    public String toString() {
        return "Jugador{" + "posicion=" + posicion + ""
                + ", partidosJugados=" + partidosJugados + ""
                + ", equipo=" + equipo + '}';
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    public int getNumeroFederado() {
        return numeroFederado;
    }

    public void setNumeroFederado(int numeroFederado) {
        this.numeroFederado = numeroFederado;
    }
    
    
    
    
    
}

class Entrenador extends ProfesionalBaloncesto{
    
    public Entrenador(String nombre, String apellidos, int edad, double ingresosAnuales, int numeroFederado, double porc) {
        super(nombre, apellidos, edad, ingresosAnuales, numeroFederado);
        
    }
    
    double porcentajeVictorias;

    @Override
    public String toString() {
        return "Entrenador{" + "porcentajeVictorias=" + porcentajeVictorias + '}';
    }
    
    
    
}

class Arbitro extends ProfesionalBaloncesto{
    
    public Arbitro(String nombre, String apellidos, int edad, double ingresosAnuales, int numeroFederado) {
        super(nombre, apellidos, edad, ingresosAnuales, numeroFederado);
    }
    
    int faltasPitadas;

    @Override
    public String toString() {
        return "Arbitro{" + "faltasPitadas=" + faltasPitadas + '}';
    }
    
    
}

class A{
    int numA = 20;
    
    public A(){
    new C();
    }
    
    class C{
    int numC = 40;
}
}

class B{
    int numA = 20;
}



public class Prct16 {
    /*
    Práctica 16: Crear la clase ProfesionalBaloncesto que representa a cualesquier profesional
de baloncesto. Así tiene como atributos: nombre, apellidos, edad, ingresosAnuales,
numeroFederado, con un constructor como mínimo y un toString()
La clase Jugador que extiende a ProfesionalBaloncesto con atributos propios: posición
( enum para base, pivot,.. ) , partidosJugados , equipo
La clase Entrenador que extiende a ProfesionalBaloncesto con atributos propios:
porcentajeVictorias ( un número de 0 a 100)
La clase Arbitro que extiende a ProfesionalBaloncesto con atributos propios:
int faltasPitadas
Todos los datos de los atributos propios hacen referencia a una temporada completa
Poner en una LinkedList de tipo ProfesionalBaloncesto objetos de tipo Jugador, Entrenador,
Arbitro. Recorrer la lista y mostrar únicamente los atributos propios de la clase de cada
objeto ( no los atributos comunes con la superclase)
    */
    
    public static void main(String[] args) {
        LinkedList<ProfesionalBaloncesto> profs = new LinkedList<>();
        
        profs.add(new Jugador("Fran","Cuesta",25,12345678,69));
        profs.add(new Entrenador("Fernando","Esteso",52,2500,89,0.60));
        
        for(ProfesionalBaloncesto prof : profs){
            if(prof instanceof Entrenador){
                Entrenador e = (Entrenador)prof;
                System.out.println(e.porcentajeVictorias);
            }else if(prof instanceof Jugador){
                Jugador j = (Jugador)prof;
                System.out.println(j.equipo+" "+j.partidosJugados+" "
                +j.posicion);
            }
        }
    }
}
