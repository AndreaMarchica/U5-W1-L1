package andreamarchica.U5W1L1;

import andreamarchica.U5W1L1.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1L1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1L1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1L1Application.class);

	Pizza pizzaPEF = (Pizza) ctx.getBean("getPizzaProsciuttoEFunghi");
	System.out.println(pizzaPEF);


/*	System.out.println(ctx.getBean("getPizzaProsciuttoEFunghi"));
	System.out.println(ctx.getBean("getPizzaQuattroFormaggi"));*/

	ctx.close();
	}
}
