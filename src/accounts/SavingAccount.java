package accounts;

import people.AccountOwner;

public class SavingAccount extends BankAccount{
    public SavingAccount(String number, String currency, AccountOwner owner){
        super(number, currency, owner);
    }
    public SavingAccount(String number, String currency, AccountOwner owner, double balance){
        super(number, currency, owner, balance);
    }

    @Override
    public void add(double amount) {
        this.balance=(this.balance+amount) * 1.005;
    }
}
