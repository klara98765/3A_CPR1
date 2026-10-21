package accounts.services;

import accounts.*;
import people.AccountOwner;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    static List<BankAccount> accounts = new ArrayList<>();

    public static BankAccount createCurrentAccount(AccountOwner owner, double balance) {
        BankAccount bankAccount = CurrentAccountFactory.CreateCurrentAccount(owner, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }
    public static BankAccount createCurrentAccount(AccountOwner owner) {
        BankAccount bankAccount = CurrentAccountFactory.CreateCurrentAccount(owner);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public static BankAccount createStudentAccount(AccountOwner owner, double balance, String school) {
        BankAccount bankAccount = StudentAccountFactory.CreateStudentAccount(owner, balance, school);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public static BankAccount createStudentAccount(AccountOwner owner, String school) {
        BankAccount bankAccount = StudentAccountFactory.CreateStudentAccount(owner, school);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public static BankAccount createSavingAccount(AccountOwner owner, double balance) {
        BankAccount bankAccount = SavingAccountFactory.CreateSavingAccount(owner, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public static BankAccount createSavingAccount(AccountOwner owner) {
        BankAccount bankAccount = SavingAccountFactory.CreateSavingAccount(owner);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public static BankAccount createBusinessAccount(AccountOwner owner, double balance) {
        BankAccount bankAccount = BusinessAccountFactory.CreateBusinesssAccount(owner, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public static BankAccount createBusinessAccount(AccountOwner owner) {
        BankAccount bankAccount = BusinessAccountFactory.CreateBusinesssAccount(owner);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public static List<BankAccount> getAccounts() {
        return accounts;
    }
}
