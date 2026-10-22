package accounts.services;

import accounts.BankAccount;
import people.AccountOwner;

public class LoggingAcountService implements IAccountService{

    private final AccountService delegate;

    public LoggingAccountService(AccountService delegate) {
        this.delegate = delegate;
    }

    @Override
    public BankAccount createCurrentAccount(AccountOwner owner) {
        System.out.println("Před vytvořením účtu");

        BankAccount account = delegate.createCurrentAccount(AccountOwner owner);

        System.out.println("Po vytvoření účtu");
        return account;
    }

}
