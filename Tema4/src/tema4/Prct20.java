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
class Reloj {

    //Atributos
    private int hora = 0;
    private int minuto = 0;
    private int segundo = 0;

    //Constructor
    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        minuto = minutos;
        segundo = segundos;
    }

    public Reloj(Reloj reloj2) {

    }

    //Métodos
    public void mostrar() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public void agregarMinutos(int minutos) {
        this.minuto += minutos;
    }

    public void agregarHoras(int horas) {
        this.hora += horas;
    }

    public void agregarSegundos(int segundos) {
        this.segundo += segundos;
    }

    public void agregarHoras(double horas) {

    }

    public void agregarMinutos(double minutos) {

    }
}

public class Prct20 {

    /* Práctica 20: Crear una clase Reloj con atributos: int hora, int minuto, int segundo crear un
    constructor como mínimo con los 3 parámetros. Un constructor de copia, un método: String
    mostrar()
    que devolverá un texto con los datos del reloj en el formato:
    hora:minuto:segundo. Por ejemplo: 20:17:00
    los metodos agregarMinutos(int), agregarHoras(int), agregarSegundos(int) que sumarán lo
    correspondiente al reloj.
    Observar que cuando supere 60minutos, 60segundos se agrega en la siguiente unidad.
    Sobrecargar los métodos agregarHoras(double) , agregarMinutos(double) que si tienen una
    parte decimal calcula el equivalente en la unidad correspondiente y lo agrega*/
    public static void main(String[] args) {

        Reloj pulsera = new Reloj(22, 18, 26);

        pulsera.mostrar();
    }
}
