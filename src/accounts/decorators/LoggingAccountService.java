package accounts.decorators;

import accounts.BankAccount;
import accounts.services.AccountService;
import accounts.services.IAccountService;
import people.AccountOwner;

public class LoggingAccountService implements IAccountService {

    private final AccountService delegate;

    public LoggingAccountService(AccountService delegate) {
        this.delegate = delegate;
    }

    @Override
    public BankAccount createCurrentAccount(AccountOwner owner, String currency) {
        System.out.println("Před vytvořením účtu");

        BankAccount account = delegate.createCurrentAccount(owner, currency);

        System.out.println("Po vytvoření účtu");
        return account;
    }

}
