package bank.strategy;

import bank.domain.Account;
import bank.domain.AccountEntry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class SavingAccountInterestCalculator implements InterestCalculator{
    @Override
    public void addInterest(Account account) {
        double balance = account.getBalance();
        double interest = 0;
        if(balance < 1000){
            interest = balance * 0.01;
        } else if(balance > 1000 && balance < 5000){
            interest = balance * 0.02;
        } else if(balance > 5000){
            interest = balance * 0.04;
        }
        AccountEntry entry = new AccountEntry(new Date(), interest, "interest", "", "");
        account.getEntryList().add(entry);
    }
}
