package poo;

/**
 *
 * @author Víctor
 */
public class Poo {

    public static void main(String[] args) {
        coche ford = new coche();
        System.out.println("Las ruedas de este coche son "+ford.ruedas);
        System.out.println("Consta de un peso de "+ford.peso+" kilos.");
        System.out.println("Su largo es de "+ford.largo+" y su ancho de "+ford.ancho+" respectivamente.");
        System.out.println("Y se trata de un motor de "+ford.motor);
    }
    
}
