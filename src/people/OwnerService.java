package people;

import accounts.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class OwnerService {
    static List<AccountOwner> people = new ArrayList<>();

    public static AccountOwner createAccountOwner(String name, String lastname){
        AccountOwner accountOwner=AccountOwnerFactory.CreateAccountOwner(name, lastname);
        people.add(accountOwner);
        return accountOwner;
    }


    public static List<AccountOwner> getPeople(){
        return people;
    }
}
