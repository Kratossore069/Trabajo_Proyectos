package video17;

import java.util.*;
public class Video17 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca qué desea hacer: \n1- Cuadrado \n2- Triángulo \n3- Rectángulo \n4- Círculo");
        int opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Introduce el lado: ");
                int lado = entrada.nextInt();
                int operacion = lado*lado;
                System.out.println("La respuesta es "+operacion);
            case 2:
                System.out.println("Introduzca la base: ");
                int base = entrada.nextInt();
                System.out.println("Introduzca la altura: ");
                int altura = entrada.nextInt();
                int operacio = (base*altura)/2;
                System.out.println("La respuesta es "+operacio);
            case 3:
                System.out.println("Introduzca la base: ");
                int bas = entrada.nextInt();
                System.out.println("Introduzca la altura: ");
                int altur = entrada.nextInt();
                int oper = bas*altur;
                System.out.println("El área de su rectángulo es "+oper);
            case 4:
                System.out.println("Introduzca el radio: ");
                int radio = entrada.nextInt();
                float rad = 3.14f*(radio*radio);
                System.out.println("El área de un círculo es "+rad);
        }
    }
    
}