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

 

    protected String nombre;
    boolean encendido;
    public boolean frenoDeManoPuesto;
    private int posicion;
    private Maletero miMaletero;

    //----------------------------------------------------Métodos
    public String apagar(){
        String res="";
        if(this.encendido){
            res = "Apagando el coche.";
        }else{
            res = "El coche ya estaba apagado.";
        }
        return res;
    }
    
    
    public String toString(String algo){
        return algo.toString();
    }
    
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
        int espacio;
        //espacio = moverCoche(-1*cantidad);
        return res;
    }
    
    /*public String moverCocheDerecha(int cantidad){
        moverCoche(-1*cantidad);
    }*/
    
    public String estado(){
        return nombre+" \nencendido: "+encendido+" \nposicion: "+posicion+" \nfreno de mano: "+frenoDeManoPuesto;
    }
    

    //------------------------------------------------------Constructores
    public Coche(String n) {
        this(n,0);
        nombre = n;
        miMaletero = new Maletero();
    }

    public Coche(String n, int p) {
        //maletero = new String[SIZE];
        n = this.nombre;
        p = this.posicion;
    }
    
    public Coche(){}

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
