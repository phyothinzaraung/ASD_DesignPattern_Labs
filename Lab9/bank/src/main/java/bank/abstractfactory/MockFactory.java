package bank.abstractfactory;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.dao.MockAccountDAO;
import bank.integration.email.IEmailSender;
import bank.integration.email.MockEmailSender;

public class MockFactory implements MyFactory{
    @Override
    public IAccountDAO getAccountDAO() {
        System.out.println("Working with Testing Database");
        return new MockAccountDAO();
    }

    @Override
    public IEmailSender getEmailSender() {
        return MockEmailSender.getMockEmailSender();
    }
}
