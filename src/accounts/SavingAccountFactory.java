package accounts;

import people.AccountOwner;

public class SavingAccountFactory {
    public static SavingAccount CreateSavingAccount(AccountOwner owner, double balance){
        String number= AccountNumberService.GenerateAccountNumber();
        SavingAccount ba=new SavingAccount(number, owner, balance);
        return ba;
    }
    public static SavingAccount CreateSavingAccount(AccountOwner owner){
        String number= AccountNumberService.GenerateAccountNumber();
        SavingAccount ba=new SavingAccount(number, owner);
        return ba;
    }
}
