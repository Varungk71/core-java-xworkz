package com.xworkz.travelapp.bus.impl;

import com.xworkz.travelapp.bus.AbhiBus;



public class VrlImpl implements AbhiBus
{


    @Override
    public int minBooking() {
        return 20;
    }

    @Override
    public boolean goodCondition() {
        return true;
    }
}
