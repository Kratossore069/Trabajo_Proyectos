package com.portfolio.PersonalBackend.repository;

import com.portfolio.PersonalBackend.model.Country;
import com.portfolio.PersonalBackend.model.UserDatabase;
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
public class UserDatabaseRepoTest {

    @Autowired
    private UserDatabaseRepository userDatabaseRepository;

    @Test
    public void createNewUserTest() {
        UserDatabase newUser = new UserDatabase();
        newUser.setName("admin");
        newUser.setPassword("admin");
        UserDatabase savedUser = userDatabaseRepository.save(newUser);
        assertTrue(savedUser.getName().equals(newUser.getName()));
    }
}
