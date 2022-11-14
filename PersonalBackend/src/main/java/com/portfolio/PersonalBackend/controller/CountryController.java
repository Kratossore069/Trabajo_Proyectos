package com.portfolio.PersonalBackend.controller;

import java.util.List;

import com.portfolio.PersonalBackend.model.Country;
import com.portfolio.PersonalBackend.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/country/")
@CrossOrigin
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<List<Country>> getAllCountries (){
        return ResponseEntity.ok(countryService.findAll());
    }
}
