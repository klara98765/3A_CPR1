package accounts;

import people.AccountOwner;

public abstract class BankAccount {

    private String uuid;
    private String accountNumber;

    private AccountOwner owner;

    protected double balance;

    public BankAccount(AccountOwner owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(AccountOwner owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void sub(double amount){
        double newAmount=this.balance-amount;
        if(newAmount>0){
            this.balance=newAmount;
        }
    }

    public void add(double amount){
        this.balance=this.balance+amount;
    }
}
