package cor;

import Logger.CounterLogger;
import dao.CounterDAO;
import dao.ICounterDAO;

public class CounterValueReceiver {
    private CounterHandler counterHandler;
    private ICounterDAO counterDAO;
    private CounterLogger counterLogger;

    public void setCounterHandler(CounterHandler counterHandler) {
        this.counterHandler = counterHandler;
    }

    public void receiveCounterValue(int counterValue){
        handleCounterValue(counterValue);
        counterDAO = new CounterDAO();
        counterDAO.saveCounter(counterValue);
        counterLogger = new CounterLogger();
        counterLogger.log(counterValue);
    }

    public void handleCounterValue(int counterValue){
        counterHandler.handleCounter(counterValue);

    }
}
