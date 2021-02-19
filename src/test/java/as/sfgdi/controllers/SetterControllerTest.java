package as.sfgdi.controllers;

import as.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterControllerTest {

    SetterController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterController();
        controller.setGreetingService(new ConstructorGreetingService()); // we use a setter to inject that service impl.
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}