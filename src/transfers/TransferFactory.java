package transfers;

import accounts.BankAccount;

import java.time.LocalDateTime;

public class TransferFactory {
    public static Transfer CreateTransfer(BankAccount accountFrom, BankAccount accountTo, double amount){
        Transfer transfer=new Transfer(accountFrom,accountTo,amount, LocalDateTime.now());
        return transfer;
    }
}
