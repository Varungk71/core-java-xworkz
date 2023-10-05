package ecommerce;

import ecommerce.impl.ECommerceMeshoImpl;


public class Tester
{
    public static void main(String[] args)
    {

        EcommerceMesho  ecommerceMesho= new ECommerceMeshoImpl();
        ecommerceMesho.addCustomer();

    }
}
