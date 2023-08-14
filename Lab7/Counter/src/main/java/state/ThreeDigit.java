package state;

import counter.Counter;

public class ThreeDigit extends DigitCountState{
    ThreeDigit(Counter counter) {
        super(counter);
    }

    @Override
    public void calculate(boolean isIncrement) {
        if(isIncrement){
            counter.setCount(counter.getCount() + 3);
        }else {
            counter.setCount(counter.getCount() - 3);
        }

        checkForUpdate();
    }

    private void checkForUpdate(){
        if(counter.getCount() < 100){
            DigitCountState twoDigit = new TwoDigit(counter);
            counter.setDigitCountState(twoDigit);
        }
    }

}
