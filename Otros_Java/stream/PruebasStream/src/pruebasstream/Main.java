/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Main {
    
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("1111AAA", Modelo.BMW, 10000, "Antonio",56,"Casado"));
        vehiculos.add(new Vehiculo("2222BBB", Modelo.AUDI, 20000, "Pedro",31,"Casado"));
        vehiculos.add(new Vehiculo("3333CCC", Modelo.OPEL, 30000, "Juan Palomo",45,"Soltero"));
        vehiculos.add(new Vehiculo("4444DDD", Modelo.BMW, 100000, "María Silvia",28,"Soltero"));
        vehiculos.add(new Vehiculo("5555EEE", Modelo.AUDI, 200000, "Cristina",30,"Soltero"));
        vehiculos.add(new Vehiculo("6666FFF", Modelo.OPEL, 300000, "Juanito Paleto",67,"Casado"));
        vehiculos.add(new Vehiculo("7777GGG", Modelo.CITROEN, 0, "Carmencita Milagros",15,"Soltero"));
        
        //Listar los casados y su información
        
        System.out.println("Mostrar los casados");
        
        List<Vehiculo> casamiento = vehiculos.stream()
                .filter(a->a.getEstadoCivil().equals("Casado"))
                .collect(Collectors.toList());
        
        System.out.println(casamiento+"\n");
        
        //Sacar solamente el nombre de la persona que tenga un Citroen.
        
        System.out.println("Persona con un Citroen");
        
        List<String> per =vehiculos.stream()
                .filter(persona->persona.getModelo().equals(Modelo.CITROEN))
                .map(duenio->duenio.getDuenio())
                .collect(Collectors.toList());
        
        System.out.println(per+"\n");
        
        //Sacar la gente mayor de 40 y que tiene un bmw
        
        System.out.println("Gente>40 y que tiene un bmw");
        
        List<Vehiculo> personal = vehiculos.stream()
                .filter(personita->(personita.getEdad()>40)&&(personita.getModelo().equals(Modelo.BMW)))
                .collect(Collectors.toList());
        
        System.out.println(personal+"\n");
        
        //Sacar las edades de los propietarios de opel
        
        System.out.println("Edades de los dueños de Opel");
        
        vehiculos.stream()
                .filter(modelo->modelo.getModelo().equals(Modelo.OPEL))
                .map(edad->edad.getEdad())
                .forEach(System.out::println);
        
        System.out.println("---------------------------------");
        
        
        
        //Sacar los kilómetros de los coches
        
        System.out.println("Kilómetros de los coches");
        
        List<Integer> km = vehiculos.stream()
                .map(kilometros->kilometros.getKilometros())
                .collect(Collectors.toList());
        
        System.out.println(km+"\n");
        
        
        
        
        //Sacar modelos solo AUDI
        
        System.out.println("Modelos AUDI");
        
        List<Vehiculo> modelos = vehiculos.stream()
                .filter(modelo -> modelo.getModelo().equals(Modelo.AUDI))
                .collect(Collectors.toList());
        
        System.out.println(modelos+"\n");
        
        
        
        
        //Ordenar por kilómetros
        
        System.out.println("Ordenar por kilómetros");
        
        List<Vehiculo> result = vehiculos.stream()
        .sorted((v1, v2) -> Integer.compare(v1.getKilometros(), v2.getKilometros()))
        .collect(Collectors.toList());
        
        System.out.println(result+"\n");
        
        
        
        
        //Lista de modelos
        
        List<Modelo> modelazo = vehiculos.stream()
                .map(model->model.getModelo())
                .collect(Collectors.toList());
        
        System.out.println(modelazo+"\n");
        
        
        
        
        //Sacar solo matrículas
        
        List<String> matis =vehiculos.stream()
                .map(matricu->matricu.getMatricula())
               .collect(Collectors.toList());
        
        System.out.println(matis+"\n");
        
        
        
        
    }
    
}
