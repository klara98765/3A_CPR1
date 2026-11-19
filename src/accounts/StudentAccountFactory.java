package accounts;

import accounts.services.AccountNumberService;
import people.AccountOwner;

public class StudentAccountFactory {
    AccountNumberService accountNumberService;

    public StudentAccountFactory(AccountNumberService ans){
        accountNumberService=ans;
    }

    public StudentAccount CreateStudentAccount(AccountOwner owner, String currency, double balance, String school){
        String number= accountNumberService.GenerateAccountNumber();
        StudentAccount ba=new StudentAccount(number, currency, owner, balance, school);
        return ba;
    }
    public StudentAccount CreateStudentAccount(AccountOwner owner, String currency, String school){
        String number= accountNumberService.GenerateAccountNumber();
        StudentAccount ba=new StudentAccount(number, currency, owner, school);
        return ba;
    }
}
