package transfers;

import accounts.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class TransferLoggerService {
    private List<Transfer> transferHistory = new ArrayList<>();
    TransferFactory transferFactory;

    public TransferLoggerService(TransferFactory tf){
        transferFactory=tf;
    }

    public void addToHistory(BankAccount accountFrom, BankAccount accountTo, double amount){
        transferHistory.add(transferFactory.CreateTransfer(accountFrom, accountTo, amount));
    }

    public List<Transfer> getTransferHistory() {
        return transferHistory;
    }
}
