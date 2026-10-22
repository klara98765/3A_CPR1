package accounts.services;

import accounts.*;
import people.AccountOwner;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements IAccountService{
    static List<BankAccount> accounts = new ArrayList<>();

    public BankAccount createCurrentAccount(AccountOwner owner, double balance) {
        BankAccount bankAccount = CurrentAccountFactory.CreateCurrentAccount(owner, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }
    public BankAccount createCurrentAccount(AccountOwner owner) {
        BankAccount bankAccount = CurrentAccountFactory.CreateCurrentAccount(owner);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createStudentAccount(AccountOwner owner, double balance, String school) {
        BankAccount bankAccount = StudentAccountFactory.CreateStudentAccount(owner, balance, school);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createStudentAccount(AccountOwner owner, String school) {
        BankAccount bankAccount = StudentAccountFactory.CreateStudentAccount(owner, school);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createSavingAccount(AccountOwner owner, double balance) {
        BankAccount bankAccount = SavingAccountFactory.CreateSavingAccount(owner, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createSavingAccount(AccountOwner owner) {
        BankAccount bankAccount = SavingAccountFactory.CreateSavingAccount(owner);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createBusinessAccount(AccountOwner owner, double balance) {
        BankAccount bankAccount = BusinessAccountFactory.CreateBusinesssAccount(owner, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createBusinessAccount(AccountOwner owner) {
        BankAccount bankAccount = BusinessAccountFactory.CreateBusinesssAccount(owner);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public static List<BankAccount> getAccounts() {
        return accounts;
    }
}
