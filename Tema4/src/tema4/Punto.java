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
    /* 
VectorLibre multiplicar(double numero) → el producto por un número es multiplicar sus
componentes: V(3,8) * 2 = V(3*2,8*2)
VectorLibre division(double numero) → La división por un número es dividir sus
componentes: V(4,8) / 2 = V(4/2,8/2)
VectorLibre normalizacion() → Normalizar un vector es dividirlo por su módulo
VectorLibre opuesto() → Obtener el opuesto de un vector es multiplicarlo por -1
VectorLibre suma(VectorLibre vectorLibre) → la suma de vectores se hace sumando sus
componentes: V(1,2) + V(3,4) = V(1+3,2+4)
VectorLibre resta(VectorLibre vectorLibre) → la resta es igual que la suma pero restando en
lugar de sumar. Si bien este método se realizará apoyándose en otros dos métodos anteriores
ya que la resta se puede obtener como la suma del opuesto
adicionalmente los métodos toString() y equals() Respecto a este último como el punto
origen lo estamos estableciendo para todos en (0,0) lo único que hay que comprobar es que
los puntos fin sean iguales ( para ello se usará el método equals() de la clase Punto que
antes se habrá creado )*/
    
    public double modulo(int x, int y){
        int dobleX=x*x;
        int dobleY = y*y;
        double res = dobleX+dobleY;
        return res;
    }
    
    public VectorLibre multiplicar(double numero){
        
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
