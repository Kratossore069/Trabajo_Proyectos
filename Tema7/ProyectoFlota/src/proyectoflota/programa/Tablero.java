package proyectoflota.programa;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Tablero {

    //Atributos 
    public static int xMax = 10, yMax = 10;
    public static Casillas[][] tabla = new Casillas[xMax][yMax];
    public Barco[] nBarcos = new Barco[0];

    //Métodos
    public void crearTablero() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                tabla[x][y] = new Casillas();
            }
        }
    }

    public void mostrarTablero() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print(tabla[x][y].forma + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return Verificar que no se sale del tablero.
     */
    public boolean dentro(int x, int y) {
        return (!((x<0)||(x>=xMax)||(y<0)||(y>=yMax)));
    }
    
    /**
     * 
     * @return Colocamos barcos en el tablero.
     */
    public void colocarBarco(int medida) {

        int yIni = (int) (Math.random() * Tablero.yMax); 
        int xIni = (int) (Math.random() * Tablero.xMax);

        for (int k = 0; k < medida; k++) {
            if (!Tablero.tabla[yIni][xIni].contenido) {
                Tablero.tabla[yIni][xIni].forma = '*';
                Tablero.tabla[yIni][xIni].contenido = true;
                //posicionesOcupadas = new int[yIni][xIni];
            } else {
                k--;
            }
        }
    }
}
