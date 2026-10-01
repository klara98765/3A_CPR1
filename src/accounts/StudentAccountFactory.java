package accounts;

import people.AccountOwner;

public class StudentAccountFactory {
    public static StudentAccount CreateStudentAccount(AccountOwner owner, double balance, String school){
        String number= AccountNumberService.GenerateAccountNumber();
        StudentAccount ba=new StudentAccount(number, owner, balance, school);
        return ba;
    }
    public static StudentAccount CreateStudentAccount(AccountOwner owner, String school){
        String number= AccountNumberService.GenerateAccountNumber();
        StudentAccount ba=new StudentAccount(number, owner, school);
        return ba;
    }
}
