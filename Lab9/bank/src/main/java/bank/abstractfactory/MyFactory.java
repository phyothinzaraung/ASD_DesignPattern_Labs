package bank.abstractfactory;

import bank.dao.IAccountDAO;
import bank.integration.email.IEmailSender;

public interface MyFactory {
    public IAccountDAO getAccountDAO();

    public IEmailSender getEmailSender();
}
