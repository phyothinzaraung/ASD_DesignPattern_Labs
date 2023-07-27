package bank.strategy;

import bank.domain.Account;

public interface InterestCalculator {
    void addInterest(Account account);
}
