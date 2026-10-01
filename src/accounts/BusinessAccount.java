package accounts;

import people.AccountOwner;

public class BusinessAccount extends BankAccount{
    public BusinessAccount(String number,AccountOwner owner){
        super(number, owner);
    }
    public BusinessAccount(String number,AccountOwner owner, double balance){
        super(number, owner, balance);
    }

    @Override
    public String sub(double amount) {
        double newAmount=this.balance - (amount * 1.01);
        if(newAmount>0){
            this.balance=newAmount;
            return "success";
        }else{
            return "failed";
        }
    }
}
