package accounts;

import accounts.services.AccountNumberService;
import people.AccountOwner;

public class BusinessAccountFactory {
    AccountNumberService accountNumberService;

    public BusinessAccountFactory(AccountNumberService ans){
        accountNumberService=ans;
    }

    public BusinessAccount CreateBusinesssAccount(AccountOwner owner, String currency, double balance){
        String number= accountNumberService.GenerateAccountNumber();
        BusinessAccount ba=new BusinessAccount(number, currency, owner, balance);
        return ba;
    }

    public BusinessAccount CreateBusinesssAccount(AccountOwner owner, String currency){
        String number= accountNumberService.GenerateAccountNumber();
        BusinessAccount ba=new BusinessAccount(number, currency, owner);
        return ba;
    }
}
