package com.pruebas.ToDoListProyecto.service;

import com.pruebas.ToDoListProyecto.dto.TaskDto;
import com.pruebas.ToDoListProyecto.exceptions.ToDoExceptions;
import com.pruebas.ToDoListProyecto.mapper.TaskDtoToTask;
import com.pruebas.ToDoListProyecto.model.Task;
import com.pruebas.ToDoListProyecto.model.TaskStatus;
import com.pruebas.ToDoListProyecto.repository.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository repository;
    private final TaskDtoToTask mapper;

    public TaskService(TaskRepository repository, TaskDtoToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskDto taskInDTO) {
        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
    }

    public List<Task> findAll() {
        return this.repository.findAll();
    }

    public List<Task> findAllByTaskStatus(TaskStatus status) {
        return this.repository.findAllByTaskStatus(status);
    }

    @Transactional
    public void updateTaskAsFinished(Long id) {
        Optional<Task> optionalTask = this.repository.findById(id);
        if (optionalTask.isEmpty()) {
            throw new ToDoExceptions("Task not found", HttpStatus.NOT_FOUND);
        }

        this.repository.markTaskAsFinished(id);
    }

    public void deleteById(Long id) {
        Optional<Task> optionalTask = this.repository.findById(id);
        if (optionalTask.isEmpty()) {
            throw new ToDoExceptions("Task not found", HttpStatus.NOT_FOUND);
        }

        this.repository.deleteById(id);
    }

}
