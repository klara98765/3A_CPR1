import accounts.*;
import people.AccountOwner;
import people.AccountOwnerFactory;
import transfers.Transferservice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<BankAccount> accounts = new ArrayList<>();

    AccountOwner owner = AccountOwnerFactory.CreateAccountOwner("Rhiannon","Jones");
    accounts.add(CurrentAccountFactory.CreateCurrentAccount(owner));
    accounts.add(StudentAccountFactory.CreateStudentAccount(owner, 500, "Delta"));
    accounts.add(SavingAccountFactory.CreateSavingAccount(owner, 100));
    accounts.add(BusinessAccountFactory.CreateBusinesssAccount(owner, 300));

    for (BankAccount account: accounts){
        if (account instanceof StudentAccount){
            IO.println(((StudentAccount) account).getSchool());
        }
        IO.println(account.getAccountNumber());
    }
    Transferservice.transfer(accounts.get(1), accounts.get(0), 300);
    Transferservice.transfer(accounts.get(0), accounts.get(2), 100);
}
