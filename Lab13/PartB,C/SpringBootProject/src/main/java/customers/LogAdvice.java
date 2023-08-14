package customers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

import java.time.LocalDateTime;

@Aspect
@Configuration
public class LogAdvice {
    @After("execution(* customers.EmailSender.sendEmail(..))")
    public void sendEmail(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String email = (String) args[0];
        String message = (String) args[1];
        EmailSender emailSender = (EmailSender) joinPoint.getTarget();
        System.out.println(LocalDateTime.now() + " method=" + joinPoint.getSignature().getName()
        + " address=" + email + " message=" + message + " outgoing mail server=" + emailSender.getOutgoingMailServer());
    }

    @Around("execution(* customers.CustomerDAO.*(..))")
    public Object invoke(ProceedingJoinPoint call) throws Throwable{
        StopWatch sw = new StopWatch();
        sw.start(call.getSignature().getName());
        Object retVal = call.proceed();
        sw.stop();

        long totaltime = sw.getLastTaskTimeMillis();
        System.out.println("Total time: " + totaltime);

        return retVal;
    }
}
