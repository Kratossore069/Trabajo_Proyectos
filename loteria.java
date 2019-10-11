package video18;

import java.util.*;
public class video19 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int suerte = (int)(Math.random()*100);
        int intento = 1;
        int numero=0;
        
        System.out.println("JUEGO DE LOTERÍA");
        
        while(intento<=3){
            System.out.println("Intento nº "+intento+" Introduzca un número: ");
            numero = entrada.nextInt();
            
            if(suerte<numero){
                System.out.println("Su número es mayor.");
            }else if(suerte>numero){
                System.out.println("Su número es menor.");
            }else if(numero==suerte){
                System.out.println("Ha acertado. Felicidades.");
                break;
            }
           
            intento++;
        }
        System.out.println("Se acabaron los 3 intentos, lo siento.");
    }
}
