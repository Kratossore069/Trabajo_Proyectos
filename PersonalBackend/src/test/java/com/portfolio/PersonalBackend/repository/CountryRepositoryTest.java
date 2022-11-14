package com.portfolio.PersonalBackend.repository;

import com.portfolio.PersonalBackend.model.Country;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CountryRepositoryTest {

    @Autowired
    private CountryRepository countryRepository;

    public Country createNewCountry() {
        Country newCountry = new Country();
        newCountry.setId(1L);
        newCountry.setName("Melilla");
        return newCountry;
    }

    @Test
    public void findAllTest() {
        assertTrue(countryRepository.count() == 0);
    }

    @Test
    public void addCountryTest() {
        Country savedCountry = countryRepository.save(this.createNewCountry());
        assertTrue(countryRepository.count() == 1);
    }

    @Test
    public void deleteCountryTest() {
        Country savedCountry = countryRepository.save(this.createNewCountry());
        countryRepository.delete(savedCountry);
        assertTrue(countryRepository.count() == 0);
    }

    @Test
    public void updateTest() {
        Country savedCountry = countryRepository.save(this.createNewCountry());
        savedCountry.setName("Badajoz");
        assertEquals("Badajoz",savedCountry.getName());
    }
}
