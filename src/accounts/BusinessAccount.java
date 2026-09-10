package accounts;

import people.AccountOwner;

public class BusinessAccount extends BankAccount{
    public BusinessAccount(AccountOwner owner){
        super(owner);
    }
    public BusinessAccount(AccountOwner owner, double balance){
        super(owner, balance);
    }

    @Override
    public void sub(double amount) {
        double newAmount=this.balance - (amount * 1.01);
        if(newAmount>0){
            this.balance=newAmount;
        }
    }
}
