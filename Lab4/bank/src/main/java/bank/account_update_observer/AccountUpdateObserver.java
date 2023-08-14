package bank.account_update_observer;

import bank.service.AccountService;
import bank.service.IAccountService;

public abstract class AccountUpdateObserver {
    protected IAccountService accountService;

    public AccountUpdateObserver(AccountService accountService){
        this.accountService = accountService;
    }

    public abstract void  update();
}
