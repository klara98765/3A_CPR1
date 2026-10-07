package transfers;

import accounts.BankAccount;
import accounts.BusinessAccount;
import accounts.StudentAccount;
import notifiers.ConsoleNotifier;
import notifiers.Notifier;

public class Transferservice {
    static Notifier notifier = new ConsoleNotifier();
    public static void transfer(BankAccount account1, BankAccount account2, double amount){
        notifier.notify("Sub amount is " + amount);
        notifier.notify(account1.getAccountNumber()+" balance: "+account1.getBalance());
        notifier.notify(account2.getAccountNumber()+" balance: "+account2.getBalance());
        if (amount<0) {
            notifier.notify("Amount can't be 0 or less.");
        }else {
            String success = account1.sub(amount);
            if (success == "success") {
                if (account1 instanceof BusinessAccount) {
                    amount = amount * 0.97;
                }
                account2.add(amount);
                TransferLoggerService.addToHistory(account1, account2, amount);
            } else {
                notifier.notify("Bank transfer failed (not enought money).");
            }
            notifier.notify(account1.getAccountNumber() + " balance: " + account1.getBalance());
            notifier.notify(account2.getAccountNumber() + " balance: " + account2.getBalance());
        }
    }
}
