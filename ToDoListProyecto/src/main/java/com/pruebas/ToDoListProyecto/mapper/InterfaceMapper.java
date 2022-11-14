package com.pruebas.ToDoListProyecto.mapper;

public interface InterfaceMapper <I, O>{
    /**
     * I reference to the DTO and O
     * to the output data like Task
     * @param in is the DTO
     * @return object output Task
     */
    public O map(I in);
}
