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
public class Chlorotica implements Bicho, Planta {

    public void decirHola() {
        Planta.super.decirHola();
        Bicho.super.decirHola();
    }
    
    public static void main(String[] args) {
        Chlorotica a = new Chlorotica();
        a.decirHola();
    }
    
    personas.stream().filter(p->p.pesoenKg<p.calcularpesoideal()).forEach(System.out::println);
    
    personas.stream().filter(p->p.getEdad==27).findFirst().ifPresent(p->sout(p));
    
    ArrayList<Hombre> hombres = (ArrayList<Hombre>)personas.stream().map(p->{
        return new Hombre(p.nombre, p.apellido, p.edad, p.alturaenCm, p.pesoenKg);
    }).collect(Collectors.toList());
    
    double pesoMedioMujeres = personas.stream().
            filter(p->p instanceof Mujer).
            //map(p->p.pesoenKg).
            mapToDouble(p->p.pesoEnKg).
            average().orElse(-1);
    
    personas.stream().mapToDouble(p->p.getEdad()>personas.stream().
            filter(p->p instanceof Mujer).
            //map(p->p.pesoenKg).
            mapToDouble(p->p.pesoEnKg).
            average().orElse(-1)).average().orElse(-1);
    
    personas.stream().filter(p->p.getEdad()>d).forEach(System.out::println);
    
    
}
