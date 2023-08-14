package bank.account_update_observer;

import java.util.ArrayList;
import java.util.Collection;

public class AccountUpdateSubject {

    Collection<AccountUpdateObserver> observerList = new ArrayList<>();

    public void addObserver(AccountUpdateObserver observer){
        observerList.add(observer);
    }

    public void removeObserver(AccountUpdateObserver observer){
        observerList.remove(observer);
    }

    public void doNotify(){
        for (AccountUpdateObserver observer: observerList){
            observer.update();
        }
    }
}
