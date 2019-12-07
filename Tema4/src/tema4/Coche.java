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
public class Coche {

 

    private String nombre;
    private boolean encendido;
    private boolean frenoDeManoPuesto;
    private int posicion=0;

    //----------------------------------------------------Métodos
    public String subirFrenoDeMano() {
        String respuesta = "";
        if (!frenoDeManoPuesto) {
            frenoDeManoPuesto = true;
            respuesta = "Freno puesto";
        } else {
            respuesta = "Ya estaba puesto";
        }
        return respuesta;
    }
    
    public String apagarMotor(){
        String res = "";
        if(encendido){
            encendido = false;
            res = "Coche apagado";
        }else{
            res = "El coche ya se encuentra apagado";
        }
        return res;
    }
    
    public String bajarFrenoDeMano() {
        String respuesta = "";
        if (!frenoDeManoPuesto) {
            respuesta = "El freno ya estaba bajado";
        } else {
            frenoDeManoPuesto = false;
            respuesta = "Freno de mano bajado";
        }
        return respuesta;
    }

    public String arrancar() {
        String res = "";
        if (encendido) {
            res = "Ya está encendido";
        } else {
            encendido = true;
            res = "Coche en marcha.";
        }
        return res;
    }
    
    private String moverCoche(int posiciones){
       String res=""; 
        if(encendido){
            if(frenoDeManoPuesto){
                encendido = false;
                res = "Freno puesto, me he calado.";
            }else{
                posicion += posiciones;            
                res = "Coche movido";
            }
        }else{
            res = "Coche apagado no se puede mover";
        }
        return res;
    }
    
    public String moverCocheIzquierda(int cantidad){
        String res="";
        int left = posicion -= cantidad;
        if(left <= 0){ //ERROR
            posicion = posicion;
            res = "El coche se cae por el barranco, no puedes moverlo "+cantidad+" a la izquierda.";
        }else{
            posicion -= cantidad;
            res = "El coche se mueve "+cantidad+" hacia la izquierda";
        }
        return res;
    }
    
    public String moverCocheDerecha(int cantidad){
        String res="";
        int rigth = posicion +=cantidad;
        if(rigth > 9){ //ERROR
            posicion = posicion;
            res = "El coche se cae por el barranco, no puedes moverlo "+cantidad+" más a la derecha";
        }else{
            posicion += cantidad;
            res = "El coche se mueve "+cantidad+" hacia la derecha";
        }
        return res;
    }
    
    public String estado(){
        return nombre+" \nencendido: "+encendido+" \nposicion: "+posicion+" \nfreno de mano: "+frenoDeManoPuesto;
    }

    //------------------------------------------------------Constructores
    public Coche(String n) {
        nombre = n;
    }

    public Coche(String n, int p) {
        n = nombre;
        p = posicion;
    }

    // -----------------------------------------------------Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isFrenoDeManoPuesto() {
        return frenoDeManoPuesto;
    }

    public void setFrenoDeManoPuesto(boolean frenoDeManoPuesto) {
        this.frenoDeManoPuesto = frenoDeManoPuesto;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

}