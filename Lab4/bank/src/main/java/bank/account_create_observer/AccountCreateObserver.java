package bank.account_create_observer;

import bank.service.AccountService;

public abstract class AccountCreateObserver {

    protected AccountService accountService;

    public AccountCreateObserver(AccountService accountService){
        this.accountService = accountService;
    }

    public abstract void update();
}
