/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class EjerciciosDeCasaParaRepasarParaExamen {
    public static void main(String[] args) {
        try{
        System.out.println("Introduzca el número que quiere como tabla de multiplicar.");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        tabla(numero);
        
        Random rd = new Random();
        int aleatorio = rd.nextInt(10)+1;
        loteria(aleatorio);
        
        System.out.println("Introduzca el número a factorizar.");
        int factor = sc.nextInt();
        int resul = factorial(factor);
        System.out.println("El número factorizado es "+resul);
        
        boolean patri = false;
        boolean res = resucitar(patri);
        if(res=true){
            System.out.println("Patri ha resucitado :D");
        }else{
            System.out.println("Ha sucedido algo horrible D:");
        }
        
        nombreAleatorio();
        
        String insulto1 = "calvo";
        String ress = calculadoraInsultos(insulto1, insulto1);
        System.out.println(insulto1+" + "+insulto1+" = "+ress);
        
        susto();
        
        }catch(Exception ex){
            System.out.println("Ha salido el error de "+ex);
        }finally{
            System.out.println("Ejercicios de repaso");
        }
    }
    
    public static void tabla(int n){  //TABLA DE MULTIPLICAR
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
    
    public static void loteria(int n){ //LOTERÍA
        Scanner sc = new Scanner(System.in);
        int acierto=0;
        System.out.println("Número a acertar -> "+n);
        System.out.println("Tienes tres intentos.");
        
        int i = 1;
        while(i<=3 && acierto != n){ //CUIDADO CON LOS OR Y AND
            System.out.println("Intento número "+i);
            acierto = sc.nextInt();
            if(acierto == n){
                System.out.println("Has acertado");
            }else{
                i++;
            }
        }
        
        if(i>3){
            System.out.println("Límite de intentos.");
        }else if(acierto == n){
            System.out.println("Has ganado");
        }else{
            System.out.println("No sé qué has hecho.");
        }
    }
    
    public static int factorial(int n){
        int resultado;
        if(n<1){
            resultado = 1;
        }else{
            resultado = n*factorial(n-1);
        }
        return resultado;
    }
    
    public static boolean resucitar(boolean n){
        boolean resultado;
        if(n=false){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
    
    public static void nombreAleatorio(){
        String nombres[] = {"Mar","Anton","Juan","Mique","Vic"};
        Random rd = new Random();
        int posAleatoria;
        
        for (int i = 0; i < nombres.length; i++) {
            posAleatoria = rd.nextInt(nombres.length)+0;
            System.out.print(nombres[posAleatoria]);
        }
    }
    
    public static String calculadoraInsultos(String a, String b){
        String resultado = "alopécico";
        return resultado;
    }
    
    public static void susto(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int random = rd.nextInt(10)+1, ale;
        String susto = "¡BOO!";
        do{
            String pausa = sc.nextLine();
            ale = rd.nextInt(10)+1;
            if(ale == random){
                System.out.println(susto);
            }
        }while(ale != random);
    }
}
