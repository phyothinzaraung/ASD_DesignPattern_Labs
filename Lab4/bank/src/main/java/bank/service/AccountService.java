package bank.service;

import java.util.Collection;

import bank.account_create_observer.AccountCreateSubject;
import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.account_update_observer.AccountUpdateSubject;


public class AccountService extends AccountUpdateSubject implements IAccountService {
	private IAccountDAO accountDAO;

	private Account lastChangedAccount;

	AccountCreateSubject accountCreateSubject = new AccountCreateSubject();

	
	public AccountService(){
		accountDAO=new AccountDAO();
	}

	public AccountCreateSubject getAccountCreateSubject() {
		return accountCreateSubject;
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		lastChangedAccount = account;
		accountCreateSubject.doNotify();
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
		lastChangedAccount = account;
		doNotify();
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
		lastChangedAccount = account;
		doNotify();
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
		lastChangedAccount = fromAccount;
		doNotify();
	}

	public Account getLastChangedAccount(){
		return lastChangedAccount;
	}
}
