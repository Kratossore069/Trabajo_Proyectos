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
class Clock {

    //Atributos
    private int horas, minutos, segundos;

    //Getter Y Setter
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    //Constructores
    public Clock(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public Clock(String strHora) throws Exception{
        if(!establecerHora(strHora)){
            throw new Exception("Hora no válida");
        }
        establecerHora(strHora);
    }

    //Métodos
    public boolean establecerHora(String strHora) throws Exception {

        boolean res = false;
        String array[] = strHora.split(":");

        if (array.length < 2 || array.length > 3 || strHora.length() < 5 || strHora.length() > 8) {
            res = false;
        } else {
           
            try {
                int horas = Integer.parseInt(array[0]);
                int minutos = Integer.parseInt(array[1]);
                int segundo =0;
                if(array.length == 3){
                    segundo = Integer.parseInt(array[2]);
                }
                if (horas > 23 || horas < 0) {
                    res = false;
                } else if (minutos > 59 || minutos < 0) {
                    res = false;
                } else if (segundos > 59 || segundos < 0) {
                    res = false;
                }
                if (res) {
                    this.horas = horas;
                    this.minutos = minutos;
                    this.segundos = segundo;
                }
            } catch (NumberFormatException ex) {
                res = false;
                //throw new Exception();
            }
        }
        return res;
    }
    
    @Override
    public String toString(){
        return (horas>10)?""+this.horas:"0"+this.horas+
                (minutos>10)?""+this.minutos:"0"+this.minutos+
                (segundos>10)?""+this.segundos:"0"+this.segundos;
    }

    public boolean establecerHora(int array[]) {
        /* strHora.split(strHora);
        boolean res = false;

        return res;*/
    }

    public void formatoHora() {

    }

    public void incrementarHora(int horas) {
        this.horas += horas;
        this.horas %= 24;
        /*if (this.horas == 24) {
            this.horas -= 24;
        }*/
    }

    public void incrementarMinutos(int minutos) {
        this.minutos += minutos;
        incrementarHora(this.minutos / 60);
        this.minutos %= 60;

        /*if (this.minutos >= 60) {
            this.horas++;
        } else {
            this.minutos = this.minutos;
        }*/
    }

    public void incrementarSegundos(int segundos) {
        this.segundos += segundos;
        incrementarMinutos(this.segundos / 60);
        this.segundos %= 60;

        /*if (this.segundos >= 60) {
            this.minutos++;
        } else {
            this.segundos += segundos;
        }*/
    }

    public void mostrar() {
        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
    
    /**
     * @param strHora un string con el formato: 20:25:52
     * @return Devuelve true si pudo establecer la hora dada por el usuario, falso en el otro caso
     */
}

public class RelojMundial {

    public static void main(String[] args) {

        Clock reloj = new Clock(12, 25, 52);

        //reloj.incrementarHora(52);
        /*reloj.incrementarMinutos(59);

        reloj.mostrar();*/
        reloj.establecerHora(new int[]{2, 3, 4});
        reloj.establecerHora("2:11");
        
        try{
            Clock t = new Clock("20:51:25");
        }catch(Exception ex){
            System.out.println("Hora no válida");
        }
    }

}
