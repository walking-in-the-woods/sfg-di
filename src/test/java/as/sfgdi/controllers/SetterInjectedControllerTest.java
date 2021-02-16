package as.sfgdi.controllers;

import as.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService()); // we use a setter to inject that service impl.
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}