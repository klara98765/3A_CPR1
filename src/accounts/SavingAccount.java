package accounts;

import people.AccountOwner;

public class SavingAccount extends BankAccount{
    public SavingAccount(AccountOwner owner){
        super(owner);
    }
    public SavingAccount(AccountOwner owner, double balance){
        super(owner, balance);
    }

    @Override
    public void add(double amount) {
        this.balance=(this.balance+amount) * 1.005;
    }
}
