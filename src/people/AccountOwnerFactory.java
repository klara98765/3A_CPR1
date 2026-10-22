package people;

import accounts.BusinessAccount;

public class AccountOwnerFactory {
    public static AccountOwner CreateAccountOwner(String name, String surname){
        AccountOwner ba=new AccountOwner(name, surname);
        return ba;
    }
}
