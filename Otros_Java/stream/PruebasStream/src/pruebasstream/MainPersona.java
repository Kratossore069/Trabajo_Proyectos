/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasopaso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainPersona{
    
    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        personas.add(new Persona("Antonio", "Padilla",       50, 170,    45.2));
        personas.add(new Persona("Juan",    "Español",       60, 180,    46));
        personas.add(new Persona("María",   "Padilla",       45, 160,    49.5));
        personas.add(new Persona("Olga",    "Martín",        24, 150,    32.8));
        personas.add(new Persona("Tito",    "Salas",         38, 190,    20));
        personas.add(new Persona("Juan",    "Madrid",        13, 130,    30.6));
        personas.add(new Persona(null,      "Desconocido",   20, 180,    50));
        
        //Gente menor que 180 cm
        
        List<Persona> bajitos = personas.stream()
                .filter(p->p.getAlturaEnCm()<180)
                .collect(Collectors.toList());
        
        System.out.println(bajitos+"\n");
        
        //Nombre y peso de la gente
        List<String> pesoNombre = personas.stream()
                .map(a->a.getNombre()+" "+a.getPesoEnKg()) //Transformar a String con comillas dobles
                .collect(Collectors.toList());
        
        System.out.println(pesoNombre+"\n");
        
        //Sacar los datos de solo la familia Padilla
        List<Persona> padilla = personas.stream()
                .filter(apellido->apellido.getApellido1().equals("Padilla"))
                .collect(Collectors.toList());
        
        System.out.println(padilla+"\n");
        
        //Listar todos los nombres sin que salga nulo
        List<String> nombres = personas.stream()
                .map(nom->nom.getNombre()) //Primero sacamos los nombres
                .filter(no->no!=null)      //Luego filtramos esos nombres para que no salga null
                .collect(Collectors.toList());
        
        System.out.println(nombres+"\n");
                
                
        
    }

    
}
