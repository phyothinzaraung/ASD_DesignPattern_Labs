package counter;

import cor.*;
import observer.Subject;
import state.DigitCountState;

public class Counter extends Subject {

	DigitCountState digitCountState;
	
	private int count;
	private TextFrame textframe ;
	private RectFrame rectframe ;
	private OvalFrame ovalframe ;

	CounterValueReceiver counterReceiver;

	public void setCounterReceiver(CounterValueReceiver counterReceiver) {
		this.counterReceiver = counterReceiver;
	}

	public void increment(){
		//count++;

		digitCountState.calculate(true);
		counterReceiver.receiveCounterValue(count);
		doNotify(count);
//    	textframe.setCount(count);
//    	rectframe.setCount(count);
//    	ovalframe.setCount(count);
	}
	
	public void decrement(){
//		count--;
		digitCountState.calculate(false);
		counterReceiver.receiveCounterValue(count);
		doNotify(count);
//	   	textframe.setCount(count);
//    	rectframe.setCount(count);
//    	ovalframe.setCount(count);
	}

	public void setHandleState() {
		OrangeHandler orangeHandler = new OrangeHandler(null);
		GreenHandler greenHandler = new GreenHandler(orangeHandler);
		BlueHandler blueHandler = new BlueHandler(greenHandler);
		RedHandler redHandler = new RedHandler(blueHandler);
		counterReceiver.setCounterHandler(redHandler);
	}
	public void setDigitCountState(DigitCountState digitCountState) {
		this.digitCountState = digitCountState;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setTextframe(TextFrame textframe) {
		this.textframe = textframe;
	}

	public void setRectframe(RectFrame rectframe) {
		this.rectframe = rectframe;
	}

	public void setOvalframe(OvalFrame ovalframe) {
		this.ovalframe = ovalframe;
	}

}
