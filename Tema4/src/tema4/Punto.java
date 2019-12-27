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
class VectorLibre {

    //Atributos
    private int inicio;
    private int fin;
    private final int ORIGEN = 00;

    //Constructores
    public VectorLibre(Punto desde, Punto hasta) {
        double x = hasta.getX() - desde.getX();
        double y = hasta.getY() - desde.getY();
    }

    public VectorLibre(Punto fin) {

    }

    //MÉTODOS
    
    
    public double modulo(int x, int y){
        int dobleX=x*x;
        int dobleY = y*y;
        double res = dobleX+dobleY;
        return res;
    }
    
    public VectorLibre multiplicar(double numero){
        
    }
    
    public VectorLibre division(double numero){
        
    }
    
    public VectorLibre normalizacion(){
        
    }
    
    public VectorLibre opuesto(int num){
        return null;
    }
    
    public VectorLibre suma(VectorLibre vectorLibre){
        
    }
    
    //Getter y Setter
    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
}

public class Punto {

    //Atributos
    private final double X;
    private final double Y;

    //Constructores
    public Punto(Punto punto2) {
        int a = 5;//Para que no se queje
        X = a;
        Y = a;
    }

    public Punto(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    //MÉTODOS
    /**
     *
     * @return Muestra las coordenadas.
     */
    @Override
    public String toString() {
        String res = "Coordenadas X: " + this.X + "\nCoordenadas Y: " + this.Y;
        return res;
    }

    /**
     *
     * @return Verifica si los puntos son exactamente iguales, si uno de ellos
     * falla, retorna false.
     */
    public boolean equals(double x, double y) {
        boolean res = false;
        if (x == this.X && y == this.Y) {
            res = true;
        }
        return res;
    }

    //Getter y Setter
    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }
}
