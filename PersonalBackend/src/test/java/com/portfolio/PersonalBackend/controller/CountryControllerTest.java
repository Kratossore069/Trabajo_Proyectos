package com.portfolio.PersonalBackend.controller;

import com.portfolio.PersonalBackend.model.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CountryControllerTest {

    @Autowired
    private CountryController countryController;

    @Test
    void listAllCountries() {
        ResponseEntity<List<Country>> httpResponse = countryController.getAllCountries();
        assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
    }
}