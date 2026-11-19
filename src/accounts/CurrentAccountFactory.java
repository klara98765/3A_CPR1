package accounts;

import accounts.services.AccountNumberService;
import people.AccountOwner;

public class CurrentAccountFactory {
    AccountNumberService accountNumberService;

    public CurrentAccountFactory(AccountNumberService ans){
        accountNumberService=ans;
    }

    public CurrentAccount CreateCurrentAccount(AccountOwner owner, String currency, double balance){
        String number= accountNumberService.GenerateAccountNumber();
        CurrentAccount ba=new CurrentAccount(number, currency, owner, balance);
        return ba;
    }
    public CurrentAccount CreateCurrentAccount(AccountOwner owner, String currency){
        String number= accountNumberService.GenerateAccountNumber();
        CurrentAccount ba=new CurrentAccount(number, currency, owner);
        return ba;
    }
}
