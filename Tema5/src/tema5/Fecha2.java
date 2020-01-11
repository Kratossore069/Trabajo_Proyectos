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
public class Fecha2 {

    //Atributos
    private long mili;

    //Constructor
    public Fecha2() {
        mili = System.currentTimeMillis();
    }
    
    public Fecha2(int num){
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
     * 
     * @param num Es el número de días.
     * @return Método diasPasados pero con parámetro día.
     */
    public long diasPasados(int num) {
        long segundos = mili / 1000;
        long horas = segundos / 3600;
        long dias = horas / 24;
        long rest=dias-num;
        return rest;
    }

    /**
     * @return El día que es hoy.
     */
    public void diaSemana() {
        String tiki[] = {"DOMINGO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO"};
        long b = diasPasados()%7;
        //System.out.println("Hoy es "+tiki[b]);
        System.out.println(b);
    }

    ////////////////////////MAIN
    public static void main(String[] args) {
        Fecha2 fecha = new Fecha2();

        System.out.println("Han pasado " + fecha.diasPasados() + " días desde 1970.");
        
        Fecha2 fecha2 = new Fecha2(2171);
        
        System.out.println("Desde 2171 han pasado "+fecha.diasPasados(2171)+" días.");

        fecha.diaSemana(); //Aquí hay un fallo

        fecha.mostrarFecha(); //Esto está bien, pero es trampa

    }
}
