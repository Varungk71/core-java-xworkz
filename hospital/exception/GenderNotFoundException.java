package com.xworkz.hospital.exception;

public class GenderNotFoundException extends Exception
{
    public GenderNotFoundException(String genderException)
    {
        System.out.println(genderException);
    }
}
