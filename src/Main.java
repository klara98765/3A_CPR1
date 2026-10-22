import accounts.*;
import accounts.serialization.*;
import accounts.services.AccountService;
import accounts.services.LoggingAcountService;
import notifiers.ConsoleNotifier;
import people.AccountOwner;
import people.AccountOwnerFactory;
import people.OwnerService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    AccountService as=new AccountService();
    AccountOwner owner = OwnerService.createAccountOwner("Rhiannon","Jones");
    as.createCurrentAccount(owner);
    as.createStudentAccount(owner, 500, "Delta");
    as.createSavingAccount(owner, 100);
    as.createBusinessAccount(owner, 300);
    as.createBusinessAccount(owner);

    List<BankAccount> accounts=AccountService.getAccounts();
    List<BankAccountSerialize> serializeList=new ArrayList<>();
    for (BankAccount account: accounts){
        BankAccountSerialize bac=BankAccountSerializeFactory.createBankAccountSerialize(account);
        serializeList.add(bac);
    }
    ConsoleNotifier notifier = new ConsoleNotifier();
    notifier.notify(BankAccountJsonSerializationService.serializeall(serializeList));
    notifier.notify(BankAccountXmlSerializationService.serializeall(serializeList));
    notifier.notify(BankAccountGsonSerializationService.serializeall(serializeList));
    notifier.notify(BankAccountXml2SerializationService.serializeall(serializeList));
    //Transferservice.transfer(accounts.get(1), accounts.get(0), 300);
    //Transferservice.transfer(accounts.get(0), accounts.get(2), 100);
}
