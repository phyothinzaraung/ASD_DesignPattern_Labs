package state;

import counter.Counter;

public class TwoDigit extends DigitCountState{
    TwoDigit(Counter counter) {
        super(counter);
    }

    @Override
    public void calculate(boolean isIncrement) {
        if(isIncrement){
            counter.setCount(counter.getCount() + 2);
        }else {
            counter.setCount(counter.getCount() - 2);
        }
        checkForUpdate();
    }

    private void checkForUpdate(){
        if(counter.getCount() >= 100 && counter.getCount() <= 999){
            DigitCountState threeDigit = new ThreeDigit(counter);
            counter.setDigitCountState(threeDigit);
        }
        if(counter.getCount() < 10){
            DigitCountState oneDigit = new OneDigit(counter);
            counter.setDigitCountState(oneDigit);
        }
    }
}
