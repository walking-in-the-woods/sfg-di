package as.sfgdi.controllers;

import as.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyControllerTest {

    PropertyController controller;

    // It's the least preferred method. We're setting the property directly here.
    @BeforeEach // here we mimic what a framework does (manual property injection)
    void setUp() {
        controller = new PropertyController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.sayHello());
    }
}