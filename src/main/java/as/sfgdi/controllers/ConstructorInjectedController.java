package as.sfgdi.controllers;

import as.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    // The @Autowired annotation for a constructor is optional. So, it will work without the annotation
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService")
                                                 GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
