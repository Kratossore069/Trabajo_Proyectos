/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import sun.rmi.runtime.Log;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Fecha {

    //Atributos
    private final long MILI = System.currentTimeMillis();

    //Constructor
    public Fecha() {

    }

    //Métodos
    public long diasPasados() {
        long segundos = MILI / 1000;
        long horas = segundos / 3600;
        long dias = horas / 24;
        return dias;
    }

    public void diaSemana() {
        String dias[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        long num = diasPasados();
        System.out.println("Hoy es " + dias[(int) num % 7]);
    }
    
    //Método usado en Internet para sacar el día de hoy
    public String diaSemana(int dia, int mes, int ano) {
        String letraD = "";
        TimeZone timezone = TimeZone.getDefault();
        Calendar calendar = new GregorianCalendar(timezone);
        calendar.set(ano, mes - 1, dia);
        int nD = calendar.get(Calendar.DAY_OF_WEEK);
        switch (nD) {
            case 1:
                letraD = "Domingo";
                break;
            case 2:
                letraD = "Lunes";
                break;
            case 3:
                letraD = "Martes";
                break;
            case 4:
                letraD = "Miércoles";
                break;
            case 5:
                letraD = "Jueves";
                break;
            case 6:
                letraD = "Viernes";
                break;
            case 7:
                letraD = "Sábado";
                break;
        }

        return letraD;
    }

    //Main
    public static void main(String[] args) {
        Fecha fecha = new Fecha();

        System.out.println("Han pasado " + fecha.diasPasados() + " días desde 1970.");

        fecha.diaSemana();

        //Forma manual, ahora usando otras bibliotecas
        
        String diaHoy = fecha.diaSemana(8, 1, 2020);
        System.out.println("Hoy es "+diaHoy);
    }
}
