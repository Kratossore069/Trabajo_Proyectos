package com.portfolio.RegistrationLoginSystem.web;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

    @Autowired
    private MainController mainController;

    @Test
    public void login() {
        Assert.assertEquals("login",mainController.login());
    }

    @Test
    public void home() {
        Assert.assertEquals("index",mainController.home());
    }
}