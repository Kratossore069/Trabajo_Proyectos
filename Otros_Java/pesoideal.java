package video18;

import java.util.*;
public class video20 {
    public static void main(String[] args){
        System.out.println("PRUEBA DE HOY: PESO IDEAL");
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Es usted hombre ó mujer?");
        String sexo = entrada.next();
        
        while(sexo.equals("mujer")==false && sexo.equals("hombre")==false){
            System.out.println("Error, vuelva a introducir.");
            sexo = entrada.next();
        }
        
        int altura=0;
        int pesoideal=0;
        
        if(sexo.equals("hombre")==true){
            System.out.println("Introduzca su altura en centímetros.");
            altura=entrada.nextInt();
            pesoideal=altura-110;
            System.out.println("Su peso ideal es de "+pesoideal+" kilos.");
        }else if(sexo.equals("mujer")==true){
            System.out.println("Introduzca su altura en centímetros.");
            altura=entrada.nextInt();
            pesoideal=altura-120;
            System.out.println("Su peso ideal es de "+pesoideal+" kilos.");
        }
        
    }
}