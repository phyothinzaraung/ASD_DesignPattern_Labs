package state;

import counter.Counter;

public abstract class DigitCountState {

    Counter counter;

    DigitCountState(Counter counter){
        this.counter = counter;
    }

    public abstract void calculate(boolean isIncrement);

}
