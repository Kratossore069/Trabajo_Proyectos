/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
interface ORdenable {

    public boolean esMayorQue();

    public boolean esMenorQue();

    public boolean esIgualQue();
}

class Person implements ORdenable { //LANZA UN ERROR QUE PIDE QUE SE HAGA ABSTRACTA LA CLASE
                                    //PERSON O, QUE IMPLEMENTE LOS MÉTODOS DE ORDENABLE

    private int edad;

    public Person(int edad) {
        this.edad = edad;
    }
    
    

    //@Override
    public boolean esMayorQue(Object a) {
        return this.edad.compareTo();
    }

    @Override
    public boolean esMenorQue() {
        return
    }

    @Override
    public boolean esIgualQue() {
        return
    }
    
    //GETTER Y SETTER

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

}

class Homo extends Person{
    
    private String nombre;
    private String apellido;

    public Homo(String nombre, String apellido, int edad) {
        super(edad);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
}

class Woman extends Person{
    
    private String nombre;
    private String apellido;

    public Woman(String nombre, String apellido, int edad) {
        super(edad);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

public class Prct17 {

    /*
    Práctica 17 junto con 18: Crear la interfaz: Ordenable
    e incluir como métodos: boolean
    esMayorQue() , esMenorQue(), esIgualQue() Implementar el interfaz en la clase Persona
    (tomaremos la clase abstracta que ya hemos usado en esta unidad ) ¿ qué ocurre en el IDE
    cuándo escribimos: Persona implements Ordenable ? ( tomar captura de pantalla )
    mediante alt+enter hacer el override
     */

    public static void main(String[] args) {
        

    
        ORdenable elemento1 = new Homo("Paco","Macías",85);
        ORdenable elemento2 = new Woman("Montse","Villavieja",52);
        if (elemento1.esMayorQue(elemento2)) {
            System.out.println("elemento1 es mayor que elemento2");
        } else {
            System.out.println("elemento1 no es mayor que elemento2");
        }
    
}
}
