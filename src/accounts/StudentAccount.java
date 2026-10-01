package accounts;

import people.AccountOwner;

public class StudentAccount extends BankAccount{

    private String school;

    public StudentAccount(String number, AccountOwner owner, String school){
        super(number, owner);
        this.school=school;
    }
    public StudentAccount(String number, AccountOwner owner, double balance, String school){
        super(number, owner, balance);
        this.school=school;
    }

    @Override
    public String sub(double amount) {
        double newAmount=this.balance-amount;
        if(newAmount>=-5000){
            this.balance=newAmount;
            return "success";
        }else{
            return "failed";
        }

    }

    public String getSchool(){
        return school;
    }
}
