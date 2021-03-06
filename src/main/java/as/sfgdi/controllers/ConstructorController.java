package as.sfgdi.controllers;

import as.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {

    private GreetingService greetingService;

    public ConstructorController(@Qualifier("constructorGreetingService")
                                                 GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
