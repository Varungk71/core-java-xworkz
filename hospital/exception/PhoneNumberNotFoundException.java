package com.xworkz.hospital.exception;

public class PhoneNumberNotFoundException extends Exception
{
    public PhoneNumberNotFoundException(String phoneException)
    {
        System.out.println(phoneException);
    }

}
