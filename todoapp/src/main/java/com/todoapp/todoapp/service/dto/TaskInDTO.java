package com.todoapp.todoapp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TaskInDTO {
    private String title;
    private String description;
    private LocalDateTime eta;
}
