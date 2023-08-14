package bank.account_create_observer;

import bank.domain.Account;
import bank.service.AccountService;

public class EmailSender extends AccountCreateObserver{
    public EmailSender(AccountService accountService) {
        super(accountService);
    }

    @Override
    public void update() {
        Account account = accountService.getLastChangedAccount();
        System.out.println("Sending Email about creating account: " + account.getAccountnumber());
    }
}
