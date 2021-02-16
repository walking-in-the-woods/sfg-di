package as.sfgdi.controllers;

import as.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl()); // we use a setter to inject that service impl.
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}