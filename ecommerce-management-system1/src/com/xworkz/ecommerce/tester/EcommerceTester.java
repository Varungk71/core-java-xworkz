package com.xworkz.ecommerce.tester;

import com.xworkz.ecommerce.dto.Customers;
import com.xworkz.ecommerce.Ecommerce;

import java.util.Objects;
import java.util.Scanner;

public class EcommerceTester
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        Ecommerce ecomm=new Ecommerce();

        for(int index=0;index<ecomm.customer.length;index++)
        {
            Customers cust=new Customers();

            cust.setCustomerId();
            System.out.println("enter the customer name");
            cust.setCustomerName(sc.next());
            System.out.println("enter the customer email");
            cust.setEmail(sc.next());
            System.out.println("enter the customer email");
            cust.setPhoneNumber(sc.nextLong());
            System.out.println("enter the password");
            cust.setPassword(sc.next());

            ecomm.addCustomer(cust);
        }

        ecomm.getCustomerInfo();


        Objects a[]=new Objects[]{1 ,2.2,true,"string",'a'};
    }


}
