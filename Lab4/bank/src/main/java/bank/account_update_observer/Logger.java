package bank.account_update_observer;

import bank.domain.Account;
import bank.service.AccountService;
import bank.service.IAccountService;

public class Logger extends AccountUpdateObserver{

    public Logger(AccountService accountService) {
        super(accountService);
    }

    public void log(Account account){
        System.out.println("Logger log account :" + account.getAccountnumber());
    }

    @Override
    public void update() {
        Account account = accountService.getLastChangedAccount();
        log(account);
    }
}
