/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class prct39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Número de dos cifras");
        String numero = s.nextLine();
        String invertido = "";
        for(int i = 0; i<numero.length(); i++){
            invertido += ""+numero.charAt(i)+invertido;
        }
        System.out.println("Invertido:" +invertido);
        /*String invertido = ""+numero.charAt(1)+numero.charAt(0);
        System.out.println(invertido);*/
        // for(in i = numero.length()-1; i>=0; i--)
    }
}
