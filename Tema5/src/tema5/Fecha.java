/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Date;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Fecha {

    //Atributos
    private long mili;

    //Constructor
    public Fecha() {
        mili = System.currentTimeMillis();
    }

    ////////////////////////MÉTODOS
    /**
     * @return Pequeña trampa para mostrar la fecha.
     */
    public void mostrarFecha() { 
        
        Date objDate = new Date(); 
 
        System.out.println(objDate.toString());
    }
    /**
     * 
     * @return Días pasados desde 1-1-1970.
     */
    public long diasPasados() {
        long segundos = mili / 1000;
        long horas = segundos / 3600;
        long dias = horas / 24;
        return dias;
    }

    /**
     * @return El día que es hoy.
     */
    public void diaSemana() {
        String tiki[] = {"DOMINGO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO"};
        long b = mili%7;
        System.out.println("Hoy es "+tiki[(int)b]);
    }

    ////////////////////////MAIN
    public static void main(String[] args) {
        Fecha fecha = new Fecha();

        System.out.println("Han pasado " + fecha.diasPasados() + " días desde 1970.");

        fecha.diaSemana(); //Aquí hay un fallo

        fecha.mostrarFecha(); //Esto está bien, pero es trampa

    }
}
