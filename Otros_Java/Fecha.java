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
public class Fecha {

    //Atributos
    private long mili;

    //Constructor
    public Fecha() {
        mili = System.currentTimeMillis();
    }

    //Métodos
    public long diasPasados() {
        long segundos = mili / 1000;
        long horas = segundos / 3600;
        long dias = horas / 24;
        return dias;
    }


    public void diaSemana() {
        String tiki[] = {"DOMINGO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO"};
        long b = mili%7;
        System.out.println("Hoy es "+tiki[(int)b]);
    }

    //Main
    public static void main(String[] args) {
        Fecha fecha = new Fecha();

        System.out.println("Han pasado " + fecha.diasPasados() + " días desde 1970.");

        fecha.diaSemana();

        

    }
}
