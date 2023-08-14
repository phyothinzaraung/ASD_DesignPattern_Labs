package cor;

public class BlueHandler extends CounterHandler{
    public BlueHandler(CounterHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleCounter(int counterValue) {
        if(counterValue == 17 || counterValue == 19 || (counterValue % 2 != 0 && counterValue < 15)){
            System.out.println("Blue");
        }else {
            nextHandler.handleCounter(counterValue);
        }
    }
}
