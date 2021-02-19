package as.sfgdi;

import as.sfgdi.controllers.ConstructorController;
import as.sfgdi.controllers.MyController;
import as.sfgdi.controllers.PropertyController;
import as.sfgdi.controllers.SetterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.hello());

		System.out.println(ctx.getBean(PropertyController.class).sayHello());
		System.out.println(ctx.getBean(SetterController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorController.class).sayHello());
	}

}
