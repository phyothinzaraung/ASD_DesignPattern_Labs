package bank.dao;

import bank.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

public class MockAccountDAO implements IAccountDAO{

    Collection<Account> accountlist = new ArrayList<Account>();
    @Override
    public void saveAccount(Account account) {
        accountlist.add(account);
    }

    @Override
    public void updateAccount(Account account) {
        Account accountexist = loadAccount(account.getAccountnumber());
        if (accountexist != null) {
            accountlist.remove(accountexist); // remove the old
            accountlist.add(account); // add the new
        }
    }

    @Override
    public Account loadAccount(long accountnumber) {
        for (Account account : accountlist) {
            if (account.getAccountnumber() == accountnumber) {
                return account;
            }
        }
        return null;
    }

    @Override
    public Collection<Account> getAccounts() {
        return accountlist;
    }
}
