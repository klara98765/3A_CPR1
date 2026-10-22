package accounts.decorators;

import accounts.BankAccount;
import accounts.services.AccountService;
import accounts.services.IAccountService;
import people.AccountOwner;

import java.time.LocalDateTime;

public class LoggingWithTimeAccountService implements IAccountService {
    private final AccountService delegate;

    public LoggingWithTimeAccountService(AccountService delegate) {
        this.delegate = delegate;
    }

    @Override
    public BankAccount createCurrentAccount(AccountOwner owner) {
        System.out.println("Před vytvořením účtu: "+ LocalDateTime.now());

        BankAccount account = delegate.createCurrentAccount(owner);

        System.out.println("Po vytvoření účtu: "+LocalDateTime.now());
        return account;
    }
}
