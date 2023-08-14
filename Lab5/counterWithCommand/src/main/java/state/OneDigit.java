package state;

import counter.Counter;

public class OneDigit extends DigitCountState{

    public OneDigit(Counter counter) {
        super(counter);
    }

    @Override
    public void calculate( boolean isIncrement) {

        if(counter.getCount() < 10){
            if(isIncrement){
                counter.setCount(counter.getCount() + 1);
            }else {
                counter.setCount(counter.getCount() - 1);
            }
        }
        checkForUpdate();
    }

    private void checkForUpdate(){
        if(counter.getCount() >= 10 && counter.getCount() <= 99){
            DigitCountState twoDigit = new TwoDigit(counter);
            counter.setDigitCountState(twoDigit);
        }
    }
}
