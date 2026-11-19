package accounts;

import accounts.services.AccountNumberService;
import people.AccountOwner;

public class SavingAccountFactory {
    AccountNumberService accountNumberService;

    public SavingAccountFactory(AccountNumberService ans){
        accountNumberService=ans;
    }

    public SavingAccount CreateSavingAccount(AccountOwner owner, String currency, double balance){
        String number= accountNumberService.GenerateAccountNumber();
        SavingAccount ba=new SavingAccount(number, currency, owner, balance);
        return ba;
    }
    public SavingAccount CreateSavingAccount(AccountOwner owner, String currency){
        String number= accountNumberService.GenerateAccountNumber();
        SavingAccount ba=new SavingAccount(number, currency, owner);
        return ba;
    }
}
