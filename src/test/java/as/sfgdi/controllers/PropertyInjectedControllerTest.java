package as.sfgdi.controllers;

import as.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    // It's the least preferred method. We're setting the property directly here.
    @BeforeEach // here we mimic what a framework does (manual property injection)
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorInjectedGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}