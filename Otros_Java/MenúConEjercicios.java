/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MenúConEjercicios {

    public static void main(String[] args) {
        System.out.println("Ejercicios de repaso: ");
        Scanner sc = new Scanner(System.in);
        int opcion, salir;

        do {
            System.out.println("Inserte el número de su ejercicio: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //Salen números de un array de manera arbitraria sin repeticiones.
                    arrays(); //No está como quiero

                    break;
                case 2:
                    try{
                        pruebaError();
                    }catch(Exception ex){
                        System.out.println("Error: no se puede dividir entre 0\nA parte de eso, el programa va bien.");
                    }
                    break;
                case 3:
                    //Buscar un elemento de un array de forma recursiva.
                    int array[] = {1,2,3,4,5};
                    int elementoBuscar = 4;
                    int resultado = buscarArray(array, elementoBuscar,0);
                    System.out.println("El número se encuentra en la posición "+resultado);
                    break;
                case 4:
                    //Invertir un numero de forma recursiva (no usar String)
                    int num = 845, pos=2;
                    int res = invertirNumero(num, pos);
                    System.out.println(res);
                    break;
                case 5:
                    //Se suman los dígitos del número.
                    int numeraco = 532;
                    int resul = digitos(numeraco);
                    System.out.println(resul);
                    break;
                case 6:
                    int numerillo = 6;
                    try{
                        mismaLinea(numerillo);
                    }catch(Exception ex){
                        System.out.println("Número no permitido.");
                    }
                    break;
                case 7:
                    int numerotocho = 5;
                    try{
                        int resi = fibonacci(numerotocho);
                        System.out.println(resi);
                    }catch(Exception ex){
                        System.out.println("No es un número válido.");
                    }
                    break;
                case 8:
                    try{
                        loteria();
                    }catch(Exception ex){
                        System.out.println("No has insertado un número válido");
                    }
                    break;
                case 9:
                    listaProductos();
                    break;
                default:
                    System.out.println("No hay "+opcion+ " opciones.");
            }

            System.out.println("¿Salir? Se sale del programa con 123");
            salir = sc.nextInt();

        } while (salir != 123);
    }

    public static void arrays() {
        int arr[] = new int[10];
        Random rd = new Random();
        int aleatorio;

        for (int i = 0; i < arr.length; i++) {
            aleatorio = rd.nextInt(10) + 1;
            arr[i] = aleatorio;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }
    
    public static void pruebaError() throws Exception{
        int a=5,b=0, resultado;
        resultado = a/b;
        System.out.println(resultado);
        throw new Exception();
    }
    
    public static int buscarArray(int array[], int elemento, int indice){
        int resultado;
        if(indice==array.length || array[indice]==elemento){
             
            if(indice==array.length){
               resultado = -1; 
            }else{
                resultado = indice;
            }
             
        }else{
            resultado = buscarArray(array, elemento, indice+1);
        }
         return resultado;
    }
    
    public static int invertirNumero(int a, int posicion){
        int resultado;
        //Si es menor que 10 devuelvo el numero (el ultimo numero)
        if(a < 10){
            resultado = a; 
        }else{
            //Cojo el modulo del numero y lo multiplico por la potencia (4 * 100) por ejemplo
            resultado = (a % 10) * (int) Math.pow(10, posicion) + (invertirNumero(a/10, posicion-1));
        }
        return resultado;
    }
    
    public static int digitos(int a){
        //Programa que suma los dígitos del número otorgado.
        int res;
        if(a<10){
           res = a; 
        }else{
            res = (a%10)+(digitos(a/10));
        }
        return res;
    }
    
    public static void mismaLinea(int numero) throws Exception{
        /*Realiza un programa en el que introduzcas 1 número entre el 5 y el 20 (se debe
        validar esto) y muestre los números desde el 1 hasta ese número y vuelta hasta
        el 1 en una misma línea. (2 puntos)
        Ejemplo de ejecución:
        Introduce número: 22
        Error. Introduce número: 7
        1 2 3 4 5 6 7 6 5 4 3 2 1*/
        
        Scanner sc = new Scanner(System.in);
        int dato=1,i;
        
        if(numero<5 || numero>20){
            throw new Exception();
        }else{
            for (i = 1; i <= numero; i++) {
                System.out.print(i+" ");
            }
            for (i = numero-1; i > 0; i--) {
                System.out.print(" "+i);
            }
        }
        
    }
    
    public static int fibonacci(int numero) throws Exception{
        /*Realiza un programa pida un número entero por pantalla (se debe validar esto)
        y muestre todos los números de la serie Fibonacci hasta ese número (serie
        numérica que empieza con el 0 y el 1 y a partir de ahí va generando números
        nuevos a partir de la suma de los dos anteriores) (2 puntos)
        Ejemplo de ejecución:
        Introduce número: -5
        Error. Introduce número: 35
        0 1 1 2 3 5 8 13 21 34*/
        int resultado;
        
        if(numero<0){
            throw new Exception();
        }else{
            if(numero==1 || numero==0){
                resultado= 1;
            }else{
                resultado = fibonacci(numero-1)+fibonacci(numero-2);
            }
        }
        return resultado;
    }
    
    public static void loteria() throws Exception{
        /*Realiza un programa que simule ser un sorteo de lotería. Debe pedir por
        pantalla 5 números entre el 0 y el 9 (se debe validar esto) y cada uno pertenece
        a un fragmento de código (El primero será las decenas de millar, el segundo
        unidades de millar... y el último las unidades) y debe terminar construyendo el
        número de lotería premiado. Es obligatorio que en este ejercicio la recogida de
        los números y la construcción del número premiado se haga dentro de un
        bucle. (3 puntos)
        Ejemplo de ejecución1:
        Introduce número: 5
        Introduce número: 6
        Introduce número: 2
        Introduce número: 0
        Introduce número: 8
        El número premiado es el 56208*/
        
        System.out.println("Introduzca los números de su boleto de lotería.");
        Scanner sc = new Scanner(System.in);
        int boleto[] = new int[5];
        
        for (int i = 0; i < boleto.length; i++) {
            System.out.println("Número "+(i+1));
            boleto[i]=sc.nextInt();
            if(boleto[i]<0 || boleto[i]>9){
                throw new Exception();
            }
        }
        
        System.out.println("Su boleto es: ");
        for (int i = 0; i < boleto.length; i++) {
            System.out.print(boleto[i]);
        }
    }
    
    public static void listaProductos(){
        /*Realiza un programa que pida n artículos por pantalla, de cada artículo debe
        pedirnos su nombre y su precio. Después de cada artículo debemos preguntar
        si deseamos seguir introduciendo objetos, si la respuesta es “sí” seguiremos
        pidiendo artículos. Cuando no deseemos seguir introduciendo artículos
        mostraremos el importe total de la compra y el nombre del artículo más caro.
        (3 puntos)*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte nombre y precio de los 10 productos");
        String salir="";
        String productos[] = new String[10];
        int precios[] = new int[10];
        int i=0,precioMaximo=0;
        
        do{
            System.out.println("Artículo "+(i+1)+" nombre:");
            productos[i]=sc.nextLine();
            System.out.println("Precio de "+productos[i]+" :");
            precios[i]=sc.nextInt();sc.nextLine(); //Cuidado con el retorno de carro
            i++;
            
            System.out.println("¿Salir ya?");
            salir = sc.nextLine();
        }while(!salir.equals("salir"));
        
        System.out.println("El producto más caro es");
        for (int j = 0; j < precios.length; j++) {
            if(precioMaximo<precios[j]){
                precioMaximo = precios[j];
            }
        }
        System.out.println(precioMaximo);
    }
    
}
