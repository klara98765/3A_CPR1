package accounts.serialization;

import accounts.BankAccount;

public class BankAccountSerializeFactory {
    public static BankAccountSerialize createBankAccountSerialize(BankAccount bankAccount){
        BankAccountSerialize bac=new BankAccountSerialize();
        bac.bankAccountNumber=bankAccount.getAccountNumber();
        return bac;
    }
}
