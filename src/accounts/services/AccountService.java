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

    public BankAccount createCurrentAccount(AccountOwner owner, double balance) {
        BankAccount bankAccount = currentAccountFactory.CreateCurrentAccount(owner, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }
    public BankAccount createCurrentAccount(AccountOwner owner) {
        BankAccount bankAccount = currentAccountFactory.CreateCurrentAccount(owner);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createStudentAccount(AccountOwner owner, double balance, String school) {
        BankAccount bankAccount = studentAccountFactory.CreateStudentAccount(owner, balance, school);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createStudentAccount(AccountOwner owner, String school) {
        BankAccount bankAccount = studentAccountFactory.CreateStudentAccount(owner, school);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createSavingAccount(AccountOwner owner, double balance) {
        BankAccount bankAccount = savingAccountFactory.CreateSavingAccount(owner, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createSavingAccount(AccountOwner owner) {
        BankAccount bankAccount = savingAccountFactory.CreateSavingAccount(owner);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createBusinessAccount(AccountOwner owner, double balance) {
        BankAccount bankAccount = businessAccountFactory.CreateBusinesssAccount(owner, balance);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public BankAccount createBusinessAccount(AccountOwner owner) {
        BankAccount bankAccount = businessAccountFactory.CreateBusinesssAccount(owner);
        accounts.add(bankAccount);

        return bankAccount;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
