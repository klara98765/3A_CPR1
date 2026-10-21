package accounts.serialization;

import tools.jackson.dataformat.xml.XmlMapper;

import java.util.List;

public class BankAccountXml2SerializationService implements BankAccountSerialization{
    static XmlMapper xmlMapper = new XmlMapper();
    public static String serializeall(List<BankAccountSerialize> serializeList){

        return xmlMapper.writeValueAsString(serializeList);

    }

    public static String serialize(BankAccountSerialize bankAccountSerialize){

        return xmlMapper.writeValueAsString(bankAccountSerialize);
    }

}
