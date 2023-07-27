package bank.command;

import bank.service.IAccountService;

public class WithdrawCommand implements Command{
    private long accountNumber;
    private double withdrawAmount;
    private IAccountService accountService;

    public WithdrawCommand(IAccountService accountService, long accountNumber, double withdrawAmount){
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.withdrawAmount = withdrawAmount;
    }
    @Override
    public void execute() {
        accountService.withdraw(accountNumber, withdrawAmount);
    }

    @Override
    public void unExecute() {
        accountService.deposit(accountNumber, withdrawAmount);
    }
}
