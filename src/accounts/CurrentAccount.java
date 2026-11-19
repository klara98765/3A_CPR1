package accounts;

import people.AccountOwner;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String number, String currency, AccountOwner owner){
        super(number, currency, owner);
    }
    public CurrentAccount(String number, String currency, AccountOwner owner, double balance){
        super(number, currency, owner, balance);
    }
}
