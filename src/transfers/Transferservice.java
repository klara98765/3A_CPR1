package transfers;

import accounts.BankAccount;
import accounts.BusinessAccount;
import accounts.StudentAccount;
import notifiers.ConsoleNotifier;
import notifiers.Notifier;

public class Transferservice {
    Notifier notifier = new ConsoleNotifier();
    public void transfer(BankAccount account1, BankAccount account2, int amount){
        account1.sub(amount);
        account2.add(amount);
    }
}
