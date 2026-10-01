package accounts;

import people.AccountOwner;

public class CurrentAccountFactory {
    public static CurrentAccount CreateCurrentAccount(AccountOwner owner, double balance){
        String number= AccountNumberService.GenerateAccountNumber();
        CurrentAccount ba=new CurrentAccount(number, owner, balance);
        return ba;
    }
    public static CurrentAccount CreateCurrentAccount(AccountOwner owner){
        String number= AccountNumberService.GenerateAccountNumber();
        CurrentAccount ba=new CurrentAccount(number, owner);
        return ba;
    }
}
