package customers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Aspect
@Configuration
public class EmailSenderAdvice {
    @After("execution(* customers.EmailSender.sendEmail(..))")
    public void sendEmail(JoinPoint joinPoint){
        System.out.println(LocalDateTime.now() + " method=" + joinPoint.getSignature().getName());
    }
}
