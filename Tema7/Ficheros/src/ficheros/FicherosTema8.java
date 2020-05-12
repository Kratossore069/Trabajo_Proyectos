/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class FicherosTema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* OutputStreamWriter osw = new OutputStreamWriter(System.out);
        try {
            osw.write("Hola Mundo!".toCharArray());
            Thread.sleep(20000);
            osw.write("Cuanto tiempo!".toCharArray());
            osw.close();
        } catch (IOException ex) {

        } catch (InterruptedException ex) {
            Logger.getLogger(FicherosTema8.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        InputStreamReader isr = new InputStreamReader(System.in);
        /*try {
            //char c = (char) isr.read();
            char array[] = new char[16];
            isr.read(array);
            isr.close();
            System.out.println("Esto es "+new String(array));
        } catch (IOException ex) {
            Logger.getLogger(FicherosTema8.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        /* BufferedReader al = new BufferedReader(isr);
        try {
            String texto = al.readLine();
            System.out.println("Recibimos "+texto);
        } catch (IOException ex) {
            Logger.getLogger(FicherosTema8.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        /*OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter br = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(br);
        pw.format("el valor de PI: %.3f ", 3.1415926);
        pw.print("ptra linea");
        pw.close();*/
        //Emular un sc.nextLine()

    
}
    /*public static String miNextLine() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String retorno = "";
        try {
            retorno = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(FicherosPruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }*/


