package accounts.serialization;

import java.util.List;

public interface BankAccountSerialization {
    public String serialize(BankAccountSerialize bankAccountSerialize);

    public String serializeall(List<BankAccountSerialize> serializeList);
}
