package di;

import accounts.BusinessAccountFactory;
import accounts.CurrentAccountFactory;
import accounts.SavingAccountFactory;
import accounts.StudentAccountFactory;
import accounts.serialization.*;
import accounts.services.AccountNumberService;
import accounts.services.AccountService;
import notifiers.ConsoleNotifier;
import people.AccountOwnerFactory;
import people.OwnerService;
import transfers.TransferFactory;
import transfers.TransferLoggerService;

public class Container {
    public AccountNumberService accountNumberService=new AccountNumberService();
    public AccountOwnerFactory accountOwnerFactory=new AccountOwnerFactory();
    public OwnerService ownerService=new OwnerService(accountOwnerFactory);
    public CurrentAccountFactory currentAccountFactory = new CurrentAccountFactory(accountNumberService);
    public StudentAccountFactory studentAccountFactory = new StudentAccountFactory(accountNumberService);
    public BusinessAccountFactory businessAccountFactory = new BusinessAccountFactory(accountNumberService);
    public SavingAccountFactory savingAccountFactory = new SavingAccountFactory(accountNumberService);
    public AccountService accountService=new AccountService(currentAccountFactory, studentAccountFactory, businessAccountFactory, savingAccountFactory);
    public TransferFactory transferFactory=new TransferFactory();
    public TransferLoggerService transferLoggerService=new TransferLoggerService(transferFactory);
    public BankAccountSerializeFactory bankAccountSerializeFactory=new BankAccountSerializeFactory();
    public BankAccountJsonSerializationService bankAccountJsonSerializationService=new BankAccountJsonSerializationService();
    public BankAccountXmlSerializationService bankAccountXmlSerializationService = new BankAccountXmlSerializationService();
    public BankAccountGsonSerializationService bankAccountGsonSerializationService = new BankAccountGsonSerializationService();
    public BankAccountXml2SerializationService bankAccountXml2SerializationService = new BankAccountXml2SerializationService();
    public ConsoleNotifier consoleNotifier=new ConsoleNotifier();

}
