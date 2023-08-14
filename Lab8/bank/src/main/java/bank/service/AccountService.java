package bank.service;

import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.List;

import bank.adapter.AccountDTO;
import bank.adapter.AccountToAccountDTOAdapter;
import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.proxy.LoggingProxy;
import bank.proxy.TimmingProxy;


public class AccountService implements IAccountService {

	private IAccountDAO accountDAO=new AccountDAO();
	ClassLoader classLoader = AccountDAO.class.getClassLoader();
	IAccountDAO loggingProxy = (IAccountDAO) Proxy.newProxyInstance(classLoader,
			new Class[]{IAccountDAO.class},
			new LoggingProxy(accountDAO));
	IAccountDAO timmingProxy = (IAccountDAO) Proxy.newProxyInstance(classLoader,
			new Class[]{IAccountDAO.class},
			new TimmingProxy(loggingProxy));

	
	public AccountService(){
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		//accountDAO.saveAccount(account);
		timmingProxy.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		//accountDAO.updateAccount(account);
		timmingProxy.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		//Account account = accountDAO.loadAccount(accountNumber);

		Account account = accountDAO.loadAccount(accountNumber);
		AccountToAccountDTOAdapter adapter = new AccountToAccountDTOAdapter(account);
		AccountDTO accountDTO = adapter;
		System.out.println("Account to AccountDTO: " + accountDTO.getAccountnumber());

		return timmingProxy.loadAccount(accountNumber);
	}

	public Collection<Account> getAllAccounts() {
		Collection<Account> accounts = accountDAO.getAccounts();
		for(Account account: accounts){
			AccountToAccountDTOAdapter adapter = new AccountToAccountDTOAdapter(account);
			AccountDTO accountDTO = adapter;
			System.out.println("Account to AccountDTO: " + accountDTO.getAccountnumber());
		}

		return accounts;
		//return timmingProxy.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		//Account account = accountDAO.loadAccount(accountNumber);
		Account account = timmingProxy.loadAccount(accountNumber);
		account.withdraw(amount);
		//accountDAO.updateAccount(account);
		timmingProxy.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
//		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
//		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		Account fromAccount = timmingProxy.loadAccount(fromAccountNumber);
		Account toAccount = timmingProxy.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
//		accountDAO.updateAccount(fromAccount);
//		accountDAO.updateAccount(toAccount);
		timmingProxy.updateAccount(fromAccount);
		timmingProxy.updateAccount(toAccount);
	}
}
