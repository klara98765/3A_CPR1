package accounts;

import people.AccountOwner;

public class SavingAccount extends BankAccount{
    public SavingAccount(String number, AccountOwner owner){
        super(number, owner);
    }
    public SavingAccount(String number, AccountOwner owner, double balance){
        super(number, owner, balance);
    }

    @Override
    public void add(double amount) {
        this.balance=(this.balance+amount) * 1.005;
    }
}
