package order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {
    @Autowired
    public EmailSender(){

    }
    public void sendEmail(String emailAddress, String message){
        System.out.println("EmailSender: send email to address "+emailAddress+" with message: "+message);
    }
}
