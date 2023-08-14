package customers;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerRatingService {

    @EventListener
    public void onEven(AddCustomerEvent event){
        System.out.println("Received message: " + event.getMessage());
    }
}
