package bank.account_update_observer;

import bank.domain.Account;
import bank.service.AccountService;
import bank.service.IAccountService;

public class SMSSender extends AccountUpdateObserver{
    public SMSSender(AccountService accountService) {
        super(accountService);
    }

    @Override
    public void update() {
        Account account = accountService.getLastChangedAccount();
        System.out.println("Sending SMS about Balance update : " + account.getBalance());
    }
}
