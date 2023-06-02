package com.todoapp.todoapp;

import static org.junit.jupiter.api.Assertions.*;

import com.todoapp.todoapp.controller.TaskController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TodoappApplicationTests {

	@Mock
	private TaskController taskController;

	@Test
	void contextLoads() {
		assertEquals(0,taskController.findAllRegisters());
	}

}
