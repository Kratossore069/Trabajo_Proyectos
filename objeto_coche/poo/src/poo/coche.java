package poo;

/**
 *
 * @author Víctor
 */
public class coche {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    String color;
    
    public coche(){
        
        ruedas = 4;
        peso = 500;
        motor = 1600;
        largo = 5;
        ancho = 3;
    }
    
    public String ruedas(){
        return "Su coche tiene "+ruedas+" ruedas";
    }
    
    public String peso(){
        return "Su coche pesa "+peso+" kilos";
    }
    
    public String motor(){
        return "Tiene una cilindrada de "+motor;
    }
    
    public String largo(){
        return "Cuenta con un largo de "+largo+" metros";
    }
    
    public Integer ancho(){ // GETTER
        return ancho;
    }
    
    public void color(){ // SETTER
        color = "Azul";
    }
    
    public String dimeColor(){
        return "El color del coche es "+color;
    }    
}
