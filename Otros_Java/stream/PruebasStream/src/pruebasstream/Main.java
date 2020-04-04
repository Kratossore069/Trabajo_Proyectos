/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Main {
    
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("1111AAA", Modelo.BMW, 10000));
        vehiculos.add(new Vehiculo("2222BBB", Modelo.AUDI, 20000));
        vehiculos.add(new Vehiculo("3333CCC", Modelo.OPEL, 30000));
        vehiculos.add(new Vehiculo("4444DDD", Modelo.BMW, 100000));
        vehiculos.add(new Vehiculo("5555EEE", Modelo.AUDI, 200000));
        vehiculos.add(new Vehiculo("6666FFF", Modelo.OPEL, 300000));
        vehiculos.add(new Vehiculo("7777GGG", Modelo.CITROEN, 0));
        
        
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
        
        vehiculos.stream()
                .map(matricu->matricu.getMatricula())
                .forEach(System.out::println);
        
        
    }
    
}
