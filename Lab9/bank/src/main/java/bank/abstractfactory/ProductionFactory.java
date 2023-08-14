package bank.abstractfactory;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.integration.email.EmailSender;
import bank.integration.email.IEmailSender;

public class ProductionFactory implements MyFactory{
    @Override
    public IAccountDAO getAccountDAO() {
        System.out.println("Working with Production Database");
        return new AccountDAO();
    }

    @Override
    public IEmailSender getEmailSender() {
        return EmailSender.getEmailSender();
    }
}
