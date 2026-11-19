package accounts;

import accounts.services.AccountNumberService;
import people.AccountOwner;

public class CurrentAccountFactory {
    AccountNumberService accountNumberService;

    public CurrentAccountFactory(AccountNumberService ans){
        accountNumberService=ans;
    }

    public CurrentAccount CreateCurrentAccount(AccountOwner owner, double balance){
        String number= accountNumberService.GenerateAccountNumber();
        CurrentAccount ba=new CurrentAccount(number, owner, balance);
        return ba;
    }
    public CurrentAccount CreateCurrentAccount(AccountOwner owner){
        String number= accountNumberService.GenerateAccountNumber();
        CurrentAccount ba=new CurrentAccount(number, owner);
        return ba;
    }
}
