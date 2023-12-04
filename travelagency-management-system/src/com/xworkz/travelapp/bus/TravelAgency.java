package com.xworkz.travelapp.bus;

public class TravelAgency
{
    public AbhiBus abhibus;
    String name="srs travels";
    public TravelAgency(AbhiBus abhiBus)
    {
        this.abhibus=abhiBus;
    }

    public boolean bookingTickets(int noOfTickets)
    {
        boolean isBooked=false;
        if (abhibus!=null)
        {
            boolean isConditionGood= this.abhibus.goodCondition();
            if(isConditionGood==true)
            {
                if (noOfTickets<=this.abhibus.minBooking())
                {
                    isBooked=true;

                    System.out.println("number of tickets booked -" + noOfTickets);
                    System.out.println("thank you for booking in " + name);
                }
                else
                {
                    System.out.println("no tickets available");
                }
            }
            else
            {
                System.out.println("bus condition is bad");

            }
        }
        else
        {
            System.out.println("Abhi bus is null, no booking available");
        }


        return isBooked;
    }
}
