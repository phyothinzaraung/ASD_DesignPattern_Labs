package bank.command;

import bank.service.AccountService;
import bank.service.IAccountService;

public class DepositCommand implements Command{

    private long accountNumber;
    private double depositAmount;
    private IAccountService accountService;

    public DepositCommand(IAccountService accountService, long accountNumber, double depositAmount){
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.depositAmount = depositAmount;
    }

    @Override
    public void execute() {
        accountService.deposit(accountNumber, depositAmount);
    }

    @Override
    public void unExecute() {
        accountService.withdraw(accountNumber, depositAmount);
    }
}
