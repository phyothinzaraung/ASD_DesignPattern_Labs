package cor;

public class RedHandler extends CounterHandler{
    public RedHandler(CounterHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleCounter(int counterValue) {
        if(counterValue == 12 || counterValue == 13 ||(counterValue % 2 == 0 && counterValue < 10)){
            System.out.println("Red");
        }else {
            nextHandler.handleCounter(counterValue);
        }
    }
}
