package customers;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementService {

    @EventListener
    public void onEvent(AddCustomerEvent event){
        System.out.println("Received message: " + event.getMessage());
    }
}
