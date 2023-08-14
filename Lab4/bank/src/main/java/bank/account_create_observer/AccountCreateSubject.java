package bank.account_create_observer;

import java.util.ArrayList;
import java.util.Collection;

public class AccountCreateSubject {

    Collection<AccountCreateObserver> observerList = new ArrayList<>();

    public void addObserver(AccountCreateObserver observer){
        observerList.add(observer);
    }

    public void removeObserver(AccountCreateObserver observer){
        observerList.remove(observer);
    }

    public void doNotify(){
        for(AccountCreateObserver observer: observerList){
            observer.update();
        }
    }
}
