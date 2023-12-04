package com.xworkz.travelapp.bus.impl;

import com.xworkz.travelapp.bus.AbhiBus;

public class SrsImpl implements AbhiBus {
    @Override
    public int minBooking() {
        return 30;
    }

    @Override
    public boolean goodCondition() {
        return true;
    }
}
