package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class LoggerTask {

    private ILogger logger;

    @Autowired
    LoggerTask(ILogger logger){
        this.logger = logger;
    }

    @Scheduled(fixedRate = 15000)
    public void log(){
        Date date = Calendar.getInstance().getTime();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        String currentTime = timeFormatter.format(date);
        logger.log("This task is running at " + currentTime);
    }
}
