package accounts.services;

import accounts.*;
import people.AccountOwner;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements IAccountService{
    List<BankAccount> accounts = new ArrayList<>();
    CurrentAccountFactory currentAccountFactory;
    StudentAccountFactory studentAccountFactory;
    BusinessAccountFactory businessAccountFactory;
    SavingAccountFactory savingAccountFactory;

    public AccountService(CurrentAccountFactory caf, StudentAccountFactory saf, BusinessAccountFactory baf, SavingAccountFactory saaf){
        currentAccountFactory=caf;
        studentAccountFactory=saf;
        businessAccountFactory=baf;
        savingAccountFactory=saaf;
    }

    public BankAccount createCurrentAccount(AccountOwner owner, String currency, double balance) {
        BankAccount bankAccount = currentAccountFactory.CreateCurrentAccount(owner, currency, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }
    public BankAccount createCurrentAccount(AccountOwner owner, String currency) {
        BankAccount bankAccount = currentAccountFactory.CreateCurrentAccount(owner, currency);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createStudentAccount(AccountOwner owner, String currency, double balance, String school) {
        BankAccount bankAccount = studentAccountFactory.CreateStudentAccount(owner, currency, balance, school);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createStudentAccount(AccountOwner owner, String currency, String school) {
        BankAccount bankAccount = studentAccountFactory.CreateStudentAccount(owner, currency, school);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createSavingAccount(AccountOwner owner, String currency, double balance) {
        BankAccount bankAccount = savingAccountFactory.CreateSavingAccount(owner, currency, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createSavingAccount(AccountOwner owner, String currency) {
        BankAccount bankAccount = savingAccountFactory.CreateSavingAccount(owner, currency);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createBusinessAccount(AccountOwner owner, String currency, double balance) {
        BankAccount bankAccount = businessAccountFactory.CreateBusinesssAccount(owner, currency, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createBusinessAccount(AccountOwner owner, String currency) {
        BankAccount bankAccount = businessAccountFactory.CreateBusinesssAccount(owner, currency);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
