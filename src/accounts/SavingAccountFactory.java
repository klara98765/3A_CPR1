package accounts;

import accounts.services.AccountNumberService;
import people.AccountOwner;

public class SavingAccountFactory {
    AccountNumberService accountNumberService;

    public SavingAccountFactory(AccountNumberService ans){
        accountNumberService=ans;
    }

    public SavingAccount CreateSavingAccount(AccountOwner owner, double balance){
        String number= accountNumberService.GenerateAccountNumber();
        SavingAccount ba=new SavingAccount(number, owner, balance);
        return ba;
    }
    public SavingAccount CreateSavingAccount(AccountOwner owner){
        String number= accountNumberService.GenerateAccountNumber();
        SavingAccount ba=new SavingAccount(number, owner);
        return ba;
    }
}
