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
    private String color;
    private boolean asientos;
    
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
    
    public String datosGenerales(){
        return "El coche consta de "+ruedas+" ruedas. Mide "+largo+" metros"+" y pesa unos "
                +peso+" kilos. Tiene un motor de "+motor+" de cilindrada.";
    }
    
    public Integer ancho(){ // GETTER
        return ancho;
    }
    
    public void voidcolor(String colorDelCoche){ // SETTER
        color = colorDelCoche;
    }
    
    public String dimeColor(){
        return "El color del coche es "+color;
    }  
    
    public void colorDelosAsientos(String asientosCuero){ //SETTER
        if(asientosCuero == "si"){
            this.asientos = true;
        }else{
            this.asientos = false;
        }
    }
    
    public String dimeAsientos(){ //GETTER
        if(asientos == true){
            return "El coche tiene asientos de cuero.";
        }else{
            return "El coche tiene asientos de serie.";
        }
    }
}
