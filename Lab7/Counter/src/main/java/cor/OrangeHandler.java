package cor;

public class OrangeHandler extends CounterHandler{
    public OrangeHandler(CounterHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleCounter(int counterValue) {
        if(counterValue != 17 && counterValue != 19 && counterValue % 2 != 0 && counterValue >= 15){
            System.out.println("Orange");
        }
    }
}
