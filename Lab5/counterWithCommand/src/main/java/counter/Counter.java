package counter;

import observer.Subject;
import state.DigitCountState;

public class Counter extends Subject {

	DigitCountState digitCountState;
	
	private int count;
	private TextFrame textframe ;
	private RectFrame rectframe ;
	private OvalFrame ovalframe ;
	
	public void increment(){
		//count++;
		digitCountState.calculate(true);
		doNotify(count);
//    	textframe.setCount(count);
//    	rectframe.setCount(count);
//    	ovalframe.setCount(count);
	}
	
	public void decrement(){
//		count--;
		digitCountState.calculate(false);
		doNotify(count);
//	   	textframe.setCount(count);
//    	rectframe.setCount(count);
//    	ovalframe.setCount(count);
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
