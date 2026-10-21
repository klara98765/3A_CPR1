package accounts.serialization;

import notifiers.ConsoleNotifier;

import java.util.List;

public class BankAccountXmlSerializationService implements BankAccountSerialization{
    public static String serializeall(List<BankAccountSerialize> bankAccountSerializeList){
        StringBuilder builder=new StringBuilder();
        builder.append("<root><accountList>");
        for(BankAccountSerialize bankAccountSerialize: bankAccountSerializeList){
            builder.append("<bankAccount>");
            builder.append("<accountNumber>");
            builder.append(serialize(bankAccountSerialize));
            builder.append("</accountNumber>");
            builder.append("</bankAccount>");
        }
        builder.append("</accountList> </root>");
        return builder.toString();
    }

    public static String serialize(BankAccountSerialize bankAccountSerialize){
        StringBuilder builder=new StringBuilder();
        builder.append(bankAccountSerialize.bankAccountNumber);
        return builder.toString();
    }
}
