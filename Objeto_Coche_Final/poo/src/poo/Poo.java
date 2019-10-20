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
        
        System.out.println(ford.datosGenerales());
        
        ford.voidcolor("verde"); // El del void
        
        System.out.println(ford.dimeColor());
        
        ford.colorDelosAsientos("si"); // <-- Siempre llamar al setter
        
        System.out.println(ford.dimeAsientos());
        
        ford.setClimatizador("no");
        
        System.out.println(ford.dimeClimatizador());
    }
    
}
