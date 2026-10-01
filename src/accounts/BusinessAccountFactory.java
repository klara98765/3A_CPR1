package accounts;

import people.AccountOwner;

public class BusinessAccountFactory {

    public static BusinessAccount CreateBusinesssAccount(AccountOwner owner, double balance){
        String number= AccountNumberService.GenerateAccountNumber();
        BusinessAccount ba=new BusinessAccount(number, owner, balance);
        return ba;
    }

    public static BusinessAccount CreateBusinesssAccount(AccountOwner owner){
        String number= AccountNumberService.GenerateAccountNumber();
        BusinessAccount ba=new BusinessAccount(number, owner);
        return ba;
    }
}
