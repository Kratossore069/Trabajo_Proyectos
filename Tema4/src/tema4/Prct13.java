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
class Cochito {

    private String marca;
    private String modelo;
    private double potencia;
    private int puertas;
    private String matricula;

    Cochito(String marca, String modelo, double potencia, int puertas, String matricula) {
        marca = marca; //Cambiado
        this.modelo = modelo;
        this.potencia = potencia;
        this.puertas = puertas;
        this.matricula = matricula;

    }

    Cochito(double potencia, int puertas) {
        this(null, null, potencia, puertas, null);
    }
}

public class Prct13 {

    /* Práctica 13: Crea con el código de ejemplo la clase Cochito en el IDE y modifica el segundo
constructor haciendo que la primera línea no sea la llamada a: this()
( por ejemplo declara una variable local, etc ) Toma captura de pantalla del mensaje y
contesta ¿ qué mensaje muestra el IDE ?*/
    
    public static void main(String[] args) {
        //Pone que la variable nunca es usada y que está asignada a ella misma.
    }
}
