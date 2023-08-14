package customers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Aspect
@Configuration
public class LogAdvice {
    @After("execution(* customers.EmailSender.sendEmail(..))")
    public void sendEmail(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String email = (String) args[0];
        String message = (String) args[1];
        System.out.println(LocalDateTime.now() + " method=" + joinPoint.getSignature().getName()
        + " address=" + email + " message=" + message);
    }
}
