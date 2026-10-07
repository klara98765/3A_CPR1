package transfers;

import accounts.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class TransferLoggerService {
    private static List<Transfer> transferHistory = new ArrayList<>();

    public static void addToHistory(BankAccount accountFrom, BankAccount accountTo, double amount){
        transferHistory.add(TransferFactory.CreateTransfer(accountFrom, accountTo, amount));
    }

    public List<Transfer> getTransferHistory() {
        return transferHistory;
    }
}
