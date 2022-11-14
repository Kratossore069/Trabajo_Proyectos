package com.portfolio.PersonalBackend.controller;

import static org.junit.jupiter.api.Assertions.*;

import com.portfolio.PersonalBackend.model.Country;
import com.portfolio.PersonalBackend.model.State;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class StateControllerTest {

    @Autowired
    private StateController stateController;

    @Test
    public void getAllStatesTest(){
        ResponseEntity<List<State>> httpResponse = stateController.getAllStatesByCountry(1L);
        assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
    }

}