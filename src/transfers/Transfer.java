package transfers;

import accounts.BankAccount;

import java.time.LocalDateTime;

public class Transfer {

    private BankAccount accountFrom;
    private BankAccount accountTo;

    private double amount;

    private LocalDateTime time;

    public Transfer(BankAccount accountFrom, BankAccount accountTo, double amount, LocalDateTime time){
        this.accountFrom=accountFrom;
        this.accountTo=accountTo;
        this.amount=amount;
        this.time=time;
    }

    public double getBalance() {
        return amount;
    }

    public BankAccount getAccountFrom() {
        return accountFrom;
    }

    public BankAccount getAccountTo() {
        return accountTo;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
