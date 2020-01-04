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
        this.letra = calcularLetra(dniNum);
    }

    public DNI() {
        letra = calcularLetra(dniNum);
    }

    public DNI(String strDNI) throws Exception {
        if (validarDNI(strDNI)) {
            this.dniNum = Integer.parseInt(strDNI.substring(0, 8));
            this.letra = strDNI.toUpperCase().charAt(strDNI.length() - 1);
        } else {
            throw new Exception("No es DNI válido.");
        }
    }

    //MÉTODOS
    /*public String validarDNI(String dni){
        
    }*/
    public static char calcularLetra(int num) {
        return LETRAPOSIBLE.charAt(num % 23);
    }

    /*private int sumarCifrasNumero(int a) {
        int res = 0;
        while (a > 0) { //Método para sumar dígito por dígito

            res += a % 10;

            a = a / 10;
        }
        return res;
    }*/
    public boolean validarDNI(String strDNI) {
        boolean res = true;
        int numDNI;
        try {
            numDNI = Integer.parseInt(strDNI.substring(0, 8));
            char letra = calcularLetra(numDNI);
            char letraStrDNI = strDNI.toUpperCase().charAt(strDNI.length() - 1);
            if (letra == letraStrDNI) {
                res = true;
            } else {
                res = false;
            }
        } catch (Exception ex) {
            res = false;
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
        try {
            miDni.calcularLetra(12345678);
        } catch (Exception ex) {

        }
    }

}
