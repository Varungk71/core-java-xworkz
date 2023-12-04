package com.xworkz.bank.account;

public class BankAccount
{
    private double balance;
    public BankAccount()
    {

    }

    public double credit(double amount)
    {

        if(amount>0)
            this.balance=balance+amount;
        else
            System.out.println("amount should be greater than zero");

        return amount;
    }
    public void debit(double amount)
    {
        if(amount<=balance)
            this.balance=balance-amount;
    }

    public  void transaction(double amount, BankAccount benificiaryAccount)
    {
        this.debit(amount);
        benificiaryAccount.credit(amount);

    }

    public double getBalance()
    {
        return this.balance;
    }

}