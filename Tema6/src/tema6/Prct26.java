/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct26 {
    public static void main(String[] args) {

        /*
        Práctica 26: Crear la interfaz funcional: Mates que tiene el método:
        public abstract int calc(int x);
        En el main crear una lambda para obtener el número al cuadrado, otra para calcular el
        factorial. Crea un método parecido al anterior: mostrarResultado(int x, Mates func) que nos
        muestre en pantalla el resultado. Pasarle tanto el factorial como el cuadrado
         *///////////////////////////
        
        int numero = 5;

        Mates cuadrado = (num) -> num*num;

        cuadrado.calc(numero); //La llamo
        
        //////////////////////////////

        Mates factorial = (num) -> {
            int fact=1;
            while (num != 0) {
                fact = fact * num;
                num--;
            }
            return num;
        };
        
        factorial.calc(numero);
        
        /////////////////////////////////
        
        Mates mostrar = new Mates(){
            

            @Override
            public void mostrarResultado(int x, Mates func) {
                System.out.println(x+" es "+func);
            }

            @Override
            public int calc(int x) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        
        mostrar.mostrarResultado(numero, factorial); //Sale una dirección de memoria
        
        mostrar.mostrarResultado(numero, cuadrado);
        //reduce
        
        mostrarResultado(numero, cuadrado); //Esta es la forma buena.
        mostrarResultado(numero, factorial);
        

    }
    
    public static void mostrarResultado(int x, Mates func){
        System.out.println(func.calc(x));
    }
}
