import accounts.*;
import people.AccountOwner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<BankAccount> accounts = new ArrayList<>();

    AccountOwner owner = new AccountOwner("Rhiannon","Jones");
    accounts.add(new CurrentAccount(owner));
    accounts.add(new StudentAccount(owner, 500, "Delta"));
    accounts.add(new SavingAccount(owner, 100));
    accounts.add(new BusinessAccount(owner,300));

    for (BankAccount account: accounts){
        if (account instanceof StudentAccount){
            IO.println(((StudentAccount) account).getSchool());
        }
    }

    IO.println(accounts.get(0).getBalance());
    accounts.get(0).add(460);
    accounts.get(1).sub(730);
    IO.println((accounts.get(0).getBalance()));
    IO.println(accounts.get(1).getBalance());
    accounts.get(2).add(50);
    IO.println(accounts.get(2).getBalance());
    accounts.get(3).sub(250);
    IO.println(accounts.get(3).getBalance());
}
