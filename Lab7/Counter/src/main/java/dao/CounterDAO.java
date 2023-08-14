package dao;

public class CounterDAO implements ICounterDAO{
    @Override
    public void saveCounter(int counterValue) {
        System.out.println("Saving to Database " + counterValue);
    }
}
