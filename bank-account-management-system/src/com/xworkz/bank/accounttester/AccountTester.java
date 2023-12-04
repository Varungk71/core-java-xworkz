package com.xworkz.bank.accounttester;
import com.xworkz.bank.account.BankAccount;
import com.xworkz.bank.accounttype.CurrentAccount;
import com.xworkz.bank.savingsaccount.SavingAccount;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccountTester
{
    public static void main(String[] args)
    {
        BankAccount myAccount=new SavingAccount();
        BankAccount friendAccount=new SavingAccount();
        BankAccount sisterAccount = new SavingAccount();
        BankAccount brotherAccount = new SavingAccount();
        BankAccount motherAccount =new CurrentAccount();

        myAccount.getBalance();

        myAccount.credit(10000);

        System.out.println("amount credited @ " + LocalDate.now() + " amount is " + myAccount.getBalance());



        myAccount.transaction(100,friendAccount);
        System.out.println("amount credited to friend  @ " + LocalDate.now() + "amount is " + friendAccount.getBalance());

        System.out.println("amount debited in my account @ " + LocalDate.now() + "amount is " + myAccount.getBalance());

        myAccount.transaction(200,sisterAccount);
        System.out.println("amount credited to sister  @ " + LocalDate.now() + "amount is " + sisterAccount.getBalance());
        System.out.println("amount debited in my account @ " + LocalDate.now() + "amount is " + myAccount.getBalance());

        myAccount.transaction(300,brotherAccount);
        System.out.println("amount credited to brother  @ " + LocalDate.now() + "amount is " + brotherAccount.getBalance());
        System.out.println("amount debited in my account @ " + LocalDate.now() + "amount is " + myAccount.getBalance());

        myAccount.transaction(100,motherAccount);
        System.out.println("amount credited to mother  @ " + LocalDate.now() + "amount is " + motherAccount.getBalance());
        System.out.println("amount debited in my account @ " + LocalDate.now() + "amount is " + myAccount.getBalance());


        System.out.println(myAccount.getBalance());

        SavingAccount interest=new SavingAccount();

        interest.credit(9300);
       // interest.debit(500);

         interest.getintrest();

         System.out.println("the  amount created @ "+ LocalDateTime.now() + "is  " + interest.getBalance());

         SavingAccount minBalanceAcc = new SavingAccount(500);


   }
}
