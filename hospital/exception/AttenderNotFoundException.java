package com.xworkz.hospital.exception;

public class AttenderNotFoundException extends Exception
{
    public AttenderNotFoundException(String attenderException)
    {
        System.out.println(attenderException);
    }
}
