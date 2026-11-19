package accounts.serialization;

import com.google.gson.Gson;

import java.util.List;

public class BankAccountGsonSerializationService implements BankAccountSerialization{
    Gson gson=new Gson();

    public String serializeall(List<BankAccountSerialize> serializeList){
        return gson.toJson(serializeList);
    }

    public String serialize(BankAccountSerialize bankAccountSerialize){
        return gson.toJson(bankAccountSerialize);
    }

}
