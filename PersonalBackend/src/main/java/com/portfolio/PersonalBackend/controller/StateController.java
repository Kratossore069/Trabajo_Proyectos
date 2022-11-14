package com.portfolio.PersonalBackend.controller;

import java.util.List;

import com.portfolio.PersonalBackend.model.State;
import com.portfolio.PersonalBackend.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/states/")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping ("{id}")
    public ResponseEntity<List<State>> getAllStatesByCountry (@PathVariable("id") Long idCountry){
        return ResponseEntity.ok(stateService.findAllByCountry(idCountry));
    }
}
