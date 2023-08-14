package customers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ICustomerService customerService(){
        CustomerService customerService = new CustomerService();
        customerService.setCustomerDAO(customerDAO());
        customerService.setEmailSender(emailSender());
        return customerService;
    }

    @Bean IEmailSender emailSender(){
        EmailSender emailSender = new EmailSender(logger());
        return emailSender;
    }

    @Bean
    public ICustomerDAO customerDAO(){
        CustomerDAO customerDAO = new CustomerDAO(logger());
        return customerDAO;
    }

    @Bean
    public ILogger logger(){
        return new Logger();
    }
}
