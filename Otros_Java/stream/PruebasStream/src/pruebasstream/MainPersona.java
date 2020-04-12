/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasopaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainPersona {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Antonio", "Padilla", 50, 170, 45.2, Sexo.HOMBRE));

        personas.add(new Persona("Juan", "Español", 60, 180, 46.5, Sexo.HOMBRE));

        personas.add(new Persona("María", "Padilla", 45, 160, 49.5, Sexo.MUJER));

        personas.add(new Persona("Olga", "Martín", 24, 150, 32.8, Sexo.MUJER));

        personas.add(new Persona("Tito", "Salas", 38, 190, 20.3, Sexo.HOMBRE));

        personas.add(new Persona("Juan", "Madrid", 13, 130, 30.6, Sexo.HOMBRE));

        personas.add(new Persona(null, "Desconocido", 20, 180, 50.5, null));

        //Gente menor que 180 cm
        List<Persona> bajitos = personas.stream()
                .filter(p -> p.getAlturaEnCm() < 180)
                .collect(Collectors.toList());

        System.out.println(bajitos + "\n");

        //Nombre y peso de la gente
        List<String> pesoNombre = personas.stream()
                .map(a -> a.getNombre() + " " + a.getPesoEnKg()) //Transformar a String con comillas dobles
                .collect(Collectors.toList());

        System.out.println(pesoNombre + "\n");

        //Sacar los datos de solo la familia Padilla
        List<Persona> padilla = personas.stream()
                .filter(apellido -> apellido.getApellido1().equals("Padilla"))
                .collect(Collectors.toList());

        System.out.println(padilla + "\n");

        //Listar todos los nombres sin que salga nulo
        List<String> nombres = personas.stream()
                .map(nom -> nom.getNombre()) //Primero sacamos los nombres
                .filter(no -> no != null) //Luego filtramos esos nombres para que no salga null
                .collect(Collectors.toList());

        System.out.println(nombres + "\n");

        //Nombres de las personas que empiecen por "M"
        List<String> nombrazos = personas.stream()
                .map(nom -> nom.getNombre())
                .filter(no -> no != null && (no.startsWith("M")))
                .collect(Collectors.toList());

        System.out.println(nombrazos + "\n");

        //Ordenar por peso mayor a menor (y de menor a mayor)
        List<Persona> ordena = personas.stream()
                //.sorted((p2,p1)->Double.compare(p1.getPesoEnKg(), p2.getPesoEnKg()))
                .sorted((p1, p2) -> Double.compare(p1.getPesoEnKg(), p2.getPesoEnKg()))
                .collect(Collectors.toList());

        System.out.println(ordena + "\n");

        //Listar el número de letras que tiene cada nombre
        personas.stream()
                //al hacer un mapeo a optional nos garantizamos que
                //aunque el array tenga nulos
                //pueda continuar
                .map(a -> Optional.ofNullable(a))
                //está bien lo que intentas... Estás pasando de
                //optional de persona
                //a optional de String ( nombres )
                .map(optPersona -> optPersona.map(persona -> persona.getNombre()))
                .filter(optNombre -> optNombre.isPresent())
                //garantizamos que no haya nulos
                .forEach(optNombre -> {
                    String nombre = optNombre.get();
                    //Saca el nombre, es decir, toma el dato en sí
                    // podemos tomar
                    //el nombre sin miedo a null
                    System.out.println(nombre + ": " + nombre.length());
                });

        System.out.println("");

        //Ordenar alfabéticamente los nombres de las personas que tienen menos de 40 años
        List<String> alfabeto = personas.stream()
                .map(a -> Optional.ofNullable(a))
                //tengo un optional
                .filter(b -> (b.isPresent()) && (b.get().getEdad() < 40))
                //stream de optional de persona
                .map(c -> c.map(d -> d.getNombre()))
                .filter(e -> e.isPresent())
                //hasta aquí obtienes optional
                .map(f -> f.get())
                //aquí transformas a Stream
                .sorted()
                .collect(Collectors.toList());
        System.out.println(alfabeto + "\n");

        //Sacar solamente las edades ordenadas de mayor a menor
        List<Integer> edades = personas.stream()
                .map(a -> Optional.ofNullable(a))
                .filter(Optional::isPresent)
                .map(c -> c.map(d -> d.getEdad()))
                .filter(Optional::isPresent)
                .map(e -> e.get())
                .sorted((e1, e2) -> e2.compareTo(e1))
                .collect(Collectors.toList());

        System.out.println(edades + "\n");

        //Media de las edades
        personas.stream()
                .map(a -> Optional.ofNullable(a)) //optional
                .map(b -> b.map(eda -> eda.getEdad()))
                //stream de optional de edades
                .filter(Optional::isPresent)
                .mapToInt(ed -> ed.get())//stream de edades
                .average()
                .ifPresent(media -> {
                    int med = (int) media;
                    System.out.println("La media es " + med+"\n");
                });

        //Edades máxima y mínima
        personas.stream()
                .map(a -> Optional.ofNullable(a))
                .map(b -> b.map(ages -> ages.getEdad()))
                .filter(Optional::isPresent)
                .mapToInt(stredades -> stredades.get())
                .max()
                .ifPresent(datomax->System.out.println("El máximo es "+datomax));
        
        personas.stream()
                .map(a -> Optional.ofNullable(a))
                .map(b -> b.map(ages -> ages.getEdad()))
                .filter(Optional::isPresent)
                .mapToInt(stredades -> stredades.get())
                .min()
                .ifPresent(datomin->System.out.println("El mínimo es "+datomin+"\n"));
        
        
        //Datos de las personas que miden entre 2 y 1.60 metros
        List<String> personasAltas = personas.stream()
                .filter(aa->(aa.getAlturaEnCm()>160)&&(aa.getAlturaEnCm()<200))
                .map(a->Optional.ofNullable(a))
                .map(b->b.map(c->c.toString()))
                .filter(Optional::isPresent)
                .map((d->d.get()))
                .collect(Collectors.toList());
        System.out.println(personasAltas+"\n");
                
                
        //Diferenciar entre hombres y mujeres
        personas.stream()
                .map(Optional::ofNullable) //Stream<Optional<Persona>>
                .filter(Optional::isPresent) //igual que arriba
                .map(a->a.get()) //Stream<Persona> sale una dirección de memoria
                .forEach(dato->{
                    if(dato.getSexo()==Sexo.HOMBRE)
                        System.out.println("Hombres ---> "+dato+"\n");
                    else
                        System.out.println("Mujeres ---> "+dato+"\n");
                });
                
                
                
                
        
                
                

    }

}
