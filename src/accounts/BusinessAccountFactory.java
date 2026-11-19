package accounts;

import accounts.services.AccountNumberService;
import people.AccountOwner;

public class BusinessAccountFactory {
    AccountNumberService accountNumberService;

    public BusinessAccountFactory(AccountNumberService ans){
        accountNumberService=ans;
    }

    public BusinessAccount CreateBusinesssAccount(AccountOwner owner, double balance){
        String number= accountNumberService.GenerateAccountNumber();
        BusinessAccount ba=new BusinessAccount(number, owner, balance);
        return ba;
    }

    public BusinessAccount CreateBusinesssAccount(AccountOwner owner){
        String number= accountNumberService.GenerateAccountNumber();
        BusinessAccount ba=new BusinessAccount(number, owner);
        return ba;
    }
}
