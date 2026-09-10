package accounts;

import people.AccountOwner;

public class StudentAccount extends BankAccount{

    private String school;

    public StudentAccount(AccountOwner owner, String school){
        super(owner);
        this.school=school;
    }
    public StudentAccount(AccountOwner owner, double balance, String school){
        super(owner, balance);
        this.school=school;
    }

    @Override
    public void sub(double amount) {
        double newAmount=this.balance-amount;
        if(newAmount>=-5000){
            this.balance=newAmount;
        }

    }

    public String getSchool(){
        return school;
    }
}
