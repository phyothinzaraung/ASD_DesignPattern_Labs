package webshop.order;

import org.springframework.stereotype.Service;

@Service
public class EmailSender {
    public void sendEmail(String emailAddress, String message){
        System.out.println("EmailSender: send email to address "+emailAddress+" with message: "+message);
    }
}
