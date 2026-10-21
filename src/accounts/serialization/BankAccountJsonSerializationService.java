package accounts.serialization;


import java.util.List;

public class BankAccountJsonSerializationService implements BankAccountSerialization{
    public static String serializeall(List<BankAccountSerialize> bankAccountSerializeList){
        StringBuilder builder=new StringBuilder();
        builder.append("[");
        for(BankAccountSerialize bankAccountSerialize: bankAccountSerializeList){
            builder.append(serialize(bankAccountSerialize));
            builder.append(",");
        }
        builder.deleteCharAt(builder.length()-1);
        builder.append("]");
        return builder.toString();
    }

    public static String serialize(BankAccountSerialize bankAccountSerialize){
        StringBuilder builder=new StringBuilder();
        builder.append("{");
        builder.append("\"accountNumber\": ");
        builder.append("\"");
        builder.append(bankAccountSerialize.bankAccountNumber);
        builder.append("\"");
        builder.append(("}"));
        return builder.toString();
    }
}
