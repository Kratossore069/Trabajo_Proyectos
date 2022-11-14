package com.pruebas.ToDoListProyecto.mapper;

import com.pruebas.ToDoListProyecto.dto.TaskDto;
import com.pruebas.ToDoListProyecto.model.Task;
import com.pruebas.ToDoListProyecto.model.TaskStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskDtoToTask implements InterfaceMapper<TaskDto, Task>{

    @Override
    public Task map(TaskDto in) {
        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setTimeData(in.getTimeData());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
}
