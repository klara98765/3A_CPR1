import accounts.*;
import accounts.decorators.LoggingWithTimeAccountService;
import accounts.serialization.*;
import accounts.services.AccountService;
import accounts.services.IAccountService;
import accounts.decorators.LoggingAccountService;
import di.Container;
import di.ContainerFactory;
import notifiers.ConsoleNotifier;
import people.AccountOwner;
import people.OwnerService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ContainerFactory containerFactory=new ContainerFactory();
    Container container=containerFactory.createContainer();
    AccountService accountService=container.accountService;
    OwnerService ownerService=container.ownerService;
    AccountOwner owner = ownerService.createAccountOwner("Rhiannon","Jones");
    accountService.createCurrentAccount(owner);
    accountService.createStudentAccount(owner, 500, "Delta");
    accountService.createSavingAccount(owner, 100);
    accountService.createBusinessAccount(owner, 300);
    accountService.createBusinessAccount(owner);

    //IAccountService accountServiceWithLogging=new LoggingAccountService(accountService);
    //accountServiceWithLogging.createCurrentAccount(owner);
    //IAccountService accountServiceLoggingWithTime=new LoggingWithTimeAccountService(accountService);
    //accountServiceLoggingWithTime.createCurrentAccount(owner);
    //IAccountService accountServiceMixLogging=new LoggingAccountService(accountServiceLoggingWithTime);
    //accountServiceMixLogging.createCurrentAccount(owner);


    List<BankAccount> accounts=accountService.getAccounts();
    List<BankAccountSerialize> serializeList=new ArrayList<>();
    for (BankAccount account: accounts){
        BankAccountSerialize bac=container.bankAccountSerializeFactory.createBankAccountSerialize(account);
        serializeList.add(bac);
    }
    ConsoleNotifier notifier = container.consoleNotifier;
    notifier.notify(container.bankAccountJsonSerializationService.serializeall(serializeList));
    notifier.notify(container.bankAccountXmlSerializationService.serializeall(serializeList));
    notifier.notify(container.bankAccountGsonSerializationService.serializeall(serializeList));
    notifier.notify(container.bankAccountXml2SerializationService.serializeall(serializeList));
    //Transferservice.transfer(accounts.get(1), accounts.get(0), 300);
    //Transferservice.transfer(accounts.get(0), accounts.get(2), 100);
}
