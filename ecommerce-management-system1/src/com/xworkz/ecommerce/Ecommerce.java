package com.xworkz.ecommerce;

import com.xworkz.ecommerce.dto.Customers;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ecommerce
{

   public Customers customer[]=new Customers[2];
   int index;
   int id=0;

   public Ecommerce(int size)
   {
       customer = new Customers[size];
   }
    public boolean addCustomer(Customers cust)
    {
        boolean isAdded=false;
        if(cust!=null)
        {
            customer.setCustomerId(++id);
            this.customer[index++]=cust;
        }
        else
        {
            System.out.println("customer is null..");
        }
        return isAdded=true;
    }

    public void getCustomerInfo()
    {
        for(int index=0; index<customer.length;index++)
        {
            System.out.println(customer[index]);
        }
    }

    public String getCustomerNameByCustomerId(int customerId){
       String customerName=null;
       for(int index=0;index<customer.length;index++)
       {
           if(customer[index].getCustomerId()==customerId)
           {
               customerName=customer[index].getCustomerId();
           }
       }
        return customerName;
    }

    public String getCustomerEmailByCustomerId(int customerId){
       String email=null;
        for (int index = 0; index < customer.length; index++) {
            if(customer[index].getCustomerId.equals(customerId))
            {
                email=customer[index].getCustomerId();
            }

        }
    }
}
