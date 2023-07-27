package bank.strategy;

import bank.domain.Account;
import bank.domain.AccountEntry;
import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CheckingAccountInterestCalculator implements InterestCalculator{

    @Override
    public void addInterest(Account account) {
        double balance = account.getBalance();
        double interest = 0;
        if(balance < 1000){
            interest = balance * 0.015;
        }else {
            interest = balance * 0.025;
        }
        AccountEntry entry = new AccountEntry(new Date(), interest, "interest", "", "");
        account.getEntryList().add(entry);
    }
}
