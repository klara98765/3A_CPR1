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
    ConsoleNotifier notifier = container.consoleNotifier;
    AccountOwner owner = ownerService.createAccountOwner("Rhiannon","Jones");
    accountService.createCurrentAccount(owner, "USD");
    accountService.createStudentAccount(owner, "USD", 500, "Delta");
    accountService.createSavingAccount(owner, "USD",100);
    accountService.createBusinessAccount(owner, "USD",300);
    accountService.createBusinessAccount(owner,"USD");

    //IAccountService accountServiceWithLogging=new LoggingAccountService(accountService);
    //accountServiceWithLogging.createCurrentAccount(owner);
    //IAccountService accountServiceLoggingWithTime=new LoggingWithTimeAccountService(accountService);
    //accountServiceLoggingWithTime.createCurrentAccount(owner);
    //IAccountService accountServiceMixLogging=new LoggingAccountService(accountServiceLoggingWithTime);
    //accountServiceMixLogging.createCurrentAccount(owner);


    List<BankAccount> accounts=accountService.getAccounts();
    List<BankAccountSerialize> serializeList=new ArrayList<>();
    for (BankAccount account: accounts){
        notifier.notify(account.getBalance()+" "+account.getCurrency()+
                " "+container.currencyConversion.convert(account.getCurrency(), "CZK", account.getBalance())+" CZK");
        BankAccountSerialize bac=container.bankAccountSerializeFactory.createBankAccountSerialize(account);
        serializeList.add(bac);
    }
    notifier.notify(container.bankAccountJsonSerializationService.serializeall(serializeList));
    notifier.notify(container.bankAccountXmlSerializationService.serializeall(serializeList));
    notifier.notify(container.bankAccountGsonSerializationService.serializeall(serializeList));
    notifier.notify(container.bankAccountXml2SerializationService.serializeall(serializeList));
}
