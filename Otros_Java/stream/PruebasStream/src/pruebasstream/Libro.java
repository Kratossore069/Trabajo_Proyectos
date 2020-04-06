/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasstream;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Libro {
    
    private String titulo;
  private int paginas;
  
  
  public Libro(String titulo, int paginas) {
    super();
    this.titulo = titulo;
    this.paginas = paginas;
  }
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public int getPaginas() {
    return paginas;
  }
  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }
    
}
