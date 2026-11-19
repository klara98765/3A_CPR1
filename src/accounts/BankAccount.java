package accounts;

import people.AccountOwner;

public abstract class BankAccount {

    private String uuid;
    private String accountNumber;

    private String currency;

    private AccountOwner owner;

    protected double balance;

    public BankAccount(String number, String currency, AccountOwner owner) {
        this.accountNumber=number;
        this.owner = owner;
        this.balance = 0;
        this.currency=currency;
    }

    public BankAccount(String number, String currency, AccountOwner owner, double balance) {
        this.accountNumber=number;
        this.owner = owner;
        this.balance = balance;
        this.currency=currency;
    }

    public String getCurrency(){return currency;}
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber(){ return accountNumber; }

    public String sub(double amount){
        double newAmount=this.balance-amount;
        if(newAmount>0){
            this.balance=newAmount;
            return "success";
        }else{
            return "failed";
        }
    }

    public void add(double amount){
        this.balance=this.balance+amount;
    }
}
