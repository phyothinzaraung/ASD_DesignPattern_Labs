package bank.adapter;

import bank.domain.Account;

public class AccountToAccountDTOAdapter extends AccountDTO {

    private Account account;

    public AccountToAccountDTOAdapter(Account account){
        this.account = account;
    }

    @Override
    public long getAccountnumber() {
        return account.getAccountnumber();
    }

    @Override
    public void setAccountnumber(long accountnumber) {
        account.setAccountnumber(accountnumber);
    }
}
