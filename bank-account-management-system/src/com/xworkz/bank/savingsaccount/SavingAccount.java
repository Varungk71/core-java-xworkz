package com.xworkz.bank.savingsaccount;

import com.xworkz.bank.account.BankAccount;

public class SavingAccount extends BankAccount
{

    double intrestRate = 2;

    public void getintrest() {


        double intrest = (getBalance() * intrestRate) / 100;
        credit(intrest);
    }

    public SavingAccount() {
    }

    public SavingAccount(double minBalance)
    {
        credit(minBalance);
        {

        }

    }
}