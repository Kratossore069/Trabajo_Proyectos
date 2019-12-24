/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor_Gabriel_Carvajal_Aróstegui
 */
public class Gato {
    
    

    public int getPatas() {
        return patas;
    }

    public int getEdad() {
        return edad;
    }

    public String getSonido() {
        return sonido;
    }

    public String getRonronear() {
        return ronronear;
    }

    public boolean isAraniar() {
        return araniar;
    }

    public String getRaza() {
        return RAZA;
    }

    public double getGarras() {
        return garras;
    }
    
    public String getBufar(){ //GETTER
        return bufar;
    }
    
    public void ronronear(){ //SETTER
        System.out.println("Ronroneo");
    }
    
    public void maullar(){ //SETTER
        System.out.println("Miau");
    }
    
    public String toString(String algo){
        return algo.toString();
    }
    
    public void setAnios(){
        edad++;
        garras += 2;
    }
    
    public void comer(int gramos){
        peso += gramos;
    }
    
    void setPeso(int p){
        peso = p;
    }
    
    
    
    public Gato(String n, String r, int p){ //Constructores no devuelven nada
        RAZA = r;
        nombre = n;
        patas = 4;
        garras = 0;
        peso = p;
        
        
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre+" Edad: "+edad+" Raza: "+RAZA
        +" Peso: "+peso+" Garras: "+garras);
    }
    
    public void setNombre(String n) {
        String array[] = {"Isidoro", "Félix", "Garfield", "Antonio", "Paca", "Pelusa", "Doraemon"};
        String resultado = "";
        boolean bandera = false;
        for (int i = 0; i < array.length &&!bandera; i++) {
            if (n.equals(array[i])) {
                nombre = n;
                bandera = true;
            } else {
                resultado = "Nombre no admitido";
            }
        }
    }
    
    private int edad;
    private String sonido;
    private String ronronear;
    private boolean araniar;
    private final String RAZA;
    private double garras;
    private String bufar;
    private int peso;
    private int patas = 4;
    private String nombre;
    
    
}
