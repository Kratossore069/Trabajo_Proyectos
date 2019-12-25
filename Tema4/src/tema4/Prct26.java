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
class CocheAlquiler {

    //Atributos
    private String matricula;
    private String marca;
    private String modelo;
    private double precio;
    private int numDias;
    private boolean alquilado = false;
    private int fechaAlquiler;
    private final int DIASALQUILER = 2;

    //Constructor
    public CocheAlquiler(String matricula, String marca, String modelo, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Métodos
    
    /**
     * Muestra la información referida al coche alquilado
     *
     * @author: Víctor Gabriel
     * @return matricula, marca, modelo y precio
     */
    @Override
    public String toString() {
        String res="Matrícula: " + this.matricula + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nPrecio: " + this.precio;
        return res;
    }
    
    /**
     * Método pensado para alquilar el coche
     * @param dias int
     * @param dd int
     * @param mm int
     * @param aa int
     * @return -1 si el coche está alquilado, -2 si los días de alquiler son muy pocos y, en su defecto, el precio de alquilar el coche.
     */
    public double alquilar(int dias, int dd, int mm, int aa) {
        double res = 0;
        if (this.alquilado) {
            res = -1;
        } else if (dd < DIASALQUILER) {
            res = -2;
        } else {
            res = 10 * dd;
        }
        return res;
    }
    
    /**
     * Método a devolver
     * @param dias int
     * @return -1 si no está alquilado y los días que pide el coche superan a los mínimos. Si sale 0, puede alquilarlo.
     */
    public double devolver(int dias) {
        double res = 0;
        if (!this.alquilado && dias > this.DIASALQUILER) {
            res = -1;
        }
        return res;
    }

    //Getter y Setter
    public int getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(int fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
}

public class Prct26 {

    /*Práctica 26: Crear la clase CocheAlquiler como mínimo con atributos: String matricula,
marca, modelo; double precio; int numDias; boolean alquilado; y la fecha de alquiler
reflejada en tres valores enteros: dd, mm, aa
Se deberá reflejar que hay una cantidad mínima de días de alquiler: 2
Un constructor como mínimo que reciba matricula, marca, modelo y precio.
Un método: double alquilar(int dias, int dd, int mm, int aa) que refleja la fecha de alquiler y
el número de días del alquiler. En este método se deberá controlar si el coche ya está
alquilado en cuyo caso devolverá -1. -2 si se intenta alquilar por menos días del mínimo
establecido y el coste del alquiler en otro caso
Un método: double devolver(int dias) que refleja que se ha devuelto el coche después de
una cantidad de días. Este método devuelve -1 si el coche no está alquilado y la cantidad de
sobrecoste que pudiera haber incurrido si sobrepasa los días de alquiler inicialmente
establecidos
Sobreescribir el método toString() que muestre los datos relevantes del alquiler*/

    public static void main(String[] args) {
        
        CocheAlquiler coche = new CocheAlquiler("123A", "Fiat", "Mondeo", 500);
        
        System.out.println(coche.toString());
        
    }
}
