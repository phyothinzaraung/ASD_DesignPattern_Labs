package bank.command;

import bank.service.IAccountService;

import java.util.stream.Stream;

public class TransferFundsCommand implements Command{
    private long fromAccountNumber;
    private long toAccountNumber;
    private double amount;
    String description;
    IAccountService accountService;

    public TransferFundsCommand(IAccountService accountService, long fromAccountNumber, long toAccountNumber, double amount, String description){
        this.accountService = accountService;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.description = description;
    }
    @Override
    public void execute() {
        accountService.transferFunds(fromAccountNumber, toAccountNumber, amount, description);
    }

    @Override
    public void unExecute() {
        accountService.withdraw(toAccountNumber, amount);
        accountService.deposit(fromAccountNumber, amount);
    }
}
