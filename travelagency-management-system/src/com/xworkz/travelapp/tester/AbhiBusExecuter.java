package com.xworkz.travelapp.tester;

import com.xworkz.travelapp.bus.AbhiBus;
import com.xworkz.travelapp.bus.TravelAgency;
import com.xworkz.travelapp.bus.impl.SrsImpl;
import com.xworkz.travelapp.bus.impl.VrlImpl;

import java.util.Scanner;

public class AbhiBusExecuter
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        AbhiBus abhibus1=new VrlImpl();
        AbhiBus abhibus2=new SrsImpl();
        TravelAgency agency1=new TravelAgency(abhibus1);
        System.out.println("enter the number of tickets");
        agency1.bookingTickets(sc.nextInt());

        TravelAgency agency2=new TravelAgency(abhibus2);
        System.out.println("enter the number of tickets");
        agency2.bookingTickets(sc.nextInt());

    }

}
