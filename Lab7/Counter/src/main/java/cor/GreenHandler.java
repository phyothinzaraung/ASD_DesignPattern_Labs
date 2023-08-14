package cor;

public class GreenHandler extends CounterHandler{
    public GreenHandler(CounterHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleCounter(int counterValue) {
        if(counterValue >=10 && counterValue % 2 ==0 && counterValue != 12 && counterValue != 13){
            System.out.println("Green");
        }else {
            nextHandler.handleCounter(counterValue);
        }
    }
}
