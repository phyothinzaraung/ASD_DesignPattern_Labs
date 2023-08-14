package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerService customerService;


	public static void main(String[] args) {

//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		ICustomerService customerService = context.getBean("customerService",
//				ICustomerService.class);

		SpringApplication.run(Application.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		customerService.addCustomer("Frank Brown", "fbrown@acme.com",
				"mainstreet 5", "Chicago", "60613");
	}
}
