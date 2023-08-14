package bank.proxy;

public class Timming {

    private long start = 0;
    private long end = 0;
    private long time_difference = 0;

    public void start(){
        start = System.currentTimeMillis();
    }

    public void end(){
        end = System.currentTimeMillis();
    }

    public long timeDiff(){
        time_difference = end - start;
        return time_difference;
    }
}
