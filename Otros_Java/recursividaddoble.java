/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video18;

/**
 *
 * @author Victor
 */
public class masrecursividad {
    public void numeros(int x){
        if(x<5){
            System.out.println(x+"");
            numeros(x + 1);
        }
    }
    
    public int factorial(int x){
        if(x>0){
            int valor = x * factorial(x-1);
            return valor;
        }
        return 1;
    } 
    public static void main(String[] args) {
        masrecursividad nombreCualquiera = new masrecursividad();
        int num = 1;
        nombreCualquiera.numeros(num);
        
        int num2 = 3;
        int factor = nombreCualquiera.factorial(num2);
        System.out.println("El factorial de "+num2+" es "+factor);
    }
}
