package as.sfgdi.controllers;

import as.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorControllerTest {

    ConstructorController controller;

    // The most preferred method. We're using a constructor to inject the service implementation.
    @BeforeEach // this is what Spring Framework does
    void setUp() {
        controller = new ConstructorController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}