package accounts.services;

import accounts.BankAccount;
import people.AccountOwner;

public interface IAccountService {

    BankAccount createCurrentAccount(AccountOwner owner);
}
