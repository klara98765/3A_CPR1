package people;

import accounts.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class OwnerService {
    List<AccountOwner> people = new ArrayList<>();
    AccountOwnerFactory accountOwnerFactory;

    public OwnerService(AccountOwnerFactory aof){
        accountOwnerFactory=aof;
    }

    public AccountOwner createAccountOwner(String name, String lastname){
        AccountOwner accountOwner=accountOwnerFactory.CreateAccountOwner(name, lastname);
        people.add(accountOwner);
        return accountOwner;
    }


    public List<AccountOwner> getPeople(){
        return people;
    }
}
