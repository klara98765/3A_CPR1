package currency;

import notifiers.ConsoleNotifier;

public class CurrencyConversion {
    CurrencyList currencyList;
    ConsoleNotifier consoleNotifier;
    public CurrencyConversion(CurrencyList cl, ConsoleNotifier cn){
        currencyList=cl;
        consoleNotifier=cn;
    }

    public double convert(String currencyFrom, String currencyTo, double amount){
        double currencyFromValue;
        double currencyToValue;
        if(currencyList.currencyMap.containsKey(currencyFrom) && currencyList.currencyMap.containsKey(currencyTo)){
            currencyFromValue=currencyList.currencyMap.get(currencyFrom);
            currencyToValue=currencyList.currencyMap.get(currencyTo);
            return convertMoney(currencyFromValue,currencyToValue,amount);
        }else{
            consoleNotifier.notify("There was an error, money wasn't converted.");
            return amount;
        }
    }

    public double convertMoney(double convertFrom, double convertTo, double amount){
        double inUSD = amount/convertFrom;
        double finalMoney=inUSD*convertTo;
        return finalMoney;
    }
}
