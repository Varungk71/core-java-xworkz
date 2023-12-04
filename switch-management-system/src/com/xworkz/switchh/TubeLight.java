package com.xworkz.switchh;

public class TubeLight implements Switch{

    @Override
    public void sOn() {
        System.out.println("tube light turned on");
    }

    @Override
    public void sOff() {
        System.out.println("tube light turned off");
    }
}
