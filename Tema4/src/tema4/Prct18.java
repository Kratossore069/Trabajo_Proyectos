/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
class DNI {

    private int dniNum;
    private static final String LETRAPOSIBLE = "TRWAGMYFPDXBNJZSQVHLCKE";
    private char letra;

    //CONSTRUCTORES
    public DNI(int numero) {
        this.dniNum = numero;
        letra = calcularLetra(dniNum);
    }

    public DNI() {
        letra = calcularLetra(dniNum);
    }

    //MÉTODOS
    /*public String validarDNI(String dni){
        
    }*/
    public char calcularLetra(int num) {
        int numeroSumado = sumarCifrasNumero(dniNum);
        int resto = numeroSumado % 23;
        return LETRAPOSIBLE.charAt(resto);
    }

    private int sumarCifrasNumero(int a) {
        int res = 0;
        while (a > 0) { //Método para sumar dígito por dígito

            res += a % 10;

            a = a / 10;
        }
        return res;
    }

    
}

public class Prct18 {

    /* Práctica 18:  Crear una clase DNI  con atributo: int dniNum 
                                                     y atributo String letrasPosiblesel atributo
                                                     letrasPosibles tiene por valor: 
                                                    "TRWAGMYFPDXBNJZSQVHLCKE"  que 
                                                      nossirve   para  
                                                    calcular   la   letra  
                                                     de   un   dni  
                                                    sabiendo   su   número.   
                                                    Basta con dividir el número del DNI por 23 y
                                                     tomar el resto. La letra que ocupe la posicióncorrespondiente en el 
                                                     String letrasPosibles es la letra apropiadahttps:
                                                    //www.letranif.com/formula-para-calcular-la-letra-del-dni/
                                                    Crear los métodos: validarDNI(String dni)  calcularLetra(int num) 
                                                      validarDNI() verifica que un DNI tenga la letra que le corresponde 
                                                       ( para este método   sepuede hacer uso de: Integer.parseInt() 
                                                     para extraer un número de un texto y substring() quenos sirve
                                                      para extraer la subcadena que contiene el número sin incluir 
                                                      la letracalcularLetra() devuelve un char con la letra
                                                        correspondiente al número que se le pase.Crear
                                                          un constructor que reciba un entero que será el número del DNI, y un constructor decopia*/
    
    public static void main(String[] args) {
        DNI miDni = new DNI();
        
        miDni.calcularLetra(12345678);
    }
    

    
}
