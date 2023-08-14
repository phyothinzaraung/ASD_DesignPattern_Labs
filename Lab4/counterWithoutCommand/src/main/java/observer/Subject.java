package observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Subject {
    Collection<IObserver> observerList = new ArrayList<>();

    public void addObserver(IObserver observer){
        observerList.add(observer);
    }

    public void removeObserver(IObserver observer){
        observerList.remove(observer);
    }

    public void doNotify(int count){
        for(IObserver observer: observerList){
            observer.update(count);
        }
    }
}
