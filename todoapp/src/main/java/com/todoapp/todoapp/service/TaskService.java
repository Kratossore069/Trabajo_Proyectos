package com.todoapp.todoapp.service;

import com.todoapp.todoapp.exceptions.ToDoExceptions;
import com.todoapp.todoapp.mapper.TaskInDtoToTask;
import com.todoapp.todoapp.persistence.entity.Task;
import com.todoapp.todoapp.persistence.entity.TaskStatus;
import com.todoapp.todoapp.persistence.repository.TaskRepository;
import com.todoapp.todoapp.service.dto.TaskInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    @Autowired
    private TaskInDtoToTask mapper;

    public Task createTask(TaskInDTO taskInDTO) {
        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
    }

    /**
     * Method to count all registers in bdd
     * @return number of registers in bdd
     */
    public long findAllRegisters(){
        return this.repository.count();
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
