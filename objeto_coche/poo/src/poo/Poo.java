package poo;

/**
 *
 * @author Víctor
 */
public class Poo {

    public static void main(String[] args) {
        coche ford = new coche();
        System.out.println(ford.ruedas());
        System.out.println(ford.motor());
        System.out.println(ford.peso());
        System.out.println("Su coche Ford tiene "+ford.ancho()+" metros de ancho.");
        
        ford.color(); // El del void
        
        System.out.println(ford.dimeColor());
    }
    
}
