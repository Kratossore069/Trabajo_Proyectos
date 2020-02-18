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

class Libro{
    
    //ATRIBUTOS
    protected String autor[];
    protected String titulo;
    protected String resumen;
    protected int paginas;
    
    //CONSTRUCTOR
    public Libro(String[] autor, String titulo, String resumen, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.resumen = resumen;
        this.paginas = paginas;
    }
    
    //MÉTODOS
    public boolean libroGrande(){
        
        boolean tomo=false;
        
        if(this.paginas>500){
            tomo=true;
        }
        
        return tomo;
    }
    
    //GETTER Y SETTER
    public String[] getAutor() {
        return autor;
    }

    public void setAutor(String[] autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", titulo=" + titulo + ", resumen=" + resumen + ", paginas=" + paginas + '}';
    }
    
    
    
    
}

class VolumenLibro extends Libro{
    
    private String propietario;
    enum EstadoConservacion{BUENO, REGULAR, MALO};
    private int id;
    private boolean variosTomos;
    
    //CONSTRUCTOR
    public VolumenLibro(String[] autor, String titulo, String resumen, int paginas, String propietario,
                        int id, EstadoConservacion estado, boolean tomos) {
        super(autor, titulo, resumen, paginas);
        propietario = this.propietario;
        id = this.id;
        tomos = variosTomos;
    }

    @Override
    public String toString() {
        return "VolumenLibro{" + "propietario=" + propietario + ", id=" + id + '}';
    }
    
    
    
}



public class Prct09 {
    /*
    Práctica 9: Crear la clase Libro con atributos String []autor, String titulo, String resumen,
    int paginas aparte de getter y setter un método boolean libroGrande() que comprueba que el
    número de páginas es mayor de 500. Crear VolumenLibro que hereda de Libro y tiene
    adicionalmente String propietario, estadoConservacion que será un enum: bueno, regular,
    malo y un id de tipo entero. Sobreescribir el toString() en ambas clases . VolumenLibro
    también tiene un atributo boolean variosTomos que está a true si el libro es de más de
    500páginas
    */
}
