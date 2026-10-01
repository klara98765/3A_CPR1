package accounts;

import people.AccountOwner;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String number, AccountOwner owner){
        super(number, owner);
    }
    public CurrentAccount(String number, AccountOwner owner, double balance){
        super(number, owner, balance);
    }
}
