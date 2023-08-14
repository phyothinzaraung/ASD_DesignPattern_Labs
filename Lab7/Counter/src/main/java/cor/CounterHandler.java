package cor;

public abstract class CounterHandler {

    protected CounterHandler nextHandler;

    public CounterHandler(CounterHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public CounterHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void handleCounter(int counterValue);
}
