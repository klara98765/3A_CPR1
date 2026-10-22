package accounts.services;

import accounts.BankAccount;
import people.AccountOwner;

import java.time.LocalTime;

public class LoggingAcountService{

    public static BankAccount createCurrentAccount(AccountOwner owner, boolean both) {
        BankAccount account;
        System.out.println("Vytvářím účet");
        if(both){
            account = createCurrentAccount2(owner);
        }else{
            account = AccountService.createCurrentAccount(owner);
        }

        System.out.println("Účet vytvořen");
        return account;
    }

    public static BankAccount createCurrentAccount2(AccountOwner owner){
        System.out.println("Vytvářím účet: "+ LocalTime.now());

        BankAccount account = AccountService.createCurrentAccount(owner);

        System.out.println("Účet vytvořen: "+LocalTime.now());
        return account;
    }

}
